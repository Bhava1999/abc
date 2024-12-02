package junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

class JunitOne {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	}

	@Test
	void test() {
		driver.get("https://www.amazon.com");
		
	}
	@Test
	void test1() {
		driver.get("https://www.flipkart.com");
		
	}

	@Test
	void test2() {
		driver.get("https://www.meesho.com");
		
	}

	@Test
	void test3() {
		driver.get("https://www.myntra.com");
		
	}
@Disabled
	@Test
	void test4() {
		driver.get("https://www.amazon.com");
		
	}


}
