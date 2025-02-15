package SeleniumQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class ALertPopup {
	
	public static void main(String args[]) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]"));
		element.click();
		
		
		
		WebElement alertTab = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]"));
		alertTab.click();
		
		WebElement clickME = driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickME.click();
		
		Alert alert = driver.switchTo().alert();
		
		String str = alert.getText();
		System.out.println("Alert String :" + str);
		alert.accept();

		
		
		
	}

}
