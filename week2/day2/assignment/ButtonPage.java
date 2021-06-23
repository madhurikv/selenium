package week2.day2.assignment;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

		
	public class ButtonPage {		
			public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				
				ChromeDriver driver = new ChromeDriver();
				
				driver.get("http://leafground.com/pages/Button.html");
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				//check whether the screen navigate to home page
				driver.findElement(By.id("home")).click();
				String currenturl = driver.getCurrentUrl();	
				System.out.println(currenturl);
				if(currenturl.equals("http://leafground.com/home.html"))
					System.out.println("In the home page");
				else
					System.out.println("Not in the home page");
				//navigate to button tab
				driver.findElement(By.xpath("//h5[contains(text(),'Button')]/..")).click();
			    //find the location of the field
				Point location = driver.findElement(By.id("position")).getLocation();
				System.out.println("Location of the point is: "+location);
				//color of the field
				String color = driver.findElement(By.id("color")).getCssValue("color");
				System.out.println("color of the text box is:"+ color);
				//size of the field
				Dimension size = driver.findElement(By.id("size")).getSize();
				System.out.println("The size of the box is: " +size);
				
				
				driver.close();

	}
	
}
