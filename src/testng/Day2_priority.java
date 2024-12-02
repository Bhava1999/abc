package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Day2_priority {
	WebDriver driver;
	
	 @Test(priority=0)
	  public void flipkart() {
		  driver.get("https://www.flipkart.com");
	  }
	  @Test(priority=3)
	  public void myntra() {
		  driver.get("https://www.myntra.com/");
	  }
	  @Test(priority=1)
	  public void amazon() {
		  driver.get("https://www.amazon.com");
	  }
	  @Test(priority=4)
	  public void jio() {
		  driver.get("https://www.jio.com");
	  }
	  @Test(priority=2)
	  public void meesho() {
		  driver.get("https://www.meesho.com");
	  }
	  @Test(priority=5)
	  public void ajio() {
		  driver.get("https://www.ajio.com");
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
	  }

	}
