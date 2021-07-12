package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameLearning {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/frame.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        int size = driver.findElementsByTagName("iframe").size();
        
        int count = size;
        for (int i = 0; i < size; i++) {
            driver.switchTo().frame(i);
            count = count+driver.findElementsByTagName("iframe").size();
            driver.switchTo().defaultContent();
        }
        
        System.out.println(count);
        
    }


	}


