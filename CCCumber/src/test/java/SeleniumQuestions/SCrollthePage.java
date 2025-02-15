package SeleniumQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class SCrollthePage {
	
	
	
	public static void main (String args[]) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.webdriveruniversity.com/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//h1[contains(text(),'DROPDOWN, CHECKBOXE(S) & RADIO BUTTON(S)')]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
		WebElement element1 = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[7]/a[1]/div[1]/div[2]"));
		element1.click();
		
		
		
		
		//List<WebElement> ddown = driver.findElements(By.xpath("//select[@id='dropdowm-menu-1']"));
		WebElement ddown = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
//		Select select = new Select((WebElement) ddown);
		Select select = new Select(ddown);
		List<WebElement> allOptions = select.getOptions();
		for(WebElement list_elements :allOptions) {
			System.out.println(list_elements.getText());
		}
//		select.selectByIndex(1);
//		select.selectByVisibleText("SQL");
//		List<WebElement> dropdown = driver.findElements(By.xpath(ddown));
		System.out.println("List of dropdown Elements" + select);
		
		
	}

}
