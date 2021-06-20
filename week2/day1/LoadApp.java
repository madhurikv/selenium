package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoadApp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println("Page title:"+title);
		//driver.findElement(By.linkText("CRM/SFA")).click();
		//String titleText = driver.findElementByTagName("h2").getText();
		if(title.equals("Leaftaps - TestLeaf Automation Platform"))
			System.out.println("In the demo page");
		else
			System.out.println("Not in the demo page");

	}

}
