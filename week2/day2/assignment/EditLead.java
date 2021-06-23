package week2.day2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	
		    public static void main(String[] args) throws InterruptedException {	
	        WebDriverManager.chromedriver().setup();
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("http://leaftaps.com/opentaps/control/login");
	        driver.manage().window().maximize();
	        
	        driver.findElementById("username").sendKeys("DemoSalesManager");
	        
	        driver.findElementById("password").sendKeys("crmsfa");
	        
	        driver.findElementByClassName("decorativeSubmit").click();
	        
	        driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
	        driver.findElementByLinkText("Leads").click();
	        
	        driver.findElementByLinkText("Find Leads").click();
	        //enter first name as John
	        driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("John");
		    driver.findElementByXPath(" //button[text()='Find Leads']").click();
	        Thread.sleep(3000);
	        //click on the first result
	        /*String company = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-companyName']").getText();
	        System.out.println(company);*/
	        driver.findElementByXPath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')])//a").click();
	       
	        Thread.sleep(3000);
	        
	        //check whether view lead page is opened
	        String title = driver.getTitle();
	        if(title.equals("View Lead | opentaps CRM"))
	        	System.out.println("In the view Lead page");
	       
	        driver.findElementByLinkText("Edit").click();
	        //clear the existing name and send new company name
	        
	        driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
	        driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("CTS");
	        driver.findElementByXPath("//input[@name='submitButton']").click();
	        String comp = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
	        System.out.println(comp);
	        // to check whether company name is updated
	        
	        String newCom = comp.replaceAll("\\d", "").replaceAll("[()]","").replaceAll("\\s", "");
	        System.out.println(newCom);
	        if(newCom.equals("CTS")) {
	            
	           System.out.println("Company name has updated");
	        	 
	        }
	        else {
	        	System.out.println("Didn't change");
	        }
	        driver.close();
	    }

}
