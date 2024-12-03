package SeleniumQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class WindowHandles {
	
	public static void main(String args[]) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.webdriveruniversity.com/");
		
		driver.manage().window().maximize();
		
		WebElement scrollTo_Element = driver.findElement(By.xpath("//h1[contains(text(),'DROPDOWN, CHECKBOXE(S) & RADIO BUTTON(S)')]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollTo_Element);
		
		WebElement element1 = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[7]/a[1]/div[1]/div[2]"));
		element1.click();
		
		String windowHandle = driver.getWindowHandle();
		
		Set<String> windowHAnle = driver.getWindowHandles();
		
		System.out.println(windowHandle);
		System.out.println(windowHAnle);
		
		driver.switchTo().window(windowHandle);
	}
	
	

}
