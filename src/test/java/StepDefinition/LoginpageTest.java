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
  @Then("click on thelogin button in the login page")
  public void click_on_thelogin_button_inthe_loginpage() {
      loginpage.click_onthe_button();

  }
  @When("close the browser")
  public void close_browser() {
	 driver.quit();
	  
  }
  @When("Verify empty input fields in the login page")
  public void login_application_empty_input_field() {
      loginpage.click_onthe_button();
  
  }
  @Then("Verify empty username input field")
  public void Verify_emptyusername_inputfield() {
      loginpage.Password();
      loginpage.click_onthe_button();
  }
  @When("Verify empty password input field")
  public void login_application_empty_password() {
      loginpage.username();
      loginpage.click_onthe_button();
      
  }
  @Then("verify the Invalid username and password text is displayed")
  public void login_application_invalid_username_and_password() {
      loginpage.InvalidCredential();
      
      
  }
  @When("Enter Valid username and password and click on the login button")
  public void Enter_Valid_username_and_password() {
      loginpage.ValidCredential();
  
  }
  @When("Verify user navigated to Homepage")
  public void login_navigate_home_page_text_findout() {
      loginpage.movie_card();
  }
  @Then("Verify play button is displayed in moviesapp homepage")
  public void login_application_hompage_display_play_button() {
     loginpage.display_paly_button();
  }
  @Then("verify List of movies card are displayed")
  public void login_application_list_of_movies_displayed() {
      loginpage.Moviesdisplayedhompage();
  }
  @Then("Verify contact button text is displayed are not")
  public void Verify_contact_button_text_is_displayed_are_not() {
      String str1=loginpage.Verify_contact();
      String str2="Contact Us";
      if(str1.equals(str2)) {
    	  System.out.println("Test case is passed");
      }else {
    	  System.out.println("Test case is failed");
      }
  }
  @Then("Verify Movies Banner is displayed")
  public void Verify_Movies_Banner_is_displayed() {
      loginpage.Verify_imageisdisplayed();
  }
  @When("Verify Navbar is displayed")
  public void verify_navbar_is_displayed() {
      loginpage.Verify_popular();
  }
  @When("Verify homepage url")
  public void Verify_homepage_url() {
	  String str8=driver.getPageSource();
	  System.out.println(str8);
  }
  
  @When("Verify account page url")
  public void Verify_account_page_url() {
      loginpage.Verifying_account();
  }
  @When("Verify User Profile page url")
  public void Verify_User_Profile_page_url() {
      String str5="https://qamoviesapp.ccbp.tech/account";
      String str6=driver.getCurrentUrl();
      Assert.assertEquals(str5, str6,"Utl Is not Matched");
  }
  @When("Verify the popular movies is displayed")
  public void Verify_the_popular_movies_is_displayed() {
      loginpage.Verifying_popular_movies();
  }
  @When("Verify Click on the button")
  public void Verify_Click_on_the_button() {
      loginpage.searchicon();
  }
  @When("Verify movies name count")
  public void Verify_movies_name_count() {
      loginpage.Search_input();
  }
  @When("Verify movies Count")
  public void Verify_movies_Count() {
      loginpage.venom();
      
  }
  @When("verify the Navigate another page")
  public void verify_the_Navigate_another_page() {
	  loginpage.Verifying_image_venom_background();
     loginpage.Verifying_movies_displayed();
  }
  @When("Verify Check Movie Home Page details")
  public void Verify_Check_Movie_Home_Page_detailS() {
      loginpage.Verfying_hompage_list();
  }
  @When("verify click on the button popular page")
  public void verify_click_on_the_button_popular_page() {
      loginpage.POPULAR_CLICK();
  }
  @Then("Verify and Check the popular movie details")
  public void Verify_and_Check_the_popular_movie_details() {
      loginpage.Listofpopularmovies();

  }
  @When("Veriify navigate popular page")
  public void Veriify_navigate_popular_page() {
      loginpage.Verifying_popular_click();
  }
  @Then("verify navigate profile page")
  public void verify_navigate_profile_page() {
      loginpage.verifying_account_page();
  }
  @Then("Verify navigate profile page get heading Text")
  public void Verify_navigate_profile_page_get_heading_Text() {
      loginpage.verify_acount_heading();
  }
  @Then("verify profile page title")
  public void verify_profile_page_title() {
      Wait<WebDriver>wait=new WebDriverWait(driver,Duration.ofSeconds(10));
      wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/account"));
      String str7="https://qamoviesapp.ccbp.tech/account";
      String str8=driver.getCurrentUrl();
      Assert.assertEquals(str7,str8,"is url mismatch");
     
  }

@When("Verify profile login page text membership heading")
public void verify_profile_login_page_text_membership_heading() {
    loginpage.gettextmembership();
    
}
@Then("Verify prigile login page plan detail heading")
public void verify_prigile_login_page_plan_detail_heading() {
   loginpage.getplandetals(); 
}
}
