package com.util.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonCheney {

	public static WebDriver driver;
	public static WebDriverWait wait;
	private final static Logger logger = Logger.getLogger(CommonCheney.class);

	public boolean LoginCheney(WebDriver driver, String usernameCBI, String passwordCBI) throws InterruptedException {

		// launch URL for iTrade
		driver.get("http://www.procurement.itradenetwork.com/Platform/Membership/Login");

		Thread.sleep(2000);
		// Wait For Page To Loads

		// pass login credentials
		wait = new WebDriverWait(driver, 30);
		// enter username
		WebElement chb_Username = wait.until(
				ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@id,'username')]"))));
		chb_Username.sendKeys(usernameCBI);

		// enter password
		WebElement chb_Password = wait.until(
				ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@id,'password')]"))));
		chb_Password.sendKeys(passwordCBI);

		driver.findElement(By.xpath("//input[contains(@id,'rememberMe')]")).click();

		// click login
		WebElement btn_Login = wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//input[contains(@value,'Login')]"))));
		btn_Login.click();

		logger.info("Login Successful");

		Thread.sleep(2000);
		// ordering
		WebElement lnk_Ordering = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(.,'Ordering')]"))));
		lnk_Ordering.click();

		Thread.sleep(2000);

		// **** Order Guide / Entire Order Guide Selection ***
		try {
			List<WebElement> allElements = driver
					.findElements(By.xpath("//a[contains(.,'Ordering')]/following-sibling::div/ul/li/*/*/div/a"));
			logger.info(allElements.size());

			for (WebElement element : allElements) {
				logger.info(element.getText());
				if (element.getText().equalsIgnoreCase("Order Guide / Entire Order Guide")
						|| element.getText().equalsIgnoreCase("Order Guides")) {
					String OG_text = element.getText();
					element.click();
					logger.info("Clicked on link - " + OG_text);
					break;
				}

			}
		} catch (Exception e2) {
			e2.printStackTrace();
			logger.info("using URL for Order Guide");
			driver.get("http://www.procurement.itradenetwork.com/Platform/Products/BrowseProducts/Browse");
		}
		// Export grid button to show list
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions
					.elementToBeClickable(driver.findElement(By.xpath("//a[contains(@id,'ExportGridButton')]/span/*"))))
			.click();
			logger.info("Clicked - Export Grid");
		} catch (NoSuchElementException e1) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(@id,'ExportGridButton')]/span/*")).click();
			logger.info("Clicked - Export Grid");
			e1.printStackTrace();
		}

		Thread.sleep(2000);
		// Click on option to select from Export Type
		WebElement lnk_ExportTyp = wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//a[contains(@id,'ExportType')]/span/*"))));
		lnk_ExportTyp.click();

		// choose default type as Excel
		WebElement ddl_Excel = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(.,'Excel')]"))));
		ddl_Excel.click();
		logger.info("format choosen as Excel");
		// div[@id='ExportTypeContainer']/div/ul/li[2]/a/span

		// Thread.sleep(2000);

		// Select columns for OG - Item no., Pack, Brand, Description, Price &
		// caseUom

		try {
			Thread.sleep(2000);
			ArrayList<String> removeColumns = new ArrayList<String>();
			List<WebElement> OG_Col = driver.findElements(By.xpath("//ul[@id='Sortable']/*"));
			logger.info(OG_Col.size());
			String Col_id;
			Iterator<WebElement> iterator = OG_Col.iterator();
			while (iterator.hasNext()) {
				WebElement element = (WebElement) iterator.next();
				Thread.sleep(1000);

				Col_id = element.getAttribute("id");
				if (Col_id.equalsIgnoreCase("Sku") || Col_id.equalsIgnoreCase("DistributorNumber")
						|| Col_id.equalsIgnoreCase("CaseUom") || Col_id.equalsIgnoreCase("UnitOfMeasure")
						|| Col_id.equalsIgnoreCase("CasePack") || Col_id.equalsIgnoreCase("PackDescription")
						|| Col_id.equalsIgnoreCase("Description")|| Col_id.equalsIgnoreCase("ProductDescription")
						|| Col_id.equalsIgnoreCase("BrandName") || Col_id.equalsIgnoreCase("Brand")
						|| Col_id.equals("CatalogProductStatus") || Col_id.equalsIgnoreCase("ProductStatus")
						|| Col_id.equalsIgnoreCase("CasePrice")) {
					logger.info("selected column :- " + Col_id);
				}

				else {
					iterator.remove();
					removeColumns.add(Col_id);
				}
			}

			logger.info(removeColumns.size() + " and " + OG_Col.size());
			Assert.assertEquals(OG_Col.size(), 7);

			for (String column : removeColumns) {
				wait.until(ExpectedConditions
						.elementToBeClickable(driver.findElement(By.xpath("//li[contains(@id,'" + column + "')]"))));// remove
				// column
				driver.findElement(By.xpath("//li[contains(@id,'" + column + "')]/table/tbody/tr/td[2]/img")).click();
				Thread.sleep(3000);
				logger.info("removed column :- " + column);
			} /*
			 * for (int i = 0; i < removeColumns.size(); i++) {
			 * wait.until(ExpectedConditions.elementToBeClickable(
			 * driver.findElement(By.xpath("//li[contains(@id,'" + removeColumns.get(i) +
			 * "')]"))));// remove // column driver.findElement(
			 * By.xpath("//li[contains(@id,'" + removeColumns.get(i) +
			 * "')]/table/tbody/tr/td[2]/img")) .click(); Thread.sleep(3000);
			 * logger.info("removed column :- " + removeColumns.get(i)); }
			 */
		} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		}

		// Click Download Button
		WebElement lnk_Download = wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath("//a[contains(@id,'DownloadButton')]/*/*/*/*/img[@class='rtbIcon']"))));
		lnk_Download.click();

		// Choose Logout option
		WebElement lnk_Logout = wait.until(
				ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(.,'Logout')]"))));
		lnk_Logout.click();

		Thread.sleep(3000);
		return true;
	}

	public boolean LoginCheney(WebDriver driver, String OGName, String usernameCBI, String passwordCBI)
			throws InterruptedException {

		// launch URL for iTrade
		driver.get("http://www.procurement.itradenetwork.com/Platform/Membership/Login");

		Thread.sleep(2000);
		// Wait For Page To Loads

		// pass login credentials
		wait = new WebDriverWait(driver, 30);
		// enter username
		WebElement chb_Username = wait.until(
				ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@id,'username')]"))));
		chb_Username.sendKeys(usernameCBI);

		// enter password
		WebElement chb_Password = wait.until(
				ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@id,'password')]"))));
		chb_Password.sendKeys(passwordCBI);

		driver.findElement(By.xpath("//input[contains(@id,'rememberMe')]")).click();

		// click login
		WebElement btn_Login = wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//input[contains(@value,'Login')]"))));
		btn_Login.click();

		logger.info("Login Successful");

		Thread.sleep(2000);
		// ordering
		WebElement lnk_Ordering = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(.,'Ordering')]"))));
		lnk_Ordering.click();

		Thread.sleep(2000);

		// **** Custom Order Guide Selection ***
		List<WebElement> allElements = driver
				.findElements(By.xpath("//a[contains(.,'Ordering')]/following-sibling::div/ul/li/*/*/div/a"));
		logger.info(allElements.size());
		Thread.sleep(1000);

		for (WebElement element : allElements) {

			if (element.getText().equalsIgnoreCase("Custom Order Guides")) {
				String OG_text = element.getText();
				element.click();
				logger.info("Clicked on link - " + OG_text);
				break;
			}

		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[2]/a[contains(.,'" + OGName + "')]")).click();

		// Thread.sleep(2000);
		// Export grid button to show list
		try {
			driver.findElement(By.xpath("//a[contains(@id,'ExportGridButton')]/span/*")).click();
			logger.info("Clicked - Export Grid");
		} catch (NoSuchElementException e1) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(@id,'ExportGridButton')]/span/*")).click();
			logger.info("Clicked - Export Grid");
			e1.printStackTrace();
		} catch (WebDriverException e) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(@id,'ExportGridButton')]/span/*")).click();
			logger.info("Clicked - Export Grid");
			e.printStackTrace();
		}

		Thread.sleep(1000);
		// Click on option to select from Export Type
		WebElement lnk_ExportTyp = wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//a[contains(@id,'ExportType')]/span/*"))));
		lnk_ExportTyp.click();

		// choose default type as Excel
		WebElement ddl_Excel = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(.,'Excel')]"))));
		ddl_Excel.click();
		logger.info("format choosen as Excel");
		// div[@id='ExportTypeContainer']/div/ul/li[2]/a/span

		Thread.sleep(2000);

		// Select columns for OG - Item no., Pack, Brand, Description, Price &
		// caseUom

		try {
			Thread.sleep(2000);
			ArrayList<String> removeColumns = new ArrayList<String>();
			List<WebElement> OG_Col = driver.findElements(By.xpath("//ul[@id='Sortable']/*"));
			logger.info(OG_Col.size());
			String Col_id;
			Iterator<WebElement> iterator = OG_Col.iterator();
			while (iterator.hasNext()) {
				WebElement element = (WebElement) iterator.next();
				Thread.sleep(1000);

				Col_id = element.getAttribute("id");
				if (Col_id.equalsIgnoreCase("DistributorNumber") || Col_id.equalsIgnoreCase("Pack")
						|| Col_id.equalsIgnoreCase("Brand") || Col_id.equalsIgnoreCase("Description")
						|| Col_id.equalsIgnoreCase("CasePrice") || Col_id.equalsIgnoreCase("CaseUom")) {
					logger.info("selected column :- " + Col_id);
				}

				else {
					iterator.remove();
					removeColumns.add(Col_id);
				}
			}

			logger.info(removeColumns.size() + " and " + OG_Col.size());
			Assert.assertEquals(OG_Col.size(), 6);

			for (int i = 0; i < removeColumns.size(); i++) {
				WebElement ll_removeCol = wait.until(ExpectedConditions.visibilityOf(driver.findElement(
						By.xpath("//li[contains(@id,'" + removeColumns.get(i) + "')]/table/tbody/tr/td[2]/img"))));// remove
				// column
				ll_removeCol.click();
				logger.info("removed column :- " + removeColumns.get(i));
				Thread.sleep(3000);
			}

		} catch (StaleElementReferenceException e) {

			e.printStackTrace();
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		}

		// Click Download Button
		WebElement lnk_Download = wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//a[contains(@id,'DownloadButton')]"))));
		lnk_Download.click();

		// Choose Logout option
		WebElement lnk_Logout = wait.until(
				ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(.,'Logout')]"))));
		lnk_Logout.click();

		Thread.sleep(5000);

		return true;

	}

}
