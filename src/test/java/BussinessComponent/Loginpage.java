package BussinessComponent;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browserconfiguration.Browser;

public class Loginpage extends Browser {
	public WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@class='login-container']/div/img")
	public WebElement logoisdisplayed;
	
	@FindBy(xpath="//h1[@class='sign-in-heading']")
	public WebElement Heading;
	
	@FindBy(xpath="//label[@for='usernameInput']")
	public WebElement label;
	
	@FindBy(xpath="//label[@for='passwordInput']")
	public WebElement password;
	
	@FindBy(xpath="//button[@class='login-button']")
	public WebElement button;
	
	@FindBy(xpath="//input[@id='passwordInput']")
	public WebElement password_input;
	
	@FindBy(xpath="//input[@id='usernameInput']")
	public WebElement username_input;
	
	@FindBy(xpath="//h1[@class='movies-list-heading']")
	public List<WebElement>homepage_heading;
	
	@FindBy(xpath="//button[@class='home-movie-play-button']")
	public WebElement play_button;
	
	@FindBy(xpath="//div[@class='react-slick-item']/img")
	public List<WebElement> movie_list;
	
	@FindBy(xpath="//p[@class='contact-us-paragraph']")
	public WebElement Contact;
	
	@FindBy(xpath="//img[@class='website-logo']")
	public WebElement Movie;
	
	@FindBy(xpath="//ul[@class='nav-menu-list']/li/a[contains(text(),'Popular')]")
	public WebElement Popular;
	
	
    public boolean Displayed( WebElement element ) {
    	return element.isDisplayed();
    }
    public String  heading_text() {
    	Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='sign-in-heading']")));
    	 return Heading.getText();
    }
    public String labelusername_text() {
    	return label.getText();
    }
    public String password_text() {
    	return password.getText();
    }
    public void Button() {
    	button.click();
    }
    public void Password() {
    	password_input.sendKeys("rahul@2021");
    }
    public void username() {
    	username_input.sendKeys("rahul");
    }
    public void InvalidCredential() {
    	username_input.sendKeys("althaf");
    	password_input.sendKeys("rahul@2021");
    	button.click();
    }
    public void ValidCredential() {
    	username_input.sendKeys("rahul");
    	password_input.sendKeys("rahul@2021");
    	button.click();
    }
    public void Hompage_heading() {
    	Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[@class='movies-list-heading']")));
    	for(WebElement S:homepage_heading) {
    		S.getText();
    	}
    }
   public void display_paly_button() {
   	Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='home-movie-play-button']")));
   	play_button.isDisplayed();
  
   }
	public void  Moviesdisplayedhompage() {
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='react-slick-item']/img")));
		for(WebElement S:movie_list) {
			S.isDisplayed();
		}
	}
  public String Verify_contact() {
	  Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='contact-us-paragraph']")));
	  return Contact.getText();
  }
public boolean Verify_imageisdisplayed() {
	Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='website-logo']")));
	return Movie.isDisplayed();
}
public void Verify_popular() {
	Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='nav-menu-list']/li/a[contains(text(),'Popular')]")));
	Popular.click();
}

}
