package testngtraining;

import org.testng.annotations.Test;

public class FirstTest extends BaseTest{

	
	@Test(enabled= false, description = "Verified Addition of numbers")
	public void verifyAddingNumbersTest() {
		System.out.println("verifyAddingNumbersTest");
	}
	
	@Test
	public void verifyMultipleNumbersTest() {
		System.out.println("verifyMultipleNumbersTest");
	}
	
	
	@Test
	public void verifyDivideNumbersTest() {
		System.out.println("verifyDivideNumbersTest");
	}
	
	@Test
	public void login() {
		System.out.println("login");
	}
}
