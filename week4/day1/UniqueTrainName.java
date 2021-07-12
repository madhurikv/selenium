package week4.day1;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UniqueTrainName {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<String> trainName = new ArrayList<String>();
		Set<String> uniqueName = new HashSet<String>();
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("dli", Keys.TAB);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElementById("txtStationTo").sendKeys("tvc", Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		Thread.sleep(3000);
		WebElement table =driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			List<WebElement> columns = eachrow.findElements(By.tagName("td"));
			trainName.add(columns.get(1).getText());
			
		}
		System.out.println("no of trains: "+trainName.size());
		System.out.println("train names: "+trainName);
		uniqueName.addAll(trainName);
		System.out.println("No of unique trains: "+uniqueName.size());
		System.out.println("Unique train names are: "+uniqueName);
		
		
		
		

	}

}
