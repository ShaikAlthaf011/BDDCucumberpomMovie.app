package Browserconfiguration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Browser {
	public  static  WebDriver driver;
	@Before
	 public void open() {
		 System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		 
	 }

}
