package testngtest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckTestSequence extends MethodsToRunTestCasesOnCurrentPage {
	
	@BeforeSuite
	void beforesuit() {
		System.out.println(" before suit");
		System.out.println("browser launch");
	}

	@BeforeTest
	void beforetest() {
		System.out.println("beforetest");
	}

	@BeforeClass
	void beforeclass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	void checkTextonLoginPage() {
		
		System.out.println("Before Method");
	}

	@Test
	void verifyLoginAfterCorrectCrenditials() {
		CheckTestSequence t1 = new CheckTestSequence();
		t1.login();
		Assert.assertEquals(true, false);

	}
	@Test
	void verifyLogoutOrNot() {
		CheckTestSequence t2 = new CheckTestSequence();
		t2.logout();
	}

	@Test
	void verifyLoginAfterInCorrectCrenditials() {
		CheckTestSequence t = new CheckTestSequence();
		t.login();
		Assert.assertEquals(false, false);

	}
	@Test
	void checkingTitle() {
		CheckTestSequence t3 = new CheckTestSequence();
		t3.checkingPageTitle();
	}

	@AfterMethod
	void logout() {
		System.out.println("After Method");
	}

	@AfterClass
	void afterclass() {
		System.out.println("After Class");
	}

	@AfterTest
	void aftertest() {
		System.out.println("After test");
	}

	@AfterSuite
	void aftersuit() {
		System.out.println("after suit");
		System.out.println("browser close");
	}
	/*
	 * @Test(priority=-1) public void testcase2() {
	 * System.out.println("2nd test tested"); Assert.assertEquals(false, true); }
	 * 
	 * @Test(priority=1,dependsOnMethods = "testcase2",alwaysRun =
	 * true,enabled=true) public void testcase1() {
	 * System.out.println("1st test tested");
	 * Reporter.log("checking Reporter",false); }
	 */

}
