package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("http://google.com");
	driver.navigate().to("http://facebook.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.close();
	
}
}