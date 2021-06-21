package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DropDownXpath {
	

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://www.leafground.com");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.linkText("Drop down")).click();
			
			WebElement webElement1 = driver.findElement(By.id("dropdown1"));
			Select drpDown1 = new Select(webElement1);
			drpDown1.selectByVisibleText("Selenium");
			
			WebElement webElement2 = driver.findElement(By.name("dropdown2"));
			Select drpDown2 = new Select(webElement2);
			drpDown2.selectByValue("3");
			
			WebElement webElement3 = driver.findElement(By.id("dropdown3"));
			Select drpDown3 = new Select(webElement3);
			drpDown3.selectByVisibleText("Loadrunner");
			
			WebElement webElement4 = driver.findElement(By.className("dropdown"));
			Select drpDown4 = new Select(webElement4);
			
			
			drpDown4.selectByVisibleText("Loadrunner");
			
			/*WebElement webElement5 = driver.findElement(By.xpath("//select[@class='dropdown']/following::div"));
			Select drpDown5 = new Select(webElement5);
			drpDown5.selectByVisibleText("UFT/QTP");
			*/
			WebElement webElement6 = driver.findElement(By.xpath("((//div[@class='example'])[6]"));
			Select drpDown6 = new Select(webElement6);
			drpDown6.selectByVisibleText("Selenium");
			//drpDown6.selectByVisibleText("Appium");
			
			driver.close();
			

		}

	}


