package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id='src']").sendKeys("Chennai");
		//Thread.sleep(2000);
		driver.findElementByXPath("//input[@id='src']").sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@id='dest']").sendKeys("Bangalore");		
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@id='dest']").sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
		driver.findElementByXPath("//input[@id='onward_cal']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//table[@class='rb-monthTable first last']//button[text()='>'])").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//table[@class='rb-monthTable first last']//tr[3]/td[6]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//button[@id='search_btn']").click();
		Thread.sleep(2000);
		
		String result = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Total buses found: "+result);
		
		driver.findElementByXPath("//input[@id='bt_SLEEPER']/following::label[1]").click();
		Thread.sleep(2000);
		
		String result1 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Total Sleeper buses found: "+result1);
		
				
		driver.findElementByXPath("//input[@id='bt_AC']/following-sibling::label").click();
		Thread.sleep(2000);
		
		String result2 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Total Ac buses found: "+result2);
		
		
		
		

		

	}

}
