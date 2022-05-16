package testng;

import org.testng.*;

//ITestListener interface which implements Testng listners
public class Listener implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		 System.out.println("Test fail Listener "+result.getName()+" "+ result.getMethod());
		 
	}
	@Override
public void onTestSuccess(ITestResult result) {
		 System.out.println("Test Pass Listener");
	}
}
