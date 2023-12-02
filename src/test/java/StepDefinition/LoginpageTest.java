package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Browserconfiguration.Browser;
import BussinessComponent.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginpageTest {
  Loginpage loginpage;
  public static  WebDriver driver;
  @Test
  @Given("First login url movies application")
  public void first_login_url_movies_application() {
	  driver= new ChromeDriver();
	  driver.get("https://qamoviesapp.ccbp.tech");
	  driver.manage().window().maximize();
      loginpage=new Loginpage(driver);
  }
  @When("login Website logo is displayed")
  public void login_website_logo_is_displayed() {
      loginpage.Displayed(loginpage.logoisdisplayed);
  }
  @When("login application Heading Text")
  public void login_application_heading_text() {
      String str1=loginpage.heading_text();
      String str2="Login";
      if(str1.equals(str2)) {
    	  System.out.println("Test is passed");
      }else {
    	  System.out.println("Test is Failed");
      }
  }
  @Then("login application label username text")
  public void login_application_label_username_text() {
      String str3=loginpage.labelusername_text();
      String str4="USERNAME";
      if(str3.equals(str4)) {
    	 System.out.println("Test case is passed");
      }else {
    	  System.out.println("Test case is Failed");
      }
  }
  @Then("login application label password text")
  public void login_application_label_password_text() {
      // Write code here that turns the phrase above into concrete actions
	  String str1=loginpage.password_text();
	  String str2="PASSWORD";
	  if(str1.equals(str2)) {
		  System.out.println("Test case is passed");
	  }else {
		  System.out.println("Test case is Failed");
	  }
    }
  @Then("login application click on the button")
  public void login_application_click_on_the_button() {
      loginpage.Button();

  }
  @When("close the browser")
  public void close_browser() {
	 driver.quit();
	  
  }
  @When("login application empty input field")
  public void login_application_empty_input_field() {
      loginpage.Button();
  
  }
  @Then("login application empty username")
  public void login_application_empty_username() {
      loginpage.Password();
      loginpage.Button();
  }
  @When("login application empty password")
  public void login_application_empty_password() {
      loginpage.username();
      loginpage.Button();
      
  }
  @Then("login application Invalid username and password")
  public void login_application_invalid_username_and_password() {
      loginpage.InvalidCredential();
      
  }
  @When("login application Valid username and password")
  public void login_application_valid_username_and_password() {
      loginpage.ValidCredential();
  
  }
  @When("Login Navigate Home page text findout")
  public void login_navigate_home_page_text_findout() {
      
      loginpage.heading_text();
  }
  @Then("login application Hompage display play button")
  public void login_application_hompage_display_play_button() {
     loginpage.display_paly_button();
  }
  @Then("login application List of movies displayed")
  public void login_application_list_of_movies_displayed() {
      loginpage.Moviesdisplayedhompage();
  }
  @Then("login applicstion contact us text")
  public void login_applicstion_contact_us_text() {
      String str1=loginpage.Verify_contact();
      String str2="Contact Us";
      if(str1.equals(str2)) {
    	  System.out.println("Test case is passed");
      }else {
    	  System.out.println("Test case is failed");
      }
  }
  @Then("login application logo is displayed header section")
  public void login_application_logo_is_displayed_header_section() {
      loginpage.Verify_imageisdisplayed();
  }
  @When("login application Navbar is displayed")
  public void login_application_navbar_is_displayed() {
      loginpage.Verify_popular();
  }
  @When("login application homepage url")
  public void login_application_homepage_url() {
      String str1="https://qamoviesapp.ccbp.tech/";
      String str2=driver.getCurrentUrl();
      if(str1.equals(str2)) {
    	  System.out.println("Test case is passed");
      }else {
    	  System.out.println("Test case is failed");
      }
  }
  @Then("login application popular url")
  public void login_application_popular_url() {
      String str2="https://qamoviesapp.ccbp.tech/popular";
      String str3=driver.getCurrentUrl();
      if(str2.equals(str3)) {
    	  System.out.println("Test case is passed");
      }else {
    	  System.out.println("Test case is Failed");
      }

  }
  

}
