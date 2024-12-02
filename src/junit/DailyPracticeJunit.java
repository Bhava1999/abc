package junit;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class DailyPracticeJunit {
	static WebDriver driver;
//Day-1
	@Disabled
	@BeforeEach
	void setUp1() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Disabled
	@AfterEach
	void tearDown() throws Exception {
		driver.close();
	}
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
@Disabled
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	}	
	@Disabled
	@Test
	void test1() {
		driver.get("https://www.whatsapp.com/");		
	}
	@Disabled
	@Test
	void test2() {
		driver.get("https://www.facebook.com");		
	}
	@Disabled
	@Test
	void test3() {
		driver.get("https://www.x.com");		
	}

//Day-2

@Test
void locators() throws InterruptedException {
	driver.get("https://demo.opencart.com/");
	Thread.sleep(2000);
	List <WebElement> links= driver.findElements(By.tagName("a"));
	System.out.println("Total number of links in Application :"+ links.size());
	}
}
