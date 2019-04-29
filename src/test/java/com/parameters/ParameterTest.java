package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParameterTest {
	
	@Test
	public void yahooLoinTest()
	{
		//FirefoxDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Manikandan/Downloads/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com/");
	 
	// driver.findelement(By.xpath(xpathExpression))
	}

}
