package testngtraining;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Started Beforesuite execution ");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Started BeforeTest execution ");
	}

	@BeforeClass
	public void beforeClass1() {
		System.out.println("Started BeforeClass execution ");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Started BeforeMethod execution");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Started AfterMethod execution");
	}


	@AfterClass
	public void afterClass() {
		System.out.println("Started AfterClass execution");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Started AfterTest execution");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Started Aftersuite execution");
	}
}
