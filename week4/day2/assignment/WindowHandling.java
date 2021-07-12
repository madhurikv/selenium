package week4.day2.assignment;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.findElementById("username").sendKeys("DemoSalesManager");
        
        driver.findElementById("password").sendKeys("crmsfa");
        
        driver.findElementByClassName("decorativeSubmit").click();
        
        driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
        driver.findElementByXPath("//a[text()='Leads']").click();
        //navigate to merge leads page
        driver.findElementByXPath("//a[text()='Merge Leads']").click();
        driver.findElementByXPath("//table[@class='twoColumnForm']//tr//img").click();
        //get the windowhandlers
        Set<String> handles = driver.getWindowHandles();
        List<String> newHandles = new ArrayList<String>(handles);
        //navigate to new window
        driver.switchTo().window(newHandles.get(1));
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10027");
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Thread.sleep(2000);
        //save the lead id
        String text = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
        driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
       //back to the original window
        driver.switchTo().window(newHandles.get(0));
        
        driver.findElementByXPath("(//table[@class='twoColumnForm']//tr//img)[2]").click();
        Set<String> handles2 = driver.getWindowHandles();
        List<String> newHandles2 = new ArrayList<String>(handles2);
        driver.switchTo().window(newHandles2.get(1));
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10009");
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Thread.sleep(2000);
        //String text = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
        driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
        driver.switchTo().window(newHandles.get(0));
        driver.findElementByXPath("//a[@class='buttonDangerous']").click();
        driver.switchTo().alert().accept();
        driver.findElementByXPath("//a[text()='Find Leads']").click();
        driver.findElementByXPath("//input[@name='id']").sendKeys(text);
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        String errorMsg = driver.findElementByXPath("//div[text()='No records to display']").getText();
        //System.out.println(errorMsg);
        
        if(errorMsg.contains("No records")==true)
        {
        	System.out.println("No match found, records merged");
        	
        }else
        	System.out.println("Match found");
        
         
        System.out.println(text);
        
        driver.close();

	}

}
