package com.util.framework;

public class TestCheneyOnline extends CommonCheney {
//	private WebDriver driver;
//
//	@BeforeClass
//	public void setup() {
//		System.out.println("*************Cheney************");
//	}
//
//	@AfterClass
//	public void AfterClass() {
//		System.out.println("************End***********");
//	}
//
//	@BeforeMethod
//	public void beforeTest() {
//		System.out.println("***********StartTest*********");
//		PageAction.deleteFiles("C:\\Users\\Edge\\Downloads");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized");
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Edge\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver(options);
//
//	}
//
//	@AfterMethod
//	public void pretearDown() {
//		if (driver != null) {
//			driver.quit();
//			System.out.println("*******EndTest*********");
//		}
//	}
//
//	@Test(priority = 1)
//	public void Dada_Cheney() throws InterruptedException {
//		System.out.println("1, Dada_Cheney");
//		// check if login is success
//		LoginCheney(driver, "025991-00CBI", "Dada2599");
//		// Thread.sleep(2000);
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney", "Dada of Delray");
//	}
//
//	@Test(priority = 2)
//	public void House_Cheney() throws InterruptedException {
//		System.out.println("2, House_Cheney");
//		// check if login is success
//		LoginCheney(driver, "60030538CBI", "Hkab3053");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney", "House T&K");
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "Town Kitchen & Bar");
//	}
//
//	@Test(priority = 3)
//	public void Howleys_Cheney() throws InterruptedException {
//		System.out.println("3, Howleys_Cheney");
//		// check if login is success
//		LoginCheney(driver, "046348-00CBI", "Howl6348");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney", "Howleys Restaurant");
//	}
//
//	@Test(priority = 4)
//	public void Boynton_Cheney() throws InterruptedException {
//		System.out.println("4, Boynton_Cheney");
//		// check if login is success
//		LoginCheney(driver, "011171-01CBI", "Pasta4930");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "Agliolio Boynton Italian Bistro & Bar");
//	}
//
//	@Test(priority = 5)
//	public void Wellington_Cheney() throws InterruptedException {
//		System.out.println("5, Wellington_Cheney");
//		// check if login is success
//		LoginCheney(driver, "011170-01CBI", "Fresh3847");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "Agliolio Wellington Fresh Pasta & Wine");
//	}
//
//	@Test(priority = 6)
//	public void CafeHeavenly_Cheney() throws InterruptedException {
//		System.out.println("6, CafeHeavenly_Cheney");
//		// check if login is success
//		LoginCheney(driver, "043074-00CBI", "ChardoggyCBI1");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadedsg
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "Cafe Heavenly");
//	}
//
//	@Test(priority = 7)
//	public void Oceans234_Cheney() throws InterruptedException {
//		System.out.println("7, Oceans234_Cheney");
//		// check if login is success
//		LoginCheney(driver, "067633-00CBI", "Ocea6330");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// System.out.println();
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "Oceans 234");
//	}
//
//	@Test(priority = 8)
//	public void ShulaBurgerKendall_Cheney() throws InterruptedException {
//		System.out.println("8, ShulaBurgerKendall_Cheney");
//		// check if login is success
//		LoginCheney(driver, "Shula Burger Kendall 02-27-17", "084348-01CBI", "Shula4801");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "Shula Burger Kendall");
//	}
//
//	@Test(priority = 9)
//	public void ShulaBurgerPC_Cheney() throws InterruptedException {
//		System.out.println("9, ShulaBurgerPC_Cheney");
//		// check if login is success
//		LoginCheney(driver, "Custom Guide", "60023492CBI", "Sbpc2349");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney", "Shula Burger PC");
//	}
//
//	@Test(priority = 10)
//	public void TrumpIntl_Cheney() throws InterruptedException {
//		System.out.println("10, TrumpIntl_Cheney");
//		// check if login is success
//		LoginCheney(driver, "092233-00cbi", "Trump00");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "Trump International Beach Resort");
//	}
//
//	@Test(priority = 11)
//	public void TrumpNational_Cheney() throws InterruptedException {
//		System.out.println("11, TrumpNational_Cheney");
//		// check if login is success
//		LoginCheney(driver, "092280-00cbi", "Trump9228");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "Trump National Golf Club");
//	}
//
//	@Test(priority = 12)
//	public void Wycliff_Cheney() throws InterruptedException {
//		System.out.println("12, Wycliff_Cheney");
//		// check if login is success
//		LoginCheney(driver, "098697-01CBI", "Wycliffe4650");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "Wycliffe Golf & Country Club");
//	}
//
////	@Test(priority = 13)
////	public void BocaLago_Cheney() throws InterruptedException {
////		System.out.println("13, BocaLago_Cheney");
////		// check if login is success
////		LoginCheney(driver, "016236-01CBI", "BL16236");
////		// check the flow to exports
////		// StepsToExportCheney(driver);
////		// rename downloadeds
////		// String CurrentPath = RandomAction.setdownloadDir();
////		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
////		SendMailSSL.sendMailAction("Cheney Brothers", "Boca Lago Country Club");
////	}
//
//	@Test(priority = 14)
//	public void Woodfield_Cheney() throws InterruptedException {
//		System.out.println("14, Woodfield_Cheney");
//		// check if login is success
//		LoginCheney(driver, "098657-01CBI", "Wood2003");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney Brothers Inc, Hybrid", "Woodfield Country Club");
//	}
//
//	@Test(priority = 15)
//	public void ConchRep_Cheney() throws InterruptedException {
//		System.out.println("15, ConchRep_Cheney");
//		// check if login is success
//		LoginCheney(driver, "022965-00CBI", "Republic1");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney Brothers, Inc", "The Conch Republic");
//	}
//
//	// @Test(priority = 16)
//	// public void KeeGrill_Cheney() throws InterruptedException {
//	//
//	// LoginCheney(driver, "60008181CBI", "Kegr8181");
//	// // check the flow to exports
//	// // StepsToExportCheney(driver);
//	// // rename downloadeds
//	// // String CurrentPath = RandomAction.setdownloadDir();
//	// // File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//	// SendMailSSL.sendMailAction("Cheney - Offline GP", "Kee Grill
//	// Restaurant");
//	// }
//
////	@Test(priority = 17)
////	public void Lucilles_Cheney() throws InterruptedException {
////
////		LoginCheney(driver, "60021442CBI", "Lbbq2144");
////		// check the flow to exports
////		// StepsToExportCheney(driver);
////		// rename downloadeds
////		// String CurrentPath = RandomAction.setdownloadDir();
////		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
////		SendMailSSL.sendMailAction("Cheney Brothers Inc, Offline", "Lucille's BBQ");
////	}
//
//	@Test(priority = 18)
//	public void SamHudsonBeachBar_Cheney() throws InterruptedException {
//		System.out.println("18, SamHudsonBeachBar_Cheney");
//		// check if login is success
//		LoginCheney(driver, "080210-00CBI", "Sam80210");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "Sams Hudson Beach Bar");
//	}
//
//	@Test(priority = 19)
//	public void BigBite_Cheney() throws InterruptedException {
//		System.out.println("19, BigBite_Cheney");
//		// check if login is success
//		LoginCheney(driver, "60010748CBI", "Bagd748");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "Big Bite Bagel");
//	}
//
//	@Test(priority = 20)
//	public void GUMBY_Cheney() throws InterruptedException {
//		System.out.println("19, GUMBY_Cheney");
//		// check if login is success
//		LoginCheney(driver, "039804-01CBI", "Chance1");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "Gumby's Pizza");
//	}
//
//	// @Test(priority = 18)
//	// public void OrangeBlossom_Cheney() throws InterruptedException {
//	// System.out.println("18, Sam80210");
//	// // check if login is success
//	// LoginCheney(driver, "60008022CBI", "FMK123");
//	// // check the flow to exports
//	// // StepsToExportCheney(driver);
//	// // rename downloadeds
//	// // String CurrentPath = RandomAction.setdownloadDir();
//	// SendMailSSL.sendMailAction("Cheney - Offline GP", "Orange Blossom
//	// Hills");
//	// }
//
//	// @Test(priority = 21)
//	// public void LucillesBoynton_Cheney() throws InterruptedException {
//	//
//	// System.out.println("21, LucillesBoynton_Cheney");
//	// LoginCheney(driver, "60007645CBI", "Lucilleseast1");
//	// // check the flow to exports
//	// // StepsToExportCheney(driver);
//	// // rename downloadeds
//	// // String CurrentPath = RandomAction.setdownloadDir();
//	// // File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//	// SendMailSSL.sendMailAction("Cheney Brothers Inc, Offline", "Lucille's
//	// BBQ-East Boynton");
//	// }
//	//
//
//	@Test(priority = 22)
//	public void Evans_Cheney() throws InterruptedException {
//
//		System.out.println("22, Evans_Cheney");
//		LoginCheney(driver, "013919-00CBI", "Evans01");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "Evans Prairie CC");
//	}
//
//	@Test(priority = 23)
//	public void Ibis_Club_Cheney() throws InterruptedException {
//
//		System.out.println("23, Ibis_Club_Cheney");
//		LoginCheney(driver,"CLUB 2017", "047507-01cbi", "Badger1");
//		// check the flow to exports
//		// StepsToExportCheney(driver);	
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "The Club at Ibis - Club");
//	}
//
//	@Test(priority = 24)
//	public void Ibis_Golf_Cheney() throws InterruptedException {
//
//		System.out.println("24, Ibis_Golf_Cheney");
//		LoginCheney(driver,"GOLF 2017", "047507-02cbi", "Badger2");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "The Club at Ibis - Golf");
//	}
//
//	@Test(priority = 25)
//	public void Ibis_Tennis_Cheney() throws InterruptedException {
//
//		System.out.println("25, Ibis_Tennis_Cheney");
//		LoginCheney(driver,"TENNIS 2017","047507-03cbi", "Badger3");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "The Club at Ibis - Tennis");
//	}
//
//	@Test(priority = 26)
//	public void Ibis_GolfMaint_Cheney() throws InterruptedException {
//
//		System.out.println("26, Ibis_GolfMaint_Cheney");
//		LoginCheney(driver,"GCM 2017", "047507-04cbi", "Badger4");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "The Club at Ibis - GolfMaint");
//	}
//
//	@Test(priority = 27)
//	public void Ibis_Bistro_Cheney() throws InterruptedException {
//
//		System.out.println("27, Ibis_Bistro_Cheney");
//		LoginCheney(driver,"BISTRO 2017", "047507-05cbi", "Badger5");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "The Club at Ibis - Bistro");
//	}
//
//	@Test(priority = 28)
//	public void Mizner_Cheney() throws InterruptedException {
//
//		System.out.println("28, Mizner_Cheney");
//		LoginCheney(driver, "065294-01CBI", "Grocery15");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "Mizner Country Club");
//	}
//	
//	@Test(priority = 29)
//	public void SQ1_Cheney() throws InterruptedException {
//
//		System.out.println("28, SQ1_Cheney");
//		LoginCheney(driver, "60036371CBI", "SQ16371");
//		// check the flow to exports
//		// StepsToExportCheney(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		SendMailSSL.sendMailAction("Cheney - Offline GP", "SQ1");
//	}
}
