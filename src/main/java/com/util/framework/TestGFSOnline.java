package com.util.framework;

public class TestGFSOnline extends CommonGFS {
/*
	@BeforeClass
	public void setup() {
		System.out.println("*************GFS************");

	}

	@AfterClass
	public void AfterClass() {
		System.out.println("************End***********");
	}

	@BeforeMethod
	public void beforeTest() throws InterruptedException {
		System.out.println("***********StartTest*********");
		RandomAction.deleteFiles("C:\\Users\\Edge\\Downloads");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Edge\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(options);
	}

	@AfterMethod
	public void pretearDown() {
		if (driver != null) {
			driver.quit();
			System.out.println("*******EndTest*********");

		}
	}

	@Test(priority = 1)
	public void Espositos_GFS() throws InterruptedException, MessagingException {

		System.out.println("1, Espositos_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "jlay11", "pizza123"));
		// check the flow to export
		StepsToExport(driver);

		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Espositos Pizza");
	}

// removed as per Dawn on 15-10-2017
//	@Test(priority = 2)
//	public void Liguoris_GFS() throws InterruptedException {
//
//		System.out.println("2, Liguoris_GFS ");
//
//		Assert.assertTrue(LoginGFS(driver, "jlay11", "pizza123"));
//		// check the flow to export
//		StepsToExport(driver);
//		// rename downloadeds
//		// String CurrentPath = RandomAction.setdownloadDir();
//		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
//		// -- send big pink files to Liguoris
//		SendMailSSL.sendMailAction("GFS - Offline GP", "Liguori's Fired Up");
//	}

	@Test(priority = 3)
	public void Gilberts_GFS() throws InterruptedException {

		System.out.println("3 , Gilberts_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "rlebrun", "Gilberts1"));
		// check the flow to export
		StepsToExport(driver);
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Gilberts Resort");
	}

	@Test(priority = 4)
	public void OldKeyLime_GFS() throws InterruptedException {

		System.out.println("4 , OldKeyLime_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "amyholt", "oklh1889"));
		// check the flow to export
		StepsToExport(driver);
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Old Key Lime House");

	}

	// @Test(priority = 5)
	// public void SportsGrillSunset_GFS() throws InterruptedException {
	//
	// System.out.println("5 , SportsGrillSunset_GFS ");
	//
	// // check if login is success
	// Assert.assertTrue(LoginGFS(driver, "Sgsunset", "sports1"));
	// // check the flow to export
	// StepsToExport(driver);
	// // rename downloadeds
	// // String CurrentPath = RandomAction.setdownloadDir();
	// // File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
	// SendMailSSL.sendMailAction("GFS - Offline GP", "Sports Grill Sunset");
	// }

	@Test(priority = 6)
	public void SportsGrillKendall_GFS() throws InterruptedException {

		System.out.println("6 , SportsGrillKendall_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "sgkendall", "sports1"));
		// check the flow to export
		StepsToExport(driver);
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Sports Grill");
		SendMailSSL.sendMailAction("GFS - Offline GP", "Sports Grill Corporate");

	}

	// @Test(priority = 7)
	// public void SportsGrillPembroke_GFS() throws InterruptedException {
	//
	// System.out.println("7 , SportsGrillPembroke_GFS ");
	//
	// // check if login is success
	// Assert.assertTrue(LoginGFS(driver, "sgpembroke", "sports1"));
	// // check the flow to export
	// StepsToExport(driver);
	// // rename downloadeds
	// // String CurrentPath = RandomAction.setdownloadDir();
	// // File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
	// SendMailSSL.sendMailAction("GFS - Offline GP", "Sports Grill Pembroke
	// Pines");
	// }
	//
	// @Test(priority = 8)
	// public void SportsGrillPalmetto_GFS() throws InterruptedException {
	//
	// System.out.println("8 , SportsGrillPalmetto_GFS ");
	//
	// // check if login is success
	// Assert.assertTrue(LoginGFS(driver, "sgpalmetto", "sports1"));
	// // check the flow to export
	// StepsToExport(driver);
	// // rename downloadeds
	// // String CurrentPath = RandomAction.setdownloadDir();
	// // File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
	// SendMailSSL.sendMailAction("GFS - Offline GP", "Sports Grill Palmetto");
	//
	// }
	//
	// @Test(priority = 9)
	// public void SportsGrillSouthMiami_GFS() throws InterruptedException {
	//
	// System.out.println("9 , SportsGrillSouthMiami_GFS ");
	//
	// // check if login is success
	// Assert.assertTrue(LoginGFS(driver, "sgsouthmiami", "sports1"));
	// // check the flow to export
	// StepsToExport(driver);
	// // rename downloadeds
	// // String CurrentPath = RandomAction.setdownloadDir();
	// // File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
	// SendMailSSL.sendMailAction("GFS - Offline GP", "Sports Grill South
	// Miami");
	// }

	@Test(priority = 10)
	public void Talavera_GFS() throws InterruptedException {

		System.out.println("10 , Talavera_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "talavera001", "talavera002"));
		// check the flow to export
		StepsToExport(driver,"TALAVERA & COCINA MEXICANA");
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Talavera Restaurant");

	}
	

	@Test(priority = 14)
	public void Hamiltons_GFS() throws InterruptedException {

		System.out.println("14 , Hamiltons_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "ghamilton", "Leevia@"));
		// check the flow to export
		StepsToExport(driver);
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("Gordon - Hybrid", "Hamiltons Catering");
	}

	@Test(priority = 15)
	public void ConchRep_GFS() throws InterruptedException {

		System.out.println("15 , ConchRep_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "nbrummette", "pantera13"));
		// check the flow to export
		StepsToExport(driver);
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "The Conch Republic");

	}

	@Test(priority = 16)
	public void Woodfield_GFS() throws InterruptedException {

		System.out.println("16 , Woodfield_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "mcdonald", "3650club"));
		// check the flow to export
		StepsToExport(driver);
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("Gordon - Hybrid", "Woodfield Country Club");
	}

	// @Test(priority = 15)
	// public void Strebs_GFS() throws InterruptedException {
	//
	// System.out.println("15 , Strebs_GFS ");
	//
	// // check if login is success
	// Assert.assertTrue(LoginGFS(driver, "richw0", "235610"));
	// // check the flow to export
	// StepsToExport(driver);
	// // rename downloadeds
	// // String CurrentPath = RandomAction.setdownloadDir();
	// // File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
	// SendMailSSL.sendMailAction("GFS - Offline GP", "Strebs Restaurant");
	// }

	@Test(priority = 17)
	public void Prime112_GFS() throws InterruptedException {

		System.out.println("17 , Prime112_GFS and Big Pink All Restaurants ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "bigpink", "123456"));
		// check the flow to export
		StepsToExport(driver);
		// rename downloads
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Prime 112");
		SendMailSSL.sendMailAction("GFS - Offline GP", "Big Pink");
//		SendMailSSL.sendMailAction("GFS - Offline GP", "Prime Fish");
//		SendMailSSL.sendMailAction("GFS - Offline GP", "Prime Italian");

	}

	@Test(priority = 18)
	public void TrumpIntl_GFS() throws InterruptedException {

		System.out.println("18 , TrumpIntl_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "rvigo", "Aux123456"));
		// check the flow to export
		StepsToExport(driver);
		// rename downloads
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Trump International Beach Resort");

	}

	@Test(priority = 19)
	public void ChefDavid_GFS() throws InterruptedException {

		System.out.println("19, ChefDavid_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "dschwadron", "dschwadron1"));
		// check the flow to export
		StepsToExport(driver);
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Chef David Cuisine");

	}

	@Test(priority = 20)
	public void Jaguar_GFS() throws InterruptedException {

		System.out.println("20, Jaguar_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "talavera001", "talavera002"));
		// check the flow to export
		StepsToExport(driver,"JAGUAR RESTAURANT");
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Jaguar");

	}

	// #select AC Test cases

	// @Test(priority = 20)
	// public void Agliolio_GFS() throws InterruptedException {
	//
	// System.out.println("18, Agliolio_GFS ");
	// // check if login is success
	// Assert.assertTrue(LoginGFS(driver, "agliolio", "4flowers"));
	// // check the flow to export
	// StepsToExport(driver, "AGLIOLIO-BOYNTON BEACH");
	// // rename downloadeds
	// // String CurrentPath = RandomAction.setdownloadDir();
	// // File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
	// SendMailSSL.sendMailAction("GFS - Offline GP", "Agliolio Boynton Italian
	// Bistro & Bar");
	//
	// }

	// @Test(priority = 21)
	// public void AgliolioWellington_GFS() throws InterruptedException {
	//
	// System.out.println("19, AgliolioWellington_GFS ");
	//
	// // check if login is success
	// Assert.assertTrue(LoginGFS(driver, "agliolio", "4flowers"));
	// // check the flow to export
	// StepsToExport(driver, "AGLIOLIO-WELLINGTON");
	// // rename downloadeds
	// // String CurrentPath = RandomAction.setdownloadDir();
	// // File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
	// SendMailSSL.sendMailAction("GFS - Offline GP", "Agliolio Wellington Fresh
	// Pasta & Wine");
	//
	// }

	@Test(priority = 22)
	public void TownKitchen_GFS() throws InterruptedException {

		System.out.println("22, TownKitchen_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "townkitchen", "kitchen1"));
		// check the flow to export
		StepsToExport(driver, "TOWN KITCHEN");
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Town Kitchen & Bar");
	}

	@Test(priority = 23)
	public void HouseTK_GFS() throws InterruptedException {

		System.out.println("23, HouseTK_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "townkitchen", "kitchen1"));
		// check the flow to export
		StepsToExport(driver, "HOUSE KITCHEN & BAR");
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "House T&K");

	}

	@Test(priority = 24)
	public void Hallandale_GFS() throws InterruptedException {

		System.out.println("24, Hallandale_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "dawnwight", "Flashback1"));
		// check the flow to export
		StepsToExport(driver, "FLASHBACK DINER");
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Flashback Diner Hallandale");

	}

	@Test(priority = 25)
	public void Davie_GFS() throws InterruptedException {

		System.out.println("26, Davie_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "dawnwight", "Flashback1"));
		// check the flow to export
		StepsToExport(driver, "FLASHBACK DINER & COFFEE HOUSE");
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Flashback Diner Davie");

	}

	@Test(priority = 26)
	public void BocaRaton_GFS() throws InterruptedException {

		System.out.println("26, BocaRaton_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "dawnwight", "Flashback1"));
		// check the flow to export
		StepsToExport(driver, "FLASHBACK DINER - BOCA RATON");
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Flashback Diner Boca Raton");

	}

	@Test(priority = 27)
	public void OrangeBlossom_GFS() throws InterruptedException {

		System.out.println("27, OrangeBlossom_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "SDCook", "OBHills123"));
		// check the flow to export
		StepsToExport(driver, "ORANGE BLOSSOM");
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Orange Blossom Hills");

	}

	@Test(priority = 28)
	public void Bottega_GFS() throws InterruptedException {
		System.out.println("28, Bottega_GFS ");
		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "rprieto", "100020166"));
		// check the flow to export
		StepsToExport(driver, "BOTTEGA EXPRESS");
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("Gordon Food Service", "Bottega Express");

	}

	@Test(priority = 29)
	public void Wycliffe_GFS() throws InterruptedException {
		System.out.println("29, Bottega_GFS ");
		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "davidperez2", "Wycliffe1"));
		// check the flow to export
		StepsToExport(driver);
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Wycliffe Golf & Country Club");

	}

	@Test(priority = 30)
	public void EVANS_GFS() throws InterruptedException {

		System.out.println("30, EVANS_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "SDCook", "OBHills123"));
		// check the flow to export
		StepsToExport(driver, "EVANS PRAIRIE");
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Evans Prairie CC");

	}
	
	@Test(priority = 31)
	public void WyandhamCafeMed_GFS() throws InterruptedException {

		System.out.println("31, WyandhamCafeMed_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "lillot123", "Cafemed123"));
		// check the flow to export
		StepsToExport(driver);
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Wyndham Deerfield - Cafe Med");
		SendMailSSL.sendMailAction("GFS - Offline GP", "Wyndham Deerfield - Burger Craze");
	}
	
	@Test(priority = 32)
	public void WyndhamPatioBar_GFS() throws InterruptedException {

		System.out.println("32, WyndhamPatioBar_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "chefbob1", "patiobar123"));
		// check the flow to export
		StepsToExport(driver);
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Wyndham Deerfield - Patio Bar & Catering");
	}
	
	@Test(priority = 33)
	public void HoleInWall_GFS() throws InterruptedException {

		System.out.println("33, HoleInWall_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "cerickson", "Hole2010"));
		// check the flow to export
		StepsToExport(driver, "KINGS CREEK HOLE IN THE WALL");
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Hole in the Wall");
		SendMailSSL.sendMailAction("GFS - Offline GP", "Hole in the Wall-Coffee window");
	}
	
	@Test(priority = 34)
	public void Nicks_GFS() throws InterruptedException {

		System.out.println("33, HoleInWall_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "justins1", "Diningedge2015"));
		// check the flow to export
		StepsToExport(driver);
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Nicks New Haven Style Pizza");
	}
	
	@Test(priority = 35)
	public void Peacock_GFS() throws InterruptedException {

		System.out.println("35, Peacock_GFS ");

		// check if login is success
		Assert.assertTrue(LoginGFS(driver, "talavera001", "talavera002"));
		// check the flow to export
		StepsToExport(driver,"PEACOCK GARDEN BISTRO");
		// rename downloadeds
		// String CurrentPath = RandomAction.setdownloadDir();
		// File GFS_OG = RandomAction.getLatestFilefromDir(CurrentPath);
		SendMailSSL.sendMailAction("GFS - Offline GP", "Peacock Garden Cafe");
	}
	*/
}





