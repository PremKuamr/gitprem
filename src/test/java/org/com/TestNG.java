package org.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	
	@BeforeSuite
	private void m1() {
	System.out.println("BeforeSuite");

	}

	
	
	
	@AfterSuite
	private void m2() {
	System.out.println("AfterSuite");

	}

	@BeforeTest

	private void m3() {
	System.out.println("BeforeTest");

	}
 @AfterTest
	private void m4() {
	System.out.println("AfterTest");

	}
@BeforeMethod
	private void m5() {
	System.out.println("BeforeMethod");

	}
@AfterMethod
	private void m6() {
	System.out.println("AfterMethod");

	}
@BeforeClass
	private void m7() {
	System.out.println("BeforeClass");

	}
@AfterClass
	private void m8() {
	System.out.println("AfterClass");

	}
@Test
	private void m9() {
	System.out.println("Test");

	}

}
