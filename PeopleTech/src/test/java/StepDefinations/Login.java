package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	@Given("launch the required application")
	public void launch_the_required_application() {
		
	       WebDriverManager.chromedriver().setup();

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();

	        // Open a website
	        driver.get("https://ultimateqa.com/complicated-page");

	        // Close the browser
	        //driver.quit();
	}
	
//	@Given("Launch the required application")
//	public void launch_the_required_application() {
//		
//	       WebDriverManager.chromedriver().setup();
//
//	        // Initialize WebDriver
//	        WebDriver driver = new ChromeDriver();
//
//	        // Open a website
//	        driver.get("https://ultimateqa.com/complicated-page");
//
//	        // Close the browser
//	        //driver.quit();
//		
//	}
	

}
