package testNGProgram;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheckParameterization1 {

	@Parameters({"url","user","pwd"})
	@Test(priority = -1)
	public void webLogin(@Optional String urlLink, @Optional String userName,  @Optional String passWord)
	{
		System.out.println("Web Login");
		System.out.println("Parameterized value is : " +urlLink+" username is : "+userName+" Password is : "+passWord);
	
	}

	@Test(priority=-2)
	public void mobileLogin()
	{
		System.out.println("Mobile Login");
	}
	
	@Test(priority =2 )
	public void APILogin()
	{
		System.out.println("API Login");
	}
	
	@BeforeTest
	public void LastTestingCommon() 
	{
		System.out.println("I will be 1st test in common test folder");
	}
	
	@AfterSuite
	public void AfterSuite1st()
	{
		System.out.println("After Suite : I will be Last test in whole package");
	}
}
