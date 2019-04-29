package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Emicalc_Relativepath {
	
	public static void main(String[] args) {
		
//		launch App
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		
//		Enter amount
//		one way
//		ff.findElement(By.xpath("//input[@id='one']")).sendKeys("100000");
		
//		Second Way
//		ff.findElement(By.xpath("//div[@class='frmbody']/div[1]/div[3]/input")).sendKeys("100000");

//		Third Way
		ff.findElement(By.xpath("//div[@class='frmbody']/div[1]//input")).sendKeys("100000");
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
