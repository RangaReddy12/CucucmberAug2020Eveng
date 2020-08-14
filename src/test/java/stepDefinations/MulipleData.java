package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MulipleData {
WebDriver driver;
String url="http://orangehrm.qedgetech.com/";
@When("^Launch url  \"([^\"]*)\" in a browser$")
public void launch_url_in_a_browser(String brw) throws Throwable {
 if(brw.equalsIgnoreCase("chrome"))
 {
	 System.out.println("Executing on Chrome browser");
	 driver= new ChromeDriver();
	 driver.get(url);
	 driver.manage().window().maximize();
 }
 else if(brw.equalsIgnoreCase("firefox"))
 {
	 System.out.println("Executing on firefox browser");
	 driver= new FirefoxDriver();
	 driver.get(url); 
 }
}

@When("^Enter username \"([^\"]*)\" in textbox$")
public void enter_username_in_textbox(String username) throws Throwable {
    driver.findElement(By.name("txtUsername")).sendKeys(username);
}

@When("^Enter password \"([^\"]*)\" in textbox$")
public void enter_password_in_textbox(String password) throws Throwable {
	driver.findElement(By.name("txtPassword")).sendKeys(password);
}

@When("^Click login$")
public void click_login() throws Throwable {
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
}

@Then("^validate text in url$")
public void validate_text_in_url() throws Throwable {
	if(driver.getCurrentUrl().contains("dash"))
	  {
		  System.out.println("Login Success");
	  }
	  else
	  {
		  System.out.println("Login fail");
	  } 
}

@Then("^Closing browser$")
public void closing_browser() throws Throwable {
    driver.close();
}

}
