package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	public WebDriver driver;
	

	
	@FindBy(id = "Email")
	WebElement  txtEmail; //= driver.findElement(By.id("Email"));
	
	@FindBy(id = "Password")
	WebElement	txtPassword;// = driver.findElement(By.id("Password"));
	
	//@FindBy(xpath = "//input[@value='Log in']")
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement btnLogin;// = driver.findElement(By.xpath("//input[@value='Log in']"));
	
	@FindBy(linkText = "Logout" )
	WebElement lnkLogout;
	
	//@FindBy(xpath = "//span[text()='Verify you are human']")
	@FindBy(xpath = "//input[()='Verify you are human']")
	WebElement checkBox;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	
	}
	
	public void setpassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin(){
		btnLogin.click();
		
	}
	
	public void clickCheckbox() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("checkBox"))).click();		
	}
	
	public void clickLogout() {
		//lnkLogout.click();
	}
	
	
	
	

}
