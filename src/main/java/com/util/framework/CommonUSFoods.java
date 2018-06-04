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

	public static WebElement OrderGuide;
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String url = "https://www3.usfoods.com/order/faces/oracle/webcenter/portalapp/pages/login.jspx";
	CommonUSFoods com;

	// login page
	// username
	
	@FindBy(xpath = ".//*[@id='it9::content']")
	static WebElement txt_UserName;
	// password
	
	@FindBy(xpath = ".//*[@id='it1::content']")
	static WebElement txt_Password;

	// login button
	@FindBy(xpath =
			".//*[@id='cb1']")
	static WebElement btn_Submit;

	// home page
	// List - to use for order
	@FindBy(xpath = ".//*[@id='dgfSPT:pt_i3:0:pt_sfm1:pt_cil7']")
	static WebElement li_ListIcon;

	// List selection
	public void setOrderGuide(String OGName) {
		WebElement OrderGuide = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x2ml dropDownMenu-UtilityMenu x1a']/*/*/*/a[contains(.,'"+ OGName +"')]"))); //div[@id='r1:0:pt1:pt_i3:0:pt_sfm1:pt_pgl44']
		CommonUSFoods.OrderGuide = OrderGuide;
	}

	// Download icon
	@FindBy(xpath = "//td/*[@id='r1:0:pt1:cil15']/span")
	static WebElement btn_ListIcon;

	// Download pop-up
	// FileName
	@FindBy(xpath = ".//*[@id='r1:0:pt1:r5:0:it1::content']")
	static WebElement txt_FileName;

	// Format
	@FindBy(xpath = ".//*[@id='r1:0:pt1:r5:0:soc4']/..//div[(text()='CSV')]")
	WebElement txt_Format;
	
	// Format
	@FindBy(xpath = ".//*[@id='r1:0:pt1:r5:0:soc4']/..//div/a")
	WebElement lnk_FormatSelectIcon;
	
	// Download button
	@FindBy(xpath = ".//*[@id='r1:0:pt1:r5:0:cb3']")
	static WebElement btn_download;
	
	// format to CSV
	@FindBy(xpath = ".//*[@id='r1:0:pt1:r5:0:soc4']/..//div/ul/li/a[text()='CSV']")
	WebElement lnk_FormatSelectCSV;
	
	// format to CSV
	@FindBy(id="dgfSPT:pt_cl21")
	WebElement btn_SignOut;
			
	public  CommonUSFoods(WebDriver driver) {
		CommonUSFoods.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public Boolean startUSF (String listname, String username, String password) throws InterruptedException {
//		driver = RandomAction.openBrowser("Chrome", "C:\\Users\\my\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
		com = new CommonUSFoods(driver);
		wait = new WebDriverWait(driver, 10);
		
		try {
			login(username, password);
		}catch (Exception e) {
		e.printStackTrace();
		System.out.println("Login Failed ! ");
		return false;
		}
		
		try {
			Thread.sleep(3000);
			
			clickList(listname);
			
			Thread.sleep(5000);
			// pop-up
			downloadFile(listname+"-"+ RandomAction.getDate());
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to download file");
			return false;
		}finally {
			try {
				com.btn_SignOut.click();
			} catch (Exception e2) {
				System.out.println("not able to Logout successfully !");
			}
		}
		
	}

	public void login(String username, String password) throws InterruptedException {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		CommonUSFoods.txt_UserName.sendKeys(username);
		CommonUSFoods.txt_Password.sendKeys(password);
		CommonUSFoods.btn_Submit.click();		
	}
	
	public void clickList(String listname) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(CommonUSFoods.li_ListIcon).build().perform();
		com.setOrderGuide(listname);
		CommonUSFoods.OrderGuide.click();
		Thread.sleep(5000);
		act.moveToElement(btn_ListIcon).build().perform();
		System.out.println(btn_ListIcon.getText());
		Thread.sleep(5000);
		CommonUSFoods.btn_ListIcon.click();
	}
	
	public void downloadFile(String filename) {
		CommonUSFoods.txt_FileName.sendKeys(filename);
		if (!com.txt_Format.getText().equalsIgnoreCase("CSV")) {
			com.lnk_FormatSelectIcon.click();
			com.lnk_FormatSelectCSV.click();
		}
		
		CommonUSFoods.btn_download.click();
	}

}
