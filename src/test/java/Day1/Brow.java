package Day1;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Brow {
/*	WebDriver driver;
	@Test
	@Parameters("broser")
	public void Paralle(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			//driver.new Chromedriver();
		}*/
ChromeDriver ff= new ChromeDriver();
	ff.get("https://www.google.com/");
	driver.quit();
	}
	
}
