package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperlinkPage {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//check whether the screen navigate to home page
		String link1 = driver.findElement(By.linkText("Go to Home Page")).getAttribute("href");
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		String currenturl = driver.getCurrentUrl();	
		System.out.println(currenturl);
		if(currenturl.equals("http://leafground.com/home.html"))
			System.out.println("In the home page");
		else
			System.out.println("Not in the home page");
		//navigate to hyperlink tab
		driver.findElement(By.xpath("//h5[contains(text(),'HyperLink')]/..")).click();
		
		//getting the link 
		String link = driver.findElement(By.partialLinkText("Find where am supposed")).getAttribute("href");
		System.out.println("the link is: "+link);
		//to check whether link is broken
		//get the title and then check the title contains 404
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String title = driver.getTitle();
		
		if(title.contains("404"))
			System.out.println("Link is broken");
		else 
			System.out.println("Not broken");
		
		driver.get("http://leafground.com/pages/Link.html");
				
		// to compare the links
		String link2 = driver.findElementByLinkText("Go to Home Page").getAttribute("href");
		if(link1.equals(link2)) {
			System.out.println("both links are same");
			driver.findElementByLinkText("Go to Home Page").click();
		}
		driver.findElement(By.xpath("//h5[text()='HyperLink']/..")).click();
		// how many links in the page
		//driver.findElement(By.partialLinkText("How many links")).getAttribute("href");
		int size = driver.findElementsByXPath("//a").size();
		System.out.println("Number of links in the page is:" +size);
		
		//WebElement element = driver.findElement(By.tagName("a"));
		
		//System.out.println(element);
		

}
}


