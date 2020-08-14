package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginsingledata {
	WebDriver driver;
	@Given("^I lanuch url in chrome browser$")
	public void i_lanuch_url_in_chrome_browser() throws Throwable {
	  driver= new ChromeDriver();
	  driver.get("http://orangehrm.qedgetech.com/");
	  driver.manage().window().maximize();
	}

	@When("^I enter  into username field$")
	public void i_enter_into_username_field() throws Throwable {
	    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	}

	@When("^I enter  into password field$")
	public void i_enter_into_password_field() throws Throwable {
	    driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#"); 
	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	    
	}

	@Then("^I should verify dashboard text int url$")
	public void i_should_verify_dashboard_text_int_url() throws Throwable {
	  if(driver.getCurrentUrl().contains("dash"))
	  {
		  System.out.println("Login Success");
	  }
	  else
	  {
		  System.out.println("Login fail");
	  }
	}
	@Then("^I close Browser$")
	public void i_close_Browser() throws Throwable {
	 driver.close();   
	}

}
