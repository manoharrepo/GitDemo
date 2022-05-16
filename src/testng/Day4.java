package testng;

import org.testng.annotations.*;

public class Day4 {
	
	 @Test(dataProvider="getData")
	  public void webLoginHome(String username, String pass) {
		  //System.out.println("Web Login Home");
		 System.out.println(username);
		 System.out.println(pass);
	  }
	  @Test
	  public void mobLoginHome() {
		  System.out.println("Mobile Login Home");
	  }
	  @Parameters({"URL","Api/username"})
	  @Test
	  public void loginApiHome(String urllink, String key) {
		  System.out.println("Login Api Home");
		  System.out.println(urllink);
		  System.out.println(key);
		  
	  }
	  @DataProvider
	  public Object  getData() {
		  Object[][] data = new Object[3][2];
		   //first set
		  data[0][0] = "ManoharUser";
		  data[0][1] = "ManoharPass";
		  //Second set
		  data[1][0] = "SecondUser";
		  data[1][1] = "SecondPass"; 
		  //Thord set
		  data[2][0] = "thirdUser";
		  data[2][1] = "thirdPass";
		  return data;
	  }
}
