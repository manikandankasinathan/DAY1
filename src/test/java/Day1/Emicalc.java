package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Emicalc {
	
	public static void main(String[] args) {
		
//		launch App
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		
//		Enter amount
		ff.findElement(By.id("one")).sendKeys("100000");		
//		Enter rate
		ff.findElement(By.id("two")).sendKeys("10");
//		Enter Tenure
		ff.findElement(By.id("three")).sendKeys("120");
//		Click Calculate
		ff.findElement(By.name("B1")).click();
//		Extarct EMI
		
		String output = ff.findElement(By.id("four")).getAttribute("value");
		System.out.println(output);
		
//		close App
		ff.close();
		
		
		
	}
}
