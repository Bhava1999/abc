package dailyTestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class GetTitle_Url_Text {
	WebDriver driver;
	
	
  @Test(priority=1)
  public void title() {
	  String exprslt = "Home - TechLearn.in";
	  System.out.println("Expected Title to be displayed:"+ exprslt);
	  String actrslt = driver.getTitle();
	  System.out.println("Actual Title to be displayed:"+ actrslt);
	  Assert.assertEquals(exprslt,actrslt);
	  
  }
  @Test (priority=0)
  public void url()
  {
	  String expectedres = "https://www.techlearn.in/";
	  System.out.println("Url to be displayed:"+ expectedres);
	  String actualres = driver.getCurrentUrl();
	  System.out.println("Url is displayed as:"+ actualres);
	  Assert.assertEquals(actualres, expectedres);
  }
 @Test(priority=2)
 public void text() {
	 String expresult = "Are you looking for Software Testing Job or Job Support ?";
	 System.out.println("Text to be displayed:"+ expresult);
	 String actresult = driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/div/section[1]/div/div[1]/div/div[1]/div/div/div/h1")).getText();
	 System.out.println("Text to be displayed:"+ actresult);
	 Assert.assertEquals(actresult,expresult);
 }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.techlearn.in/");
  }

}
