package au;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class fts {

	@Test
	public void test() throws InterruptedException {
		// Create a new instance of the Firefox driver
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\angelo.luciani\\Downloads\\Selenium\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	driver =new FirefoxDriver();
		
        //Launch the Online Store Website
		driver.get("http://emeamlnws102:8082/jenkins");
 
        // Print a Log In message to the screen
        System.out.println("Open jenkins");
 
		//Wait for 5 Sec
		Thread.sleep(20);
		
        // Close the driver
        driver.quit();
	}

}
