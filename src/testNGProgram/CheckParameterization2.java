package testNGProgram;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheckParameterization2 {

	
	@Test
	public void webLogin()
	{
		
		System.out.println("2 : Web Login");
	}
	@Parameters({"url"})
	@Test
	public void mobileLogin(@Optional String urlLink)
	{
		System.out.println("Parameterized value is : " +urlLink);
		System.out.println("2 : Mobile Login");
	}
	
	@Test
	public void APILogin()
	{
		System.out.println("2 : API Login");
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
	
	
	@Test(dataProvider= "sendData")
	public void getData(@Optional String userName, String Password)
	{
		System.out.println("Usrename is : " +userName);
		System.out.println("Password is : "+Password);
	}
	
	@DataProvider
	@Test
	public Object[][] sendData()
	{
		Object[][] loginDetails = new Object[3][2];
		loginDetails[0][0] = "1st User";
		loginDetails[0][1] = "1st Password";
		loginDetails[1][0] = "2nd User";
		loginDetails[1][1] = "2nd Password";
		loginDetails[2][0] = "3rd User";
		loginDetails[2][1] = "3rd Password";
		
		return loginDetails;
	}
}
