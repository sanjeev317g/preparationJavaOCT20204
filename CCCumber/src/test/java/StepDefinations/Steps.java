package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	
	@Given("User Launch chrome browser")
	public void user_launch_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		

	}
	
	

	@When("User opnens URL {string}")
	public void user_opnens_url(String string) {
		
		driver.get(string);
		lp = new LoginPage(driver);
	    // Write code here that turns the phrase above into concrete actions
		
		
	    
	}
	
	

	@And("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String uname, String password) {
//		LoginPage lp = new LoginPage(driver);
		lp.setUserName(uname);
		lp.setpassword(password);
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@And("Click on Login")
	public void click_on_login(){
//		LoginPage lp = new LoginPage(driver);
		lp.clickLogin();
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@And("Click on Checkbox")
	public void Click_on_Checkbox() {
		
		lp.clickCheckbox();
	}
	
	

	
	@Then("Page Title should be {string}")
	public void page_title_should_be(String string) {
		System.out.println("Ignore this step");
//		Assert.assertEquals(string, driver.getTitle());
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("User click on logout link")
	public void user_click_on_logout_link() {
	    // Write code here that turns the phrase above into concrete actions
		lp.clickLogout();
	   
	}



	@Then("Close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	    
	}

}
