package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.Login;

public class StepDef {
	
	public WebDriver driver;
	public Login lp;
	@Given("Browser opened successfully")
	public void browser_opened_successfully() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		lp =new Login(driver);
	}

	@When("User open the url {string}")
	public void user_open_the_url(String string) {
		driver.get(string);
	   
	}

	@When("User enter email address {string} and password {string}")
	public void user_enter_email_address_and_password(String string, String string2) throws InterruptedException {
		lp.enterEmail(string);
	    lp.enterPass(string2);
	    Thread.sleep(3000);
	}
	
	@When("Select the organasation type from dropdown list")
	public void select_the_organasation_type_from_dropdown_list() {
		lp.selectListValue();
	}
	

	@When("Click on login button")
	public void click_on_login_button() {
		lp.clickOnLoginButton();
	   
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) {
		String s = driver.getTitle();
		System.out.println(s);
		if (s.equalsIgnoreCase(string)) {
			System.out.println("Title is matching");	
		}
		else
		{
			System.out.println("Title is not matching");
		}
		
	    	}

	@When("User click on logout")
	public void user_click_on_logout() {
	    lp.clickOnLogoutButton();
	}

	@Then("Close the browser")
	public void close_the_browser() {
		driver.close();
	    
	}




}
