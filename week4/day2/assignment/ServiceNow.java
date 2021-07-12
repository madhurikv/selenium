package week4.day2.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev113545.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(3000);
		WebElement element = driver.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(element);
		driver.findElementByXPath("//input[@class='form-control']").sendKeys("admin");
		driver.findElementByXPath("//input[@id='user_password']").sendKeys("m3GkKEKU8atr");
		driver.findElementById("sysverb_login").click();
		Thread.sleep(3000);
		driver.findElementById("filter").sendKeys("incident",Keys.TAB);
		WebElement element3 = driver.findElementByXPath("(//div[text()='All'])[2]");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", element3);
		WebElement element2 = driver.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(element2);
		driver.findElementByXPath("//button[@id='sysverb_new']").click();
		
		driver.findElementByXPath("//input[@id='sys_display.incident.caller_id']").sendKeys("FR");
		driver.findElementByXPath("//span[@class='icon icon-search']").click();
		Set<String> handles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(handles);
		driver.switchTo().window(window.get(1));
		driver.findElementByXPath("//td[@class='list_decoration_cell col-small col-center ']//following::a").click();
		driver.switchTo().window(window.get(0));
		driver.switchTo().frame(element2);
		driver.findElementByXPath("//input[@id='incident.short_description']").sendKeys("Cant create test");
		
		String incidentNo = driver.findElementByXPath("//input[@id='incident.number']").getAttribute("value");
		System.out.println("Incident no2: "+incidentNo);
		driver.findElementByXPath("//button[text()='Submit']").click();
		
		//driver.switchTo().frame(element2);
		driver.findElementByXPath("//select[@class='form-control default-focus-outline']/following::input").sendKeys(incidentNo,Keys.ENTER);
		Thread.sleep(2000);
		String text = driver.findElementByXPath("//td[@class='vt']").getText();
		if(text.equals(incidentNo)==true)
			System.out.println("incident created successfully");
		
		
		
	}
}
