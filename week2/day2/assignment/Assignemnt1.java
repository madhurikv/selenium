package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignemnt1 {
	
	
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://www.leafground.com/");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//navigating to edit page
			driver.findElement(By.xpath("//h5[contains(text(),'Edit')]/..")).click();
			//entering email
			driver.findElement(By.id("email")).sendKeys("madhuri@gmail.com");
			//appending the field
			driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("  value ");;
			//getting the default value
			String retvalue = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
			System.out.println("The default text entered is: "+retvalue);
			//clear the field
			driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
			//check the field is enabled or not
			boolean enabled = driver.findElementByXPath("//label[contains(text(),'Confirm')]/following::input").isEnabled();
			if(enabled==false)
				System.out.println("The field is disabled");
			else
			System.out.println("The field is enabled");
			
			driver.close();

}
}
