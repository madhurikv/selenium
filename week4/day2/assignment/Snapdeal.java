package week4.day2.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//navigate to mens fashion
		WebElement element = driver.findElementByXPath("//li[@class='navlink lnHeight']");
		Actions builder = new Actions(driver);
		builder.moveToElement(element).perform();
		//navigate to sports shoe
		builder.moveToElement(driver.findElementByXPath("//span[text()='Sports Shoes']")).click().perform();
		Thread.sleep(2000);
		//sports shoe count is printed
		String count = driver.findElementByXPath("//span[@class='category-count']").getText();
		
		String newCount = count.replaceAll("\\D","");
		System.out.println("Count: " +newCount);
		
		//select training shoes
		driver.findElementByXPath("//div[text()='Training Shoes']").click();
		
		//sort the results from lower to higher
		driver.findElementByXPath("//div[@class='sort-selected']").click();;
		driver.findElementByXPath("//li[@class='search-li']").click();
		List<WebElement> cost = driver.findElementsByXPath("//span[@class='lfloat product-price']");
		//driver.findElementByXPath("//button[text()='View More ']").click();
		
		//select the shoe and click on Quick view(not working)
		
		WebElement image1 = driver.findElementByXPath("(//img[@class='product-image wooble'])[3]");
		WebElement image2 = driver.findElementByXPath("(//div[contains(@class,'center quick-view-bar')])[3]");
		Point location = image2.getLocation();
		builder.moveToElement(image1).pause(2000).perform();
		builder.moveToElement(image1, location.x, location.y).click().perform();
		//builder.moveToElement().click().perform();
		//get the window handles
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		String price = driver.findElementByXPath("//div[@class='product-price pdp-e-i-PAY-l clearfix']//span").getText();
		System.out.println("Price of shoe: "+price);
		String discount = driver.findElementByXPath("(//div[@class='product-price pdp-e-i-PAY-l clearfix']//span)[2]").getText();
		System.out.println("Discount percent: "+discount);
		driver.close();
		driver.switchTo().window(window.get(0));
		driver.close();
		
		
		
		


	}

}
