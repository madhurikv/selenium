package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		Alert alert1= driver.switchTo().alert();
		System.out.println("Text in the alert box " +alert1.getText());
		alert1.accept();
		//prompt box
		driver.findElementByXPath("//button[text()='Confirm Box']").click();
		Alert alert2= driver.switchTo().alert();
		System.out.println("Text in the alert box " +alert2.getText());
		alert2.accept();
		driver.findElementByXPath("//button[text()='Confirm Box']").click();
		Alert alert3= driver.switchTo().alert();
		alert3.dismiss();
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		Alert alert4= driver.switchTo().alert();
		System.out.println("Text in the alert box " +alert4.getText());
		alert4.sendKeys("test");
		alert4.accept();
		
		
		

	}

}
