package testNGProgram;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoan {

	@Test
	public void webHomeLoanLogin()
	{
		System.out.println("Web Home Loan Login");
	}

	@Test(groups= {"Group1SelectedTest"})
	public void mobileHomeLoanLogin()
	{
		System.out.print("Grouping : ");
		System.out.println("Mobile Home Loan Login");
	}
	
	@Test
	public void APIHomeLoanLogin()
	{
		System.out.println("API Home Loan Login");
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
