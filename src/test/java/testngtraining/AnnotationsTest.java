package testngtraining;

import org.testng.annotations.Test;

public class AnnotationsTest extends BaseTest{

	@Test(priority = 0)
	public void zero() {
		System.out.println("zero");
	}
	
	@Test(priority = 1)
	public void a() {
		System.out.println("a");
	}
	
	@Test(priority = 2)
	public void c() {
		System.out.println("c");
	}
	
	@Test
	public void d() {
		System.out.println("d");
	}
	
	@Test
	public void b() {
		System.out.println("b");
	}
	
	@Test
	public void e() {
		System.out.println("e");
	}
}
