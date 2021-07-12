package week4.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortingItems {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement moveTo = driver.findElementByXPath("//li[text()='Item 5']");
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		Actions builder = new Actions(driver);
		builder.dragAndDrop(item1, moveTo).perform();
		//builder.clickAndHold(item1).moveToElement(moveTo).release().perform();

	}

}
