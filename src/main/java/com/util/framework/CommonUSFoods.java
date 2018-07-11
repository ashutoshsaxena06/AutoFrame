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

public class CommonUSFoods {
	static final int maxtry = 3;
	static int retry = 0;
	public static WebElement OrderGuide;
	public static WebElement Options;
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String url = "https://www3.usfoods.com/order/faces/oracle/webcenter/portalapp/pages/login.jspx";
	public static CommonUSFoods com;
	public static String listUrl = "https://www3.usfoods.com/order/faces/oracle/webcenter/portalapp/pages/lists/myLists.jspx?";

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		CommonUSFoods.driver = driver;
	}

	// login page
	// username

	@FindBy(xpath = ".//*[@id='it9::content']")
	WebElement txt_UserName;

	// password
	@FindBy(xpath = ".//*[@id='it1::content']")
	WebElement txt_Password;

	// login button
	@FindBy(xpath = ".//*[@id='cb1']")
	WebElement btn_Submit;

	// home page
	// List - to use for order
	@FindBy(xpath = ".//*[@id='dgfSPT:pt_i3:0:pt_sfm1:pt_cil7']")
	WebElement li_ListIcon;

	// List selection
	public void setOrderGuide(String OGName) {
		WebElement OrderGuide = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/..//a[contains(.,'" + OGName + "')]")));
		// By.xpath("//div[@class='x2ml dropDownMenu-UtilityMenu
		// x1a']/*/*/*/a[contains(.,'" + OGName + "')]"))); //
		// div[@id='r1:0:pt1:pt_i3:0:pt_sfm1:pt_pgl44']
		CommonUSFoods.OrderGuide = OrderGuide;
	}

	public void setOptions(String OGName) {
		WebElement OrderGuide = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'" + OGName
				+ "')]/ancestor::td[2]/following-sibling::td/..//a[contains(.,'Options')]")));
		// By.xpath("//div[@class='x2ml dropDownMenu-UtilityMenu
		// x1a']/*/*/*/a[contains(.,'" + OGName + "')]"))); //
		// div[@id='r1:0:pt1:pt_i3:0:pt_sfm1:pt_pgl44']
		CommonUSFoods.OrderGuide = OrderGuide;
	}

	// download
	@FindBy(xpath = ".//*[@id='r1:0:pt1:cil4']/span")
	WebElement lnk_Download;
	// Download icon
	@FindBy(xpath = "//td/*[@id='r1:0:pt1:cil15']/img")
	WebElement btn_ListIcon;

	// Download icon
	@FindBy(xpath = "//*[@id='dgfSPT:pt_ot4']/span")
	WebElement lnk_accountName;

	// list of accounts
	@FindBy(xpath = "//div[@id='dgfSPT:pt_pgl117']/*")
	WebElement li_Accounts;

	// Download pop-up
	// FileName
	@FindBy(xpath = ".//*[@id='r1:0:pt1:r3:0:it1::content']")
	WebElement txt_FileName;

	// Format
	@FindBy(xpath = ".//*[@id='r1:0:pt1:r3:0:soc4']/..//div[(text()='PDF')]")
	WebElement txt_Format;

	// Format
	@FindBy(xpath = ".//*[@id='r1:0:pt1:r3:0:soc4']/..//div/a")
	WebElement lnk_FormatSelectIcon;

	// Download button
	@FindBy(xpath = ".//*[@id='r1:0:pt1:r3:0:cb3']")
	WebElement btn_download;

	// format to CSV
	@FindBy(xpath = ".//*[@id='r1:0:pt1:r3:0:soc4']/..//div/ul/li/a[text()='PDF']")
	WebElement lnk_FormatSelectPDF;

	// format to CSV
	@FindBy(id = "dgfSPT:pt_cl21")
	WebElement btn_SignOut;

	public CommonUSFoods() {
		PageFactory.initElements(getDriver(), this);
	}

	public Boolean startUSF(String listname, String account, String username, String password)
			throws InterruptedException {
		// driver = RandomAction.openBrowser("Chrome",
		// "C:\\Users\\my\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
		com = new CommonUSFoods();
		wait = new WebDriverWait(getDriver(), 30);

		try {
			com.login(username, password);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Login Failed ! ");
			return false;
		}

		try {
			Thread.sleep(3000);

			if (!account.isEmpty() && account != null) {
				changeAccount(account);
			} else {
				System.out.println("account change not required");
			}

			clickList(listname);

			Thread.sleep(5000);
			// pop-up
			downloadFile(listname + "-" + RandomAction.getDate());

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to download file");
			return false;
		} finally {
			try {
				com.btn_SignOut.click();
			} catch (Exception e2) {
				System.out.println("not able to Logout successfully !");
			}
		}

	}

	public void changeAccount(String account) {
		wait.until(ExpectedConditions.visibilityOf(lnk_accountName));
		String currentAccountName = lnk_accountName.getText();
		if (!currentAccountName.contains(account)) {
			chooseAccount(account);
		} else {
			System.out.println("required account already selected !");
		}
	}

	public void login(String username, String password) throws InterruptedException {
		driver.get(url);
		while (retry < maxtry) {
			if (!driver.getCurrentUrl().contains("www3.usfoods.com")) {
				Thread.sleep(3000);
			} else {
				break;
			}
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		WebElement userName = wait.until(ExpectedConditions.visibilityOf(com.txt_UserName));
		userName.sendKeys(username);
		WebElement pwd = wait.until(ExpectedConditions.visibilityOf(com.txt_Password));
		pwd.sendKeys(password);
		WebElement submit = wait.until(ExpectedConditions.visibilityOf(com.btn_Submit));
		submit.click();
	}

	public void clickList(String listname) throws InterruptedException {
		Actions act = new Actions(driver);
		// WebElement listIcon =
		// wait.until(ExpectedConditions.visibilityOf(com.li_ListIcon));
		// act.moveToElement(listIcon).build().perform();
		driver.get(listUrl);
		com.setOrderGuide(listname);
		if (CommonUSFoods.OrderGuide.getText().equalsIgnoreCase(listname)) {
			setOptions(listname);
			Options.click();
			act.moveToElement(lnk_Download).click();
		} else {
			System.out.println("OrderGuide name not found on list download page");
		}
		// CommonUSFoods.OrderGuide.click();
		// Thread.sleep(5000);
		// WebElement ListBtn =
		// wait.until(ExpectedConditions.elementToBeClickable(com.btn_ListIcon));
		// act.moveToElement(ListBtn).build().perform();
		// act.click().perform();
		// // System.out.println(ListBtn.getText());
		// Thread.sleep(5000);
	}

	public void downloadFile(String filename) {
		WebElement In_filename = wait.until(ExpectedConditions.visibilityOf(com.txt_FileName));
		In_filename.sendKeys(filename);
		if (!wait.until(ExpectedConditions.visibilityOf(com.txt_Format)).getText().equalsIgnoreCase("PDF")) {
			wait.until(ExpectedConditions.visibilityOf(com.lnk_FormatSelectIcon)).click();
			wait.until(ExpectedConditions.visibilityOf(com.lnk_FormatSelectPDF)).click();
		}
		wait.until(ExpectedConditions.visibilityOf(com.btn_download)).click();
	}

	public void chooseAccount(String account) {
		WebElement accountSelect = wait.until(ExpectedConditions.elementToBeClickable(
				(By.xpath("//div[@id='dgfSPT:pt_pgl117']/div/ .. //span[contains(.,'" + account + "')]"))));
		accountSelect.click();
		System.out.println("select account - " + account);
	}
}
