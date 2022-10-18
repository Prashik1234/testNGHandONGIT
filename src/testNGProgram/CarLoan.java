package testNGProgram;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CarLoan {

		@Test(groups= {"Group1SelectedTest"})
		public void webCarLoanLogin()
		{
			System.out.print("Grouping : ");
			System.out.println("Web Car Loan Login");
			System.out.println("Checking GIT push");
			System.out.println("Checking GIT updated after pull and again pushing the code to repository");
		}

		@Test
		public void mobileCarLoanLogin()
		{
			System.out.println("Mobile Car Loan Login");
		}
		
		@Test(enabled=false)
		public void APICarLoanLogin()
		{
			System.out.println("API Car Loan Login");
		}
		
		@BeforeSuite
		public void BeforeSuite1st()
		{
			System.out.println("Before Suite : I will be 1st test in whole package");
		}
		
		@Test(dependsOnMethods= {"Function2"})
		public void Function1()
		{
			System.out.println("1st as per Alphabetic order");
		}
		
		@Test
		public void Function2()
		{
			
			System.out.println("2nd as per Alphabetic order");
		}
		
}
