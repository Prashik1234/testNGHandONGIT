package testNGProgram;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG1stProgram {

	@BeforeClass
	public void beforeCLASSFunc()
	{
		System.out.println("Before CLASS :  I will run 1st when TestNG1stProgram start execution");
	}
	
	@AfterClass
	public void AfterCLASSFunc()
	{
		System.out.println("Before CLASS :  I will run last  when TestNG1stProgram execution is over");
	}
	
	@Test(groups= {"Group1SelectedTest"})
	public void function1()
	{
		System.out.print("Grouping : ");
		System.out.println("1st testNG program");
	}
	
	@BeforeMethod
	public void BeforeMethodofAllFunc()
	{
		System.out.println("Before Method :  I will run before every @test in TestNG1stProgram only");
	}
	@AfterMethod
	public void AfterMethodofAllFunc()
	{
		System.out.println("After Method :  I will run after every @test in TestNG1stProgram only");
	}
	@Test
	public void function2()
	{
		System.out.println("Bye from 1st testNG program");
	}
	
	@AfterTest
	public void LastTestinCommon() 
	{
		System.out.println("I will be last test in common test folder");
	}
	
	@BeforeSuite
	public void seecondndBeforeSuite()
	{
		System.out.println("2nd Before Suite : I'm 2nd Before Suite");
	}

}
