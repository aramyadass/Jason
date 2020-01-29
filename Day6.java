import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6 {
public static void main (String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver", "/Users/machd/Documents/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("Hello");
	Actions acc= new Actions(driver);
	acc.contextClick().perform();
	acc.doubleClick().perform();
	Robot r= new Robot();
	
	
	
}

}