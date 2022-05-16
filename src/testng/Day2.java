package testng;

import org.testng.annotations.*;

public class Day2 {
	@Parameters({"URL"})
    @Test(groups= {"smoke"})
	public void day2(String urllink) {
	   System.out.println("Hello2");
	   System.out.println(urllink);
   }
    @BeforeTest
    public void require() {
  	 System.out.println("required Operations"); 
  	  
    }
    @BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Day2");
	}
}
