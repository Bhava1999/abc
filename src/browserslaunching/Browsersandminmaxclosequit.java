package browserslaunching;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsersandminmaxclosequit {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		//driver.close();
		driver.quit();
	}
	

}
