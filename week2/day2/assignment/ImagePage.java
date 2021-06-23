package week2.day2.assignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagePage {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Image.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//check whether the screen navigate to home page
		driver.findElement(By.xpath("//label[contains(text(),' on this image ')]/following::img")).click();
		
		String currenturl = driver.getCurrentUrl();	
		System.out.println(currenturl);
		if(currenturl.equals("http://leafground.com/home.html"))
				System.out.println("In the home page");
		else
				System.out.println("Not in the home page");
		//navigate to image tab
		driver.findElement(By.xpath("//h5[contains(text(),'Image')]/..")).click();
				
		driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following::img")).click();
		String title2 = driver.getTitle();
		if(title2.contains("Interact with Images")) {
			System.out.println("Link is broken still in the same page");
			
		}
		else
			driver.findElement(By.xpath("//label[contains(text(),' Keyboard')]/following::img")).click();
			
		//click on the link 		
		
	    /* String src = driver.findElementByXPath("(//img)[3]").getAttribute("src");
	        driver.get(src);
	        String title = driver.getTitle();
	        
	        if(title.contains("404")) {
	            System.out.println("Image is Broken");*/
		driver.findElementByXPath("//label[text()='Click me using Keyboard or Mouse']/following::img").click();	
		
		//driver.close();

}

	}

