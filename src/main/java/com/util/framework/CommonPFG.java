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
	public static Actions act;

	public WebDriver getDriver() {
		return this.driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	// username
	@FindBy(xpath = "//form/div/div/input[@name='UserName']")
	WebElement txt_Username;
	@FindBy(xpath = "//form/div/div/input[@name='Password']")
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
	@FindBy(xpath = "//iframe[@class='bigrounded']")
	WebElement popUp_SelectGuide;
	// @FindBy(xpath="iframe = id= 'Custom-iFrame0')WebElement txt_Username;
	@FindBy(xpath = "//*[@id='pagemenuli-adv']/a") // form/table/*/*/*/*/*/tr[2]/*/*/*/*/a
	WebElement lnk_advanced;
	@FindBy(xpath = "//*[@id='pagemenu-price']/a/span[contains(.,'Display Prices')]")
	WebElement lnk_displayPrices;
	@FindBy(xpath = "//*[@id='pagemenuli-export']/a/span[text()='Export']")
	WebElement lnk_Export;
	@FindBy(xpath = "//*[@id='pagemenu-export3']/a/span[contains(.,'Excel')]")
	WebElement lnk_Excel;
	@FindBy(xpath = "//*[@id='globalToolbar']/table/tbody/tr/td[2]/span[1]")
	WebElement hdr_Text;
	@FindBy(xpath = "//span[@class='globalButtonBar']/*[@title='Sign Off']")
	WebElement txt_SignOff;

	public CommonPFG() {
		PageFactory.initElements(getDriver(), this);
	}

	public Boolean startPFG(String listname, String username, String password) throws InterruptedException {
		// public static void main(String[] args) {
		// String listname = "OG030118";
		// String username = "46084";
		// String password = "gilberts";
		// String path = System.getProperty("user.home") +
		// "\\Downloads\\chromedriver_win32\\chromedriver.exe";
		// driver = RandomAction.openBrowser("chrome", path);
		// setDriver(driver);
		com = new CommonPFG();
		wait = new WebDriverWait(driver, 30);
		try {
			com.login(username, password);
			System.out.println("Login success !");
		} catch (Exception e) {
			System.err.println("Login Failed ! ");
			e.printStackTrace();
			return false;
		}

		try {
			if (RandomAction.isAlertPresent()) {
				RandomAction.acceptAlert();
			}
			Thread.sleep(5000);

			// do {
			com.clickList(listname);
			// Thread.sleep(5000);
			// try {
			// String header = com.lnk_advanced.getText();
			// System.out.println(header);
			// break;
			// } catch (Exception e) {
			// com.retry++;
			// if (com.retry == maxtry) {
			// System.out.println("Order guide not clicked .. ");
			// throw new AutomationException("Order guide list not clicked .. ", 101);
			// }
			// System.out.println("retrying to click on OG .. ");
			// }
			// } while (com.retry < maxtry);

			System.out.println("Order guide clicked ..");
			// pop-up
			Thread.sleep(5000);
			com.downloadFile();

			return true;
		} catch (Exception e) {
			System.err.println("Failed to download file");
			e.printStackTrace();
			return false;
		} finally {
			// try {
			// Thread.sleep(20000);
			// act.release();
			// act.moveToElement(com.txt_SignOff);
			// com.txt_SignOff.click();
			// if (RandomAction.isAlertPresent()) {
			// RandomAction.acceptAlert();
			// }
			// } catch (Exception e) {
			// System.err.println("not able to Logout successfully !");
			// e.printStackTrace();
			// }
			System.out.println("Finally executed");
		}
	}

	private void downloadFile() throws InterruptedException {
		act = new Actions(driver);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='ContentFrame']"))));
		driver.switchTo().frame("ContentFrame");
        Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(lnk_advanced));
		lnk_advanced.click();
		wait.until(ExpectedConditions.elementToBeClickable(lnk_displayPrices));
		lnk_displayPrices.click();
		// act.moveToElement(lnk_advanced).click(lnk_displayPrices).build().perform();
		System.out.println("Clicked on display prices");
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(lnk_advanced));
		lnk_advanced.click();
		wait.until(ExpectedConditions.elementToBeClickable(lnk_Export));
		lnk_Export.click();
		act.moveToElement(lnk_advanced).moveToElement(lnk_Export).click(lnk_Excel).build().perform();
	}

	private void clickList(String listname) throws InterruptedException {
		act = new Actions(driver);
		wait.until(ExpectedConditions.elementToBeClickable(lnk_Reports));
		lnk_Reports.click();
		wait.until(ExpectedConditions.elementToBeClickable(lnk_Guides));
		lnk_Guides.click();
		if (!listname.equalsIgnoreCase("History")) {
			while (retry < maxtry) {
				act.moveToElement(lnk_Reports).moveToElement(lnk_Guides).click(txt_CustomGuides).build().perform();
				Thread.sleep(2000);
				if (checkPopUpDisplay()) {
					break;
				}
			}
			WebElement OG = driver
					.findElement(By.xpath("//form[@name='ItemCopy']/..//td/a[contains(.,'" + listname + "')]"));
			// WebElement OG = OGelement(listname);
			System.out.println("selected Order guide .. " + OG.getText());
			OG.click();
		} else {
			act.moveToElement(lnk_Reports).moveToElement(lnk_Guides).click(lnk_History).build().perform();
			System.out.println("");
		}

	}

	private boolean checkPopUpDisplay() {
		try {
			popUp_SelectGuide.isDisplayed();
			driver.switchTo().frame(1);
			System.out.println("switched to frame 1");
			driver.switchTo().frame("Custom-iFrame0");
			System.out.println("Switched to content frame");
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
