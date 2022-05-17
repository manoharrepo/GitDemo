package testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestbBasics {
	@Test
	public void test1() {
		System.out.println("Hello");
		
	}
	
	@Test
	public void test2() {
		System.out.println("Hello1");
                System.out.println("Hello1");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class TestbBasics");
	}
 @BeforeSuite
 public void suit() {
	 System.out.println("Suite first");
 }
 @AfterSuite
 public void Aftersuit() {
	 System.out.println("Suite Last");
 }
 @BeforeMethod
 public void beforeMethod() {
	 System.out.println("Before Method");
 }
}
