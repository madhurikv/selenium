package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("eafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement webElement1 = driver.findElement(By.id("dropdown1"));
		Select drpDown1 = new Select(webElement1);
		drpDown1.selectByVisibleText("Selenium");
		
		WebElement webElement2 = driver.findElement(By.name("dropdown2"));
		Select drpDown2 = new Select(webElement2);
		drpDown2.selectByValue("1");
		
		WebElement webElement3 = driver.findElement(By.id("dropdown3"));
		Select drpDown3 = new Select(webElement3);
		drpDown3.selectByVisibleText("Loadrunner");
	}

}
