package week2.day2;


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
			drpDown1.selectByIndex(2);;
			
			WebElement webElement2 = driver.findElement(By.name("dropdown2"));
			Select drpDown2 = new Select(webElement2);
			drpDown2.selectByVisibleText("Selenium");
			
			WebElement webElement3 = driver.findElement(By.id("dropdown3"));
			Select drpDown3 = new Select(webElement3);
			drpDown3.selectByValue("2");
			
			WebElement webElement4 = driver.findElement(By.className("dropdown"));
			Select drpDown4 = new Select(webElement4);
			//size of the list
			int size = drpDown4.getOptions().size();
			System.out.println("size of the drop down list " +size);
			
			
			drpDown4.selectByVisibleText("Loadrunner");
			
			driver.findElement(By.xpath("//select[@class='dropdown']/following::select")).sendKeys("UFT/QTP");
			//Select drpDown5 = new Select(webElement5);
			//drpDown5.selectByVisibleText("UFT/QTP");

WebElement webElement5 = driver.findElement(By.xpath("//div[@id='contentblock']//following::select[5]"));
Select drpDown5 = new Select(webElement5);
drpDown5.selectByVisibleText("UFT/QTP");

			
			/*WebElement webElement6 = driver.findElement(By.xpath("//select[@class='dropdown']/following::select[2]"));
			Select drpDown6 = new Select(webElement6);
			if(drpDown6.isMultiple()){
				drpDown6.selectByIndex(2);
				drpDown6.selectByIndex(3);
			}*/
			driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option")).click();
			driver.findElementByXPath("(//option[text()='Select your programs']/following-sibling::option)[2]").click();
			
			driver.close();
			
			
		}

	}


