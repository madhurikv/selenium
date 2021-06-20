package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Assignment {

	public static void main(String[] args) {
		
			// Step 1: Download and set the path
			WebDriverManager.chromedriver().setup();
			String property = System.getProperty("webdriver.chrome.driver");
			System.out.println(property);
			// Step 2: Launch the chromebrowser
			ChromeDriver driver = new ChromeDriver();
			// Step 3: Load the URL
			driver.get("http://leaftaps.com/opentaps/control/main");
			// Step 4: Maximise the window
			driver.manage().window().maximize();
			// Step 5: Locate the username and type "demosalesmanager"
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			// Step 6: Locate the password and type "crmsfa"
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			// Step 7: Locate the Login button and click it
			driver.findElement(By.className("decorativeSubmit")).click();
			// Step 8: Verify if the login process is successful
			String welcomeText = driver.findElement(By.tagName("h2")).getText();

			if (welcomeText.contains("Welcome"))
				System.out.println(" Login succesful");
			else
				System.out.println("Login failed");

			// Step 9: Click CRM/SFA link
			driver.findElement(By.linkText("CRM/SFA")).click();

			// Step10: Click Leads tab
			driver.findElement(By.linkText("Leads")).click();
			// Step11: Click CreateLead

			driver.findElement(By.linkText("Create Lead")).click();
			// Step12: Enter Company name
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			// Step13: Enter FirstName
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhivya");
			// Step14: Enter LastName
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prabha");

			// DROP DOWN
			WebElement webEleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select drpDown = new Select(webEleSource);
			drpDown.selectByIndex(3);
			
			
			WebElement webElement2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select drpDown2 = new Select(webElement2);
			drpDown2.selectByVisibleText("Catalog Generating Marketing Campaigns");
						

			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Diya");
			driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Prabha");
			driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Miss");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Engineer");
			driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("03/03/92");
			driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
			driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
			driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("101520");
			driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("TT");
			
			WebElement indDrpDown = driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select drpDown3= new Select(indDrpDown);
			drpDown3.selectByValue("IND_SOFTWARE");
			
			WebElement ownerDrpDown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select drpDown4= new Select(ownerDrpDown);
			drpDown4.selectByValue("OWN_PROPRIETOR");
			
			driver.findElementById("createLeadForm_description").sendKeys("Week2 assignment");
			driver.findElementById("createLeadForm_importantNote").sendKeys("Importent Note");
			driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("155");
			driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("7");
			driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("55329");
			driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@test.com");
			driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Diya");
			driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("test/main.com");
			
			driver.findElementById("createLeadForm_generalToName").sendKeys("Alvin");
			driver.findElementById("createLeadForm_generalAttnName").sendKeys("Thomas");
			driver.findElementById("createLeadForm_generalAddress1").sendKeys("Address1");
			driver.findElementById("createLeadForm_generalAddress2").sendKeys("Address2");
			driver.findElementById("createLeadForm_generalCity").sendKeys("Alabama");
			
			WebElement countryDropDown = driver.findElementById("createLeadForm_generalCountryGeoId");
			Select drpDown5 = new Select(countryDropDown);
			drpDown5.selectByValue("USA");
			
			WebElement cityDropDown = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
			Select drpDown6 = new Select(cityDropDown);
			drpDown6.selectByValue("AL");
			
			driver.findElementById("createLeadForm_generalPostalCode").sendKeys("60001");
			driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("6");
			
			// Click CreateLead button
			driver.findElement(By.className("smallSubmit")).click();
			// Step 16: Verify if we are in view Leads page

			String titleView = driver.getTitle();

			if (titleView.equals("View Lead | opentaps CRM"))
				System.out.println(" In the view Page");
			else
				System.out.println(" Not in View Page");

			// Step 17: Get the Company Name
			String cmpnyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			System.out.println(" cmpnyName:" + cmpnyName);
			// //D --> all non Integer values

			System.out.println(cmpnyName.replaceAll("\\d", ""));
			
			driver.findElementByLinkText("Duplicate Lead").click();
			driver.findElement(By.id("createLeadForm_companyName")).clear();
			driver.findElementById("createLeadForm_companyName").sendKeys("ITSolutions");
			driver.findElementByClassName("smallSubmit").click();
			String newCompany = driver.findElementById("viewLead_companyName_sp").getText();
			String newCom = newCompany.replaceAll("\\d", "").replaceAll("[()]","").replaceAll("\\s", "");
			System.out.println(newCom);
			if(newCom.equals("ITSolutions"))
				System.out.println("Company name updated");
			else
				System.out.println("Not updated");
			System.out.println(" New cmpnyName:" + newCompany);
			driver.close();
			
			
			

			//driver.findElementByClassName("decorativeSubmit").click();
			//driver.findElement(By.className("decorativeSubmit")).click();


	}

}
