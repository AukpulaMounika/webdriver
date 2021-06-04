package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Reporter;
public class Example {
	@BeforeMethod
	public void login() {
		System.out.println("login script");
		Reporter.log("loginscript");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout script");
		Reporter.log("logoutscripts");
	}
	@Test(priority=2)
	public void addemp() {
		System.out.println("added successfull");
		Reporter.log("added successfull");
	}
	@Test(priority=3)
	public void delemp() {
		System.out.println("deleted successfully");
		Reporter.log("deleted ");
	}

}
