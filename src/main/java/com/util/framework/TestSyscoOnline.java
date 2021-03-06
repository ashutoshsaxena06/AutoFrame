package com.util.framework;

public class TestSyscoOnline extends CommonSysco {
/*
	@BeforeClass
	public void setup() {
		System.out.println("*************Sysco************");

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

//	@Test(priority = 1)
//	public void BocaLago_Sysco() throws InterruptedException, MessagingException {
//
//		System.out.println("1, BocaLago_Sysco ");
//
//		// check if login is success
//		startSysco(driver, "2177033", "032302661", "bocalago2016");
//
//		// sendMail
//		SendMailSSL.sendMailAction("Sysco", "Boca Lago Country Club");
//	}

	 @Test(priority = 2)
	 public void ChefDavid_Sysco() throws InterruptedException,
	 MessagingException {
	
	 System.out.println("2, ChefDavid_Sysco");
	
	 // check if login is success
	 startSysco(driver, "2483638", "016778134", "acdc5881");
	
	 //sendMail
	 SendMailSSL.sendMailAction("Sysco", "Chef David Cuisine");
	 }

	@Test(priority = 3)
	public void Howleys_Sysco() throws InterruptedException, MessagingException {

		System.out.println("3, Howleys_Sysco");

		// check if login is success
		startSysco(driver, "1929374", "032268763", "welcome8");

		// sendMail
		SendMailSSL.sendMailAction("Sysco", "Howleys Restaurant");
	}

	@Test(priority = 4)
	public void TownKitchen_Sysco() throws InterruptedException, MessagingException {

		System.out.println("4, TownKitchen_Sysco");

		// check if login is success
		startSysco(driver, "2119088", "016745448", "town180");

		// sendMail
		SendMailSSL.sendMailAction("Sysco", "Town Kitchen & Bar");
		// sendMail
		SendMailSSL.sendMailAction("Sysco", "House T&K");
	}

	// @Test(priority = 5)
	// public void House_Sysco() throws InterruptedException, MessagingException
	// {
	//
	// System.out.println("5, House_Sysco");
	//
	// // check if login is success
	// startSysco(driver, "2119088", "016745448", "Password1");
	//
	//
	// }

	// @Test(priority = 6)
	// public void Boynton_Sysco() throws InterruptedException,
	// MessagingException {
	//
	// System.out.println("6, Boynton_Sysco");
	//
	// // check if login is success
	// startSysco(driver, "Export from Sysco Market", "032584003", "4Flowers");
	//
	// //sendMail
	// SendMailSSL.sendMailAction("SYSCO - Offline GP", "Agliolio Boynton Italian Bistro & Bar");
	// }
	//
	// @Test(priority = 7)
	// public void Wellington_Sysco() throws InterruptedException,
	// MessagingException {
	//
	// System.out.println("7, Wellington_Sysco");
	//
	// // check if login is success
	// startSysco(driver, "Export from Sysco Market", "032452235", "4Flowers");
	//
	// //sendMail
	// SendMailSSL.sendMailAction("SYSCO - Offline GP", "Agliolio Wellington Fresh Pasta & Wine");
	// }

	@Test(priority = 8)
	public void Bonefish_Sysco() throws InterruptedException, MessagingException {

		System.out.println("8, Bonefish_Sysco");

		// check if login is success
		startSysco(driver, "1658683", "032576462", "password4");

		// sendMail
		SendMailSSL.sendMailAction("SYSCO - Offline GP", "Bonefish Macs");
	}

	@Test(priority = 9)
	public void DeliLane_Sysco() throws InterruptedException, MessagingException {

		System.out.println("9, DeliLane_Sysco");

		// check if login is success
		startSysco(driver, "1125572", "016383752", "delilane1");

		// sendMail
		SendMailSSL.sendMailAction("SYSCO - Offline GP", "Deli Lane Café");
	}

	@Test(priority = 10)
	public void Gilberts_Sysco() throws InterruptedException, MessagingException {

		System.out.println("10, Gilberts_Sysco");

		// check if login is success
		startSysco(driver, "775018", "016894121", "Gilberts2");

		// sendMail
		SendMailSSL.sendMailAction("SYSCO - Offline GP", "Gilberts Resort");
	}

	@Test(priority = 11)
	public void Hamiltons_Sysco() throws InterruptedException, MessagingException {

		System.out.println("11, Hamiltons_Sysco");

		// check if login is success
		startSysco(driver, "2427733", "194040139", "password7");

		// sendMail
		SendMailSSL.sendMailAction("SYSCO - Offline GP", "Hamiltons Catering");
	}

	@Test(priority = 12)
	public void OldKeyLime_Sysco() throws InterruptedException, MessagingException {

		System.out.println("12, OldKeyLime_Sysco");

		// check if login is success
		startSysco(driver, "1936732", "032081968", "oklh1889");

		// sendMail
		SendMailSSL.sendMailAction("SYSCO - Offline GP", "Old Key Lime House");
	}

	@Test(priority = 13)
	public void RollingHills_Sysco() throws InterruptedException, MessagingException {

		System.out.println("13, RollingHills_Sysco");

		// check if login is success
		startSysco(driver, "513430", "031136184", "Shipping2655");

		// sendMail
		SendMailSSL.sendMailAction("SYSCO - Offline GP", "Rolling Hills Casino");
	}

	@Test(priority = 14)
	public void SportsGrillKendall_Sysco() throws InterruptedException, MessagingException {

		System.out.println("14, SportsGrillKendall_Sysco");

		// check if login is success
		startSysco(driver, "2434299", "016732057", "password1");

		// sendMail
		SendMailSSL.sendMailAction("SYSCO - Offline GP", "Sports Grill Kendall");
		SendMailSSL.sendMailAction("SYSCO - Offline GP", "Sports Grill Palmetto");
		SendMailSSL.sendMailAction("SYSCO - Offline GP", "Sports Grill Pembroke Pines");
		SendMailSSL.sendMailAction("SYSCO - Offline GP", "Sports Grill South Miami");
		SendMailSSL.sendMailAction("SYSCO - Offline GP", "Sports Grill Sunset");
	}

	// @Test(priority = 15)
	// public void SportsGrillPalmetto_Sysco() throws InterruptedException,
	// MessagingException {
	//
	// System.out.println("15, SportsGrillPalmetto_Sysco");
	//
	// // check if login is success
	// startSysco(driver, "SPORTS GRILL GOLF COURSE Order Guide", "016916288",
	// "sgpgc9300");
	//
	// //sendMail
	// SendMailSSL.sendMailAction("SYSCO - Offline GP", "Sports Grill
	// Palmetto");
	// }
	//
	// @Test(priority = 16)
	// public void SportsGrillPembroke_Sysco() throws InterruptedException,
	// MessagingException {
	//
	// System.out.println("16, SportsGrillPembroke_Sysco");
	//
	// // check if login is success
	// startSysco(driver, "SPORTS GRILL PINES Order Guide", "016894980",
	// "sgpines220");
	//
	// //sendMail
	// SendMailSSL.sendMailAction("SYSCO - Offline GP", "Sports Grill Pembroke
	// Pines");
	// }
	//
	// @Test(priority = 17)
	// public void SportsGrillSouthMiami_Sysco() throws InterruptedException,
	// MessagingException {
	//
	// System.out.println("17, SportsGrillSouthMiami_Sysco");
	//
	// // check if login is success
	// startSysco(driver, "SPORTS GRILL SOUTH MIAMI Order Guide", "016785030",
	// "sports1");
	//
	// //sendMail
	// SendMailSSL.sendMailAction("SYSCO - Offline GP", "Sports Grill South
	// Miami");
	// }
	//
	// @Test(priority = 18)
	// public void SportsGrillSunset_SysFresh() throws InterruptedException,
	// MessagingException {
	//
	// System.out.println("18, SportsGrillSunset_SysFresh");
	//
	// // check if login is success
	// startSysco(driver, "BDSUNSET", "016963926", "password1");
	//
	// //sendMail
	// SendMailSSL.sendMailAction("Sysco Fresh", "Sports Grill Sunset");
	// }
	//
	// @Test(priority = 19)
	// public void SportsGrillSunset_Sysco() throws InterruptedException,
	// MessagingException {
	//
	// System.out.println("19, SportsGrillSunset_Sysco");
	//
	// // check if login is success
	// startSysco(driver, "SPORTS GRILL (3) Order Guide", "016182972",
	// "sgs10005");
	//
	// //sendMail
	// SendMailSSL.sendMailAction("SYSCO - Offline GP", "Sports Grill Sunset");
	// }

	@Test(priority = 20)
	public void TortugaJacks_Sysco() throws InterruptedException, MessagingException {

		System.out.println("20, TortugaJacks_Sysco");

		// check if login is success
		startSysco(driver, "1581480", "003732925", "guitar72");

		// sendMail
		SendMailSSL.sendMailAction("SYSCO - Offline GP", "Tortuga Jacks");
	}

	@Test(priority = 21)
	public void TrumpIntl_Sysco() throws InterruptedException, MessagingException {

		System.out.println("21, TrumpIntl_Sysco");

		// check if login is success
		startSysco(driver, "1641775", "016565069", "Almalgam81");

		// sendMail
		SendMailSSL.sendMailAction("SYSCO - Offline GP", "Trump International Beach Resort");
	}

	@Test(priority = 22)
	public void TrumpNational_Sysco() throws InterruptedException, MessagingException {

		System.out.println("22, TrumpNational_Sysco");

		// check if login is success
		startSysco(driver, "1199201", "032526863", "trump2016");

		// sendMail
		SendMailSSL.sendMailAction("SYSCO - Offline GP", "Trump National Golf Club");
	}

	@Test(priority = 24)
	public void Wycliff_Sysco() throws InterruptedException, MessagingException {

		System.out.println("24, Wycliff_Sysco");

		// check if login is success
		startSysco(driver, "2486629", "032356659", "Purchasing178");

		// sendMail
		SendMailSSL.sendMailAction("SYSCO - Offline GP", "Wycliffe Golf & Country Club");
	}

//	@Test(priority = 25)
//	public void Shortys_Sysco() throws InterruptedException, MessagingException {
//
//		System.out.println("25, Shortys_Sysco");
//
//		// check if login is success
//		startSysco(driver, "1126453", "016583765", "password1");
//
//		// sendMail
//		SendMailSSL.sendMailAction("eSysco", "Shortys II Inc");
//	}

//	@Test(priority = 26)
//	public void SportsGrillSunset_SysFresh() throws InterruptedException, MessagingException {
//
//		System.out.println("26, SportsGrillSunset_SysFresh");
//
//		// check if login is success
//		startSysco(driver, "BDSUNSET", "016963926", "password1");
//
//		// sendMail
//		SendMailSSL.sendMailAction("Sysco Fresh", "Sports Grill Sunset");
//	}

//	@Test(priority = 27)
//	public void PilotHouse_Sysco() throws InterruptedException, MessagingException {
//
//		System.out.println("27, PilotHouse_Sysco");
//		// check if login is success
//		startSysco(driver, "BDpilothouse", "016695882", "marina100");
//
//		// sendMail
//		SendMailSSL.sendMailAction("Sysco - Offline GP", "Pilot House Marina");
//	}

	@Test(priority = 28)
	public void Hole_Sysco() throws InterruptedException, MessagingException {

		System.out.println("28, Hole_Sysco");

		// check if login is success
		startSysco(driver, "839013", "016911305", "Hole2010");

		// sendMail
		SendMailSSL.sendMailAction("Sysco - Offline GP", "Hole in the Wall");
	}

//	@Test(priority = 29)
//	public void Lucilles_Sysco() throws InterruptedException, MessagingException {
//
//		System.out.println("29, Lucilles_Sysco");
//
//		// check if login is success
//		startSysco(driver, "1878529", "032613299", "lucilles1");
//
//		// sendMail
//		SendMailSSL.sendMailAction("Sysco - Offline GP", "Lucille's BBQ");
//	}
	
//	@Test(priority = 30)
//	public void Boynton_Sysco() throws InterruptedException, MessagingException {
//
//		System.out.println("28, Boynton_Sysco");
//
//		// check if login is success
//		startSysco(driver, "1200692", "032584003", "4Flowers");
//
//		// sendMail
//		SendMailSSL.sendMailAction("Sysco - Offline GP", "Agliolio Boynton Italian Bistro & Bar");
//	}
//
//	@Test(priority = 31)
//	public void Wellington_Sysco() throws InterruptedException, MessagingException {
//
//		System.out.println("29, Wellington_Sysco");
//
//		// check if login is success
//		startSysco(driver, "1198138", "032452235", "4Flowers");
//
//		// sendMail
//		SendMailSSL.sendMailAction("Sysco - Offline GP", "Agliolio Wellington Fresh Pasta & Wine");
//	}
	
	@Test(priority = 32)
	public void BigPink_Sysco() throws InterruptedException, MessagingException {

		System.out.println("32, Hole_Sysco");

		// check if login is success
		startSysco(driver,"340547", "1757724", "Angelmarinov", "angel1980");
		
		
		// sendMail
		SendMailSSL.sendMailAction("Sysco - Offline GP", "Big Pink");
		SendMailSSL.sendMailAction("Sysco - Offline GP", "Prime 112");

	}
	
	@Test(priority = 33)
	public void Crazy_Sysco() throws InterruptedException, MessagingException {

		System.out.println("33, Crazy_Sysco");

		// check if login is success
		startSysco(driver,"1127707", "crazyregular", "crazy123");
		
		// sendMail
		SendMailSSL.sendMailAction("Sysco - Offline GP", "Crazy about you");
	}
	
	@Test(priority = 34)
	public void SamsHudsons_Sysco() throws InterruptedException, MessagingException {

		System.out.println("34, SamsHudsons_Sysco");

		// check if login is success
		startSysco(driver,"2165278", "037259903", "beachbar1981");
		
		// sendMail
		SendMailSSL.sendMailAction("Sysco - Offline GP", "Sams Hudsons Beach Bar");
	}
	
	@Test(priority = 35)
	public void JBs_Sysco() throws InterruptedException, MessagingException {

		System.out.println("35, JBs_Sysco");

		// check if login is success
		startSysco(driver,"2176031", "032192112", "jbs192112");
		
		// sendMail
		SendMailSSL.sendMailAction("Sysco - Offline GP", "JB's on the Beach");
	}
	
	@Test(priority = 36)
	public void Mizner_Sysco() throws InterruptedException, MessagingException {

		System.out.println("36, Mizner_Sysco");

		// check if login is success
		startSysco(driver,"2595737", "032437798", "Welcome12");
		
		// sendMail
		SendMailSSL.sendMailAction("Sysco - Offline GP", "Mizner Country Club");
	}
	
	
	
*/}
