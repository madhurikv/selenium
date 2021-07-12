package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class IrctcWindow {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElementByXPath("//button[@class='btn btn-primary']").click();
		driver.findElementByXPath("//a[text()=' FLIGHTS ']").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String text = driver.findElementByXPath("//img[@class='img-fluid d-none d-md-block']").getAttribute("title");
		System.out.println("Title of the new window: "+driver.getTitle());
		System.out.println("Title of the logo:" +text);
		driver.close();
		driver.switchTo().window(windows.get(0));
		System.out.println("Title of the first page: "+driver.getTitle());
		

	}

}
