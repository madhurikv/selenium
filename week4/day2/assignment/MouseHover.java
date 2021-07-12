package week4.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement element = driver.findElementByClassName("btnMouse");
		Actions builder = new Actions(driver);
		builder.moveToElement(element).perform();
		
		builder.click(driver.findElementByXPath("//a[text()='RPA']")).perform();
		driver.switchTo().alert().accept();

	}

}
