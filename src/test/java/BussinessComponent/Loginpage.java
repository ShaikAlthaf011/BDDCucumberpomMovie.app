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
import org.testng.Assert;

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
	
	@FindBy(xpath="//button[@class='avatar-button']/img")
	public WebElement Account;
	
	@FindBy(xpath="//div[@class='search-movies-container']/li")
	public List<WebElement> Movies_popular;
	
	@FindBy(xpath="//button[@data-testid='searchButton']")
	public WebElement Search_icon;
	
	@FindBy(xpath="//input[@id='search']")
	public WebElement Search;
	
	@FindBy(xpath="//ul[@class='search-movies-container']/li[2]/a/img")
	public WebElement Venom;
	
	@FindBy(xpath="//div[@id='root']/div/div[@class='medium-screen-movie-container']")
	public WebElement Background_image;
	
	@FindBy(xpath="//ul[@class='similar-movies-list-container']/li")
	public List<WebElement> Listofmovies;
	
	@FindBy(xpath="//div[@class='react-slick-item']")
	public List<WebElement> Home_list;
	
	@FindBy(xpath="//*[@id='root']/div/div[1]/nav/div[1]/ul/li[2]/a")
	public WebElement Popular_list;
	
	@FindBy(xpath="//div[@class='search-movies-container']/li")
	public List<WebElement> List_of_movies;
	
	@FindBy(xpath="//*[@id='root']/div/div[1]/nav/div[1]/ul/li[2]/a")
	public WebElement CLICK_POPULAR;
	
	@FindBy(xpath="//*[@id='root']/div/nav/div[2]/button[2]/img")
	public WebElement icon;
	
	@FindBy(xpath="//h1[@class='account-heading']")
	public WebElement Text_account;
	
	@FindBy(xpath="//p[@class='error-message']")
	public WebElement errormessage; 
	
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
    public void click_onthe_button() {
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
    	Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error-message']")));
    boolean flag=errormessage.isDisplayed();
    Assert.assertEquals(flag, true);
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
public void Verifying_account() {
	Account.click();
}
public void Verifying_popular_movies() {
	for(WebElement S:Movies_popular) {
		S.isDisplayed();
	}
}
public void searchicon() {
	Wait<WebDriver>wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-testid='searchButton']")));
	Search_icon.click();
}
public void Search_input() {
	Search.sendKeys("Venom");
	Search_icon.click();
}
public void venom() {
	Wait<WebDriver>wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='search-movies-container']/li[2]/a/img")));
	Venom.click();
}
public void Verifying_image_venom_background() {
	Wait<WebDriver>wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']/div/div[@class='medium-screen-movie-container']")));
	Background_image.isDisplayed();
}
public void Verifying_movies_displayed() {
	Wait<WebDriver>wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='similar-movies-list-container']/li")));
	for(WebElement S:Listofmovies) {
		S.isDisplayed();
	}
}
public void Verfying_hompage_list() {
	Wait<WebDriver>wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='react-slick-item']")));
	for(WebElement S1:Home_list) {
		S1.isDisplayed();
	}
}
public void POPULAR_CLICK() {
	Popular_list.click();
}
public void Listofpopularmovies() {
	for(WebElement S3:List_of_movies) {
		S3.isDisplayed();
	}
}
public void Verifying_popular_click() {
	Wait<WebDriver>wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div[1]/nav/div[1]/ul/li[2]/a")));
	CLICK_POPULAR.click();
}
public void verifying_account_page() {
	icon.click();
}
public String  verify_acount_heading() {
	return Text_account.getText();
}
}
