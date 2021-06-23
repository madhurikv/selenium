package week2.day2.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
        
        driver.findElementById("username").sendKeys("DemoSalesManager");
        
        driver.findElementById("password").sendKeys("crmsfa");
        
        driver.findElementByClassName("decorativeSubmit").click();
        
        driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
        //navigate to leads tab
        driver.findElementByLinkText("Leads").click();
        driver.findElementByLinkText("Find Leads").click();
        //click on phone tab
        
        driver.findElementByXPath("//span[text()='Phone']").click();
        
       //enter phone number 99
        driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(3000);
        //select the first result
        String comId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getAttribute("text");
        System.out.println(comId);
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
        //delete the lead
        
        driver.findElementByXPath("//a[text()='Delete']").click();
        driver.findElementByXPath("//a[text()='Find Leads']").click();
        
        //to check if the lead exists
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys(comId);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        String dismsg = driver.findElement(By.xpath("//button[text()='Export To Excel']/following::div")).getText();
        System.out.println(dismsg);
        if(dismsg.contains("No records"))
        	System.out.println("Record is deleted");
        else
        	System.out.println("Record is not deleted");
        driver.close();
        
        
        
	
		
		
		
		
		
	}
}
