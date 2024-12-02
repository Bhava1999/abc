package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Day2 {
	
		WebDriver driver;
	  @Test
	  public void flipkart() {
		  driver.get("https://www.flipkart.com");
	  }
	  @Test
	  public void jio() {
		  driver.get("https://www.jio.com");
	  }
	  @Test
	  public void myntra() {
		  driver.get("https://www.myntra.com/");
	  }
	  @Test
	  public void amazon() {
		  driver.get("https://www.amazon.com");
	  }
	  @Test
	  public void meesho() {
		  driver.get("https://www.meesho.com");
	  }
	  @Test
	  public void ajio() {
		  driver.get("https://www.ajio.com");
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
	  }

	}
 