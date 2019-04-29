package Day1;

import org.testng.annotations.Test;

public class Newtest {
     @Test(priority=2)
	public void add()
	{
		System.out.println("mani");
	}
     @Test(priority=1)
     public void add1()
     {
    	 System.out.println("mani2");
     }
}
