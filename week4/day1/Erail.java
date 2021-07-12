package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		List<String> trainName = new ArrayList<String>();
		//clearing the from field and sending new values
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("ms",Keys.TAB);
		//clearing the to field and sending values to the field
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("mdu");
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.ENTER);
		//unchecking the sort by date field
		driver.findElementById("chkSelectDateOnly").click();
		Thread.sleep(3000);
		//fetching the table
		WebElement tableData = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		//retrieving each row
		List<WebElement> rows = tableData.findElements(By.tagName("tr"));
		//for all rows the train name value is stored to the list
		for (WebElement eachrow :rows) {
			List<WebElement> columns = eachrow.findElements(By.tagName("td"));
			trainName.add(columns.get(1).getText());
		}
		//sorting the train name value and printing the same
		Collections.sort(trainName);
		System.out.println("Sorted train names are:");
		System.out.println(trainName);
	}

}
