package com.util.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPFG {

	static final int maxtry = 3;
	int retry = 0;
	public static WebElement OrderGuide;
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String url = "https://eastern5.onlinefoodservice.com/pnet/eOrderServlet";
	public static CommonPFG com;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		CommonUSFoods.driver = driver;
	}

	// username
	@FindBy(xpath = "//input[@name='UserName']")
	WebElement txt_Username;
	@FindBy(xpath = "//input[@name='Password']")
	WebElement txt_Password;
	@FindBy(xpath = "//button[@name='SubmitBtn']")
	WebElement btn_SubmitBtn;
	@FindBy(xpath = "//*[@id='mainmenuli-report']/a/span[text()='Reports']")
	WebElement lnk_Reports;
	@FindBy(xpath = "//*[@id='mainmenuli-report05']/a/span[text()='Guides']")
	WebElement lnk_Guides;
	@FindBy(xpath = "//*[@id='mainmenu-historyreport']/a/span[text()='History']")
	WebElement lnk_History;
	@FindBy(xpath = "//*[@id='mainmenuli-reportBids']/a/span[text()='Bids']")
	WebElement lnk_Bids;
	@FindBy(xpath = "//*[@id='mainmenu-Bidreport0']/a/span[1]")
	WebElement a_BidsOptions;
	@FindBy(xpath = "//*[@id='mainmenu-report0502']/a/span[text()='Custom Guides']")
	WebElement txt_CustomGuides;
	@FindBy(xpath = "//*[@id='wizardheader']")
	WebElement popUp_SelectGuide;
	// @FindBy(xpath="iframe = id= 'Custom-iFrame0')WebElement txt_Username;
	@FindBy(xpath = "//*[@id='agemenuli-adv']/a/span[text()='Advanced']")
	WebElement lnk_advanced;
	@FindBy(xpath = "//*[@id='pagemenu-price']/a/span[text()='Display Prices']")
	WebElement lnk_displayPrices;
	@FindBy(xpath = "//*[@id='pagemenuli-export']/a/span[text()='Export']")
	WebElement lnk_Export;
	@FindBy(xpath = "//*[@id='pagemenu-export3']/a/span[contains(.,'Excel')]")
	WebElement lnk_Excel;
	@FindBy(xpath = "//*[text()='Sign Off']")
	WebElement txt_SignOff;

	public CommonPFG() {
		PageFactory.initElements(getDriver(), this);
	}

	public Boolean startPFG(String listname, String username, String password) throws InterruptedException {
		com = new CommonPFG();
		wait = new WebDriverWait(getDriver(), 30);

		try {
			com.login(username, password);
		} catch (Exception e) {
			System.err.println("Login Failed ! ");
			e.printStackTrace();
			return false;
		}

		try {
			Thread.sleep(3000);

			clickList(listname);

			Thread.sleep(5000);
			// pop-up
			downloadFile();
			
			return true;
			
		} catch (Exception e) {
			System.err.println("Failed to download file");
			e.printStackTrace();
			return false;
		} finally {
			try {
				com.txt_SignOff.click();
			} catch (Exception e2) {
				System.err.println("not able to Logout successfully !");
			}
		}
	}

	private void downloadFile() {
		Actions act = new Actions(driver);
		act.moveToElement(lnk_advanced).moveToElement(lnk_displayPrices).click().build().perform();
		act.moveToElement(lnk_advanced).moveToElement(lnk_Excel).click().build().perform();
	}

	private void clickList(String listname) throws InterruptedException {
		Actions act = new Actions(driver);
		if (!listname.equalsIgnoreCase("History")) {
			while (retry < maxtry) {
				act.moveToElement(lnk_Reports).moveToElement(lnk_Guides).click(txt_CustomGuides).build().perform();
				Thread.sleep(3000);
				if (checkPopUpDisplay()) {
					break;
				}
			}
			WebElement OG = OGelement(listname);
			OG.click();
			System.out.println("selected Order guide .. " + OG.getText());
		} else {
			act.moveToElement(lnk_Reports).moveToElement(lnk_Guides).click(lnk_History).build().perform();
		}

	}

	private boolean checkPopUpDisplay() {
		try {
			popUp_SelectGuide.isDisplayed();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Pop Up for selction of OG not displayed");
			return false;
		}
	}

	public void login(String username, String password) throws InterruptedException {
		driver.get(url);
		while (retry < maxtry) {
			if (!driver.getCurrentUrl().contains("onlinefoodservice.com")) {
				Thread.sleep(3000);
			} else {
				break;
			}
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		WebElement userName = wait.until(ExpectedConditions.visibilityOf(txt_Username));
		userName.sendKeys(username);
		WebElement pwd = wait.until(ExpectedConditions.visibilityOf(txt_Password));
		pwd.sendKeys(password);
		WebElement submit = wait.until(ExpectedConditions.visibilityOf(btn_SubmitBtn));
		submit.click();
	}

	public WebElement OGelement(String listname) {
		WebElement lnk_OG = wait.until(ExpectedConditions.elementToBeClickable(
				(By.xpath("//*[class='wizardtablecontainer']/table/tbody/tr/td/a[text()='" + listname + "']"))));
		return lnk_OG;
	}
}
