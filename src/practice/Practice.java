package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice {

	public static void main(String[] args) throws InterruptedException {
	// Day-1
		System.out.println("Bhavana");
		int i = 10;
		int k = 15;
		int s = 3;
		System.out.println(i+k+s);
		float f= (2.9f);
		float g= (1.2f);
		float y=(f-g);
		System.out.print(y);
	// Day-2
		WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
		

	}

}
