package locators;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class IdnameclassNamecssSelectorlinkTextpartialLTtagName {
static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	void test() throws InterruptedException {
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
	//id
		driver.findElement(By.id("email")).sendKeys("7338802507");
		Thread.sleep(2000);
	//name
		driver.findElement(By.name("pass")).sendKeys("Hey123");
		Thread.sleep(2000);
	//clear method
		driver.findElement(By.id("email")).clear();
		Thread.sleep(1000);
	//cssSelector
		driver.findElement(By.cssSelector("input#email")).sendKeys("kushi");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#pass")).sendKeys("abcde1234567890");
		Thread.sleep(2000);
	//linkText
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(2000);
	//partialLinkText
		driver.findElement(By.partialLinkText("Forgotten account?")).click();
		Thread.sleep(1000);
	//tagName
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total images on Facebook :" +images.size());
		Thread.sleep(1000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total links on FB:"+ links.size());	
	}

}
