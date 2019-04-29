package Day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Check {
	@Test
		public void testcase1(){
		System.out.println("case1");
	}
		@Test
		public void testcase2(){
			System.out.println("case2");
		}
@BeforeMethod
public void beforemethod(){
	System.out.println("before method");
}
@AfterMethod
public void aftermethos(){
	System.out.println("aftermethod");
}
@BeforeClass
public void beforeclass(){
	System.out.println("beforeclass");
}
@AfterClass
public void afterclass(){
	System .out.println("afterclass");
}
@BeforeTest
public void beforetest(){
	System.out.println("beforetest");
}
@AfterTest
public void aftertest(){
	System.out.println("aftertest");
}
@BeforeSuite
public void beforesuite(){
	System.out.println();}
@AfterSuite
public void aftersuite(){
	System.out.println();}
		
	
}



