package SeleniumQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String args[]) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/");
		
		driver.manage().window().maximize();
		
		WebElement elements = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
		elements.click();
		
		WebElement interactions = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/span[1]/div[1]/div[1]"));
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("arguments[0].scrollIntoView(true)", interactions);
		interactions.click();
		
		WebElement droppable = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[4]"));
		droppable.click();
		
		WebElement dragElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement dropElement = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(dragElement, dropElement).build().perform();
		
		WebElement element = driver.findElement(By.cssSelector(""));
		element.getCssValue("Color");
		element.getCssValue("backgroundColour");
	}

}
