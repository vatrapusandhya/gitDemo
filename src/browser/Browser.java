package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoke Browser
		//chrome - ChromeDriver		
		System.setProperty("webdriver.chrome.driver", "/Users/sandhyavatrapu/Documents/chromedriver");
		// will get all the chromeDriver methods which are in webDriver interface
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
			
	}

}
