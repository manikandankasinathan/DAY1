package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Manikandan\\Downloads\\geckodriver.exe");
	FirefoxDriver driver =new FirefoxDriver();
	driver.get("");
	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe")));
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("admin");
	driver.findElement(By.id("login")).click();
	driver.findElement(By.id("login")).click();

}
}
