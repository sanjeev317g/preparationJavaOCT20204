package New;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_test1 {
	
	public static void main(String args[]) {
		
        WebDriverManager.chromedriver().setup();

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://ultimateqa.com/complicated-page");
        
        ((JavascriptExecutor) driver).executeScript("window.open('about:blank','_blank');");
        System.out.println("New tab opened");
        
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        String firstTab = driver.getWindowHandles().toArray()[0].toString();
        driver.switchTo().window(firstTab);

        // Close the browser
        //driver.quit();
		
	}

}
