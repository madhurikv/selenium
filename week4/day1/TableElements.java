package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableElements {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
	WebElement table = driver.findElement(By.id("table_id"));
	List<WebElement> columns = table.findElements(By.tagName("th"));
	int columnSize = columns.size();
	System.out.println("Column Size is: "+columnSize);
	
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	int rowSize = rows.size();
	System.out.println("Row Size is: "+rowSize);
		
		String text = driver.findElementByXPath("//table[@id='table_id']//tr[3]/td[2]").getText();
		System.out.println("The progress value of learn to interact with elements is: " +text);

		List<WebElement> column = table.findElements(By.xpath("//tr/td[2]"));
		List<Integer> vital = new ArrayList<Integer>();
		
		
		for (WebElement eachcolumn : column) {
			
			String mark = eachcolumn.getText().replaceAll("%","");
			System.out.println(mark);
			vital.add(Integer.parseInt(mark));
		}
		 Collections.sort(vital);
		 int least = vital.get(0);
		 driver.findElementByXPath("//td[contains(text(),'"+least+"')]//following-sibling::td/input").click();
	}
	

}
