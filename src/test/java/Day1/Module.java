package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Module {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Manikandan\\Downloads\\geckodriver.exe");
	FirefoxDriver driver =new FirefoxDriver();
	driver.get("http://192.168.1.37:8989/opsngn/opsngn.html;jsessionid=52A18AB4A5BC82EECDADF6383F09F8A6");
	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe")));
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("admin");
	driver.findElement(By.id("login")).click();

    WebElement element = driver.findElement(By.xpath("//*[@id='CONFIG']"));

    Actions action = new Actions(driver);

    action.moveToElement(element).build().perform();

   // driver.findElement(By.linkText("Bandwidth Manager")).click();
	//driver.findElement(By.xpath("//div[@class='icon-group-config dm-group-icon']")).click();
	//WebElement wb=driver.findElement(By.xpath("//div[@id='CONFIG']"));
	
/*	driver .findElement(By.linktext)
    Actions builder = new Actions(driver);
    Action mouseOverHome = builder.moveToElement(wb).build();*/
	}
}