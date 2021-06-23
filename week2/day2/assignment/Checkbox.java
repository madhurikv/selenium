package week2.day2.assignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/checkbox.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//select values for the checkbox
		driver.findElement(By.xpath("//div[@class='example']//input")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[4]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[5]")).click();

		//to check value is selected or not
		boolean selected = driver.findElement(By.xpath("//label[contains(text(),'Selenium')]/following::input")).isSelected();
		if(selected==true)
			System.out.println("Already checked");
		
		//clear the default selection
		boolean select1 = driver.findElement(By.xpath("(//label[contains(text(),'DeSelect')]/following::input)[1]")).isSelected();
		if(select1==true)
			driver.findElement(By.xpath("//label[contains(text(),'DeSelect')]/following::input[1]")).click();
		else
			System.out.println("this is not the default value");
			
		WebElement check = driver.findElement(By.xpath("//label[contains(text(),'DeSelect')]/following::input[2]"));
		boolean selected2 = check.isSelected();
		if(selected2==true)
			check.click();
				
		//select all the check boxes of last option
		
			
	    int size = driver.findElementsByXPath("//label[contains(text(),'all below')]/following::input").size();
	    
	    for (int i = 1; i <=size; i++) {
	        driver.findElementByXPath("//label[contains(text(),'all below')]/following::input["+i+"]").click();
	    }
	    
					
	    driver.close();
}
}
