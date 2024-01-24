package StepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import Browserconfiguration.Browser;
import BussinessComponent.Loginpage;
import dev.failsafe.internal.util.Durations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginpageTest {
  Loginpage loginpage;
  public static  WebDriver driver;
  @Test
  @Given("Navigate to movies application")
  public void Navigate_to_movies_application() {
	  driver= new ChromeDriver();
	  driver.get("https://qamoviesapp.ccbp.tech");
	  driver.manage().window().maximize();
      loginpage=new Loginpage(driver);
  }
  @When("Verify user landed on the movieapp homepage")
  public void Verify_user_landed_onthe_movieapp_homepage() {
      loginpage.Displayed(loginpage.logoisdisplayed);
  }
  @When("Verify login heading in the login page")
  public void Verify_login_heading_inthe_loginpage() {
      String str1=loginpage.heading_text();
      String str2="Login";
      if(str1.equals(str2)) {
    	  System.out.println("Test is passed");
      }else {
    	  System.out.println("Test is Failed");
      }
  }
  @Then("Verify username label is displayed")
  public void Verify_usernamelabel_is_displayed() {
      String str3=loginpage.labelusername_text();
      String str4="USERNAME";
      if(str3.equals(str4)) {
    	 System.out.println("Test case is passed");
      }else {
    	  System.out.println("Test case is Failed");
      }
  }
  @Then("Verify password label is displayed")
  public void Verify_passwordlabel_is_displayed() {
      // Write code here that turns the phrase above into concrete actions
	  String str1=loginpage.password_text();
	  String str2="PASSWORD";
	  if(str1.equals(str2)) {
		  System.out.println("Test case is passed");
	  }else {
		  System.out.println("Test case is Failed");
	  }
    }
  @Then("click on the login button in the login page")
  public void click_on_thelogin_button_inthe_loginpage() {
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
	  String str8=driver.getPageSource();
	  System.out.println(str8);
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
  @When("login application account url")
  public void login_application_account_url() {
      loginpage.Verifying_account();
  }
  @When("login application check the url")
  public void login_application_check_the_url() {
      String str5="https://qamoviesapp.ccbp.tech/account";
      String str6=driver.getCurrentUrl();
      if(str5.equals(str6)) {
    	  System.out.println("Test case is passed");
      }else {
    	  System.out.println("Test case is failed");
      }
  }
  @When("login application popular movies Verify displayed")
  public void login_application_popular_movies_verify_displayed() {
      loginpage.Verifying_popular_movies();
  }
  @When("login application Search icon click button")
  public void login_application_search_icon_click_button() {
      loginpage.searchicon();
  }
  @When("login application Search Test movies name count")
  public void login_application_search_test_movies_name_count() {
      loginpage.Search_input();
  }
  @When("Login application movies Count")
  public void login_application_movies_count() {
      loginpage.venom();
      
  }
  @When("login Click on the button another movies")
  public void login_click_on_the_button_another_movies() {
	  loginpage.Verifying_image_venom_background();
     loginpage.Verifying_movies_displayed();
  }
  @When("login application Check Home movie details")
  public void login_application_check_home_movie_details() {
      loginpage.Verfying_hompage_list();
  }
  @When("login application click the popular button")
  public void login_application_click_the_popular_button() {
      loginpage.POPULAR_CLICK();
  }
  @Then("login application Check popular movie details")
  public void login_application_check_popular_movie_details() {
      loginpage.Listofpopularmovies();

  }
  @When("login application popular")
  public void login_application_popular() {
      loginpage.Verifying_popular_click();
  }
  @Then("login application account")
  public void login_application_account() {
      loginpage.verifying_account_page();
  }
  @Then("login application Test the Heading")
  public void login_application_test_the_heading() {
      loginpage.verify_acount_heading();
  }
  @Then("login application Test page title")
  public void login_application_test_page_title() {
      String str7="https://qamoviesapp.ccbp.tech/account";
      String str8=driver.getCurrentUrl();
      if(str7.equals(str8)) {
    	  System.out.println("Test case is passed");
      }else {
    	  System.out.println("Test case is Failed");
      }
      String str=driver.getTitle();
      System.out.println(str);
      String str2=driver.getPageSource();
      System.out.println(str2);
      
  }
}
