package Day1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Test {
	@BeforeSuite
	public void login(){
		System.out.println("ggo to site");
		
	}
	@BeforeTest
	public void launchbrowser()
	{
		System.out.println("launch browser");
	}
	@BeforeClass
   public void checkbrowser()
   {
	   System.out.println("check the browser");
	  
   }
	@BeforeTest
   public void closechcek()
   {
	   System.out.println("cloce the check");
   }
	  @org.testng.annotations.Test
	   public void read()
	   {
		   System.out.println("this is mani");
	   }
	   		
   }

