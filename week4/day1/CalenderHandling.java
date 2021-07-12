package week4.day1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandling {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/Calendar.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("datepicker")).click();
	driver.findElementByXPath("//span[@class='ui-icon ui-icon-circle-triangle-e']").click();
	
	WebElement table = driver.findElementByXPath("//table[@class='ui-datepicker-calendar']");
	//List<WebElement> rows = table.findElements(By.tagName("tr"));
	table.findElement(By.xpath("//tr[2]/td[3]")).click();
	String text = table.findElement(By.xpath("//tr[2]/td[3]")).getText();
	System.out.println(text);
	
	
	
	
	}

}
