package week2.day2.assignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonPage {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/radio.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//give a value for the radio box
		driver.findElement(By.id("yes")).click();
		
		//to find the default value
		boolean sel = driver.findElement(By.xpath("(//input[@name='news'])[2]")).isSelected();
		System.out.println(sel);
		if(sel==true)
			System.out.println("Default value is unchecked");
		else
			System.out.println("Default value is checked");
		boolean selected = driver.findElementByXPath("(//input[@name='age'])[2]").isSelected();
		System.out.println(selected);
		if(selected==true)
			System.out.println("Value is already selected");
		else
			driver.findElementByXPath("(//input[@name='age'])[2]").click();
		
		driver.close();
		
		
}
}
