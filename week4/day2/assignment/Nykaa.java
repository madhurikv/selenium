package week4.day2.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement brands = driver.findElementByXPath("//a[text()='brands']");
		Actions builder = new Actions(driver);
		builder.moveToElement(brands).perform();;
		builder.moveToElement(driver.findElementByXPath("//a[text()='Popular']")).perform();;
		driver.findElementByXPath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']").click();
		Thread.sleep(2000);
		Set<String> handle = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(handle);
		driver.switchTo().window(window.get(1));
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
	if(pageTitle.contains("L'Oreal Paris")==true)
		System.out.println("Match found");
	else
		System.out.println("Match not found");
	
	driver.findElementByXPath("//span[text()='Sort By : ']").click();
	driver.findElementByXPath("(//div[@class='control control--radio text-capitalize'])[4]").click();
	driver.findElementByXPath("//div[text()='Category']").click();
	//WebElement element1 = driver.findElementByXPath("//div[text()='Category']");
	JavascriptExecutor executor = (JavascriptExecutor)driver;
    //executor.executeScript("arguments[0].click();", element1);
	driver.findElementByXPath("//span[text()='Hair']").click();
	driver.findElementByXPath("//span[text()='Hair Care']").click();
	driver.findElementByXPath("//span[text()='Shampoo']").click();
	
	String text = driver.findElementByXPath("//li[text()='Shampoo']").getText();
	if(text.contains("shampoo")==true)
		System.out.println("Filter is applied");
	
	driver.findElementByXPath("//span[contains(text(),'Colour Protect')]").click();
	Set<String> handle1 = driver.getWindowHandles();
	List<String> window1 = new ArrayList<String>(handle1);
	driver.switchTo().window(window1.get(2));
	Thread.sleep(3000);
	driver.findElementByXPath("//span[@class='size-pallets']").click();
	String price = driver.findElementByXPath("//span[@class='post-card__content-price-offer']").getText();
	System.out.println("Price: "+price);
	driver.findElementByXPath("//button[text()='ADD TO BAG']").click();
	driver.findElementByXPath("//div[@class='BagItems ']").click();
	
	String grandTotal = driver.findElementByXPath("//div[@class='first-col']//div[1]").getText();
	System.out.println("Grand Total: "+grandTotal);
	String replace = grandTotal.replaceAll("\\D","");
	//System.out.println(replace);
	WebElement element = driver.findElementByXPath("//span[text()='Proceed']");
	//JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", element);
	
	driver.findElementByXPath("//button[text()='CONTINUE AS GUEST']").click();
	String text4 = driver.findElementByXPath("(//div[@class='value']//span)[2]").getText();
	System.out.println(text4);
    
    if(replace.equals(text4))
    {
        System.out.println("Price Matched");
    }
	
driver.quit();
	
	
  
}

}
