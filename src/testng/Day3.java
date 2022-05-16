package testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class Day3 {
	@Parameters({"URL"})
  @Test
  public void webLogin( String urllink) {
	  System.out.println("Web Login");
	  System.out.println(urllink);
  }
  @Test
  public void mobLogin() {
	  System.out.println("Mobile Login");
  }
  @Test(groups= {"smoke"})
  public void mobsignin() {
	  System.out.println("Mobile Signin");
	  Assert.assertTrue(false);
  }
  //@Test(groups= {"smoke"})
  // @Test(dependsOnMethods = "webLogin")
  @Test
  public void loginApi() {
	  System.out.println("Login Api");
  }
 
}
