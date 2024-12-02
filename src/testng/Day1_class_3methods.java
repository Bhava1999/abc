package testng;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Day1_class_3methods {
	WebDriver driver;
/*	
  @Ignore
  @Test
  public void f() {
	 String expectedres = "Facebook – log in or sign up";
	 System.out.println("Expected tab Title:"+ expectedres );
	 String actualres   = driver.getTitle();
	 System.out.println("Actual tab Title:"+ actualres );
	 Assert.assertEquals(expectedres, actualres);
  }
  @Ignore
  @Test
  public void f1() {
	 String expectedres = "https://www.facebook.com/";
	 System.out.println("Expected tab Title:"+ expectedres );
	 String actualres   = driver.getCurrentUrl();
	 System.out.println("Actual tab Title:"+ actualres );
	Assert.assertEquals(expectedres, actualres);
  }
 
 
  @Test
  public void f2() {
	 String expectedres = "Javatpoint Homepage";
	 System.out.println("Expected tab Title:"+ expectedres );
	 String actualres   = driver.getTitle();
	 System.out.println("Actual tab Title:"+ actualres );
	 Assert.assertEquals(expectedres, actualres);
  }
  @Test
  public void f3() {
	 String expectedres = "https://www.javatpoint.com/";
	 System.out.println("Expected tab Title:"+ expectedres );
	 String actualres   = driver.getCurrentUrl();
	 System.out.println("Actual tab Title:"+ actualres );
	Assert.assertEquals(expectedres, actualres);
  }
 */
	@Test
	public void f4() {
		String expresult = "Discover Your Journey with Us";
	    String actresult = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[1]/h1")).getText();
	    Assert.assertEquals(expresult,actresult);
	}
	
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.javatpoint.com/");
	
  }

}
