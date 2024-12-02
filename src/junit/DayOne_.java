package junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DayOne_ {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("I am Bhavana!");
	}
	

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Ok Bye");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Nice to see you");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Thank you");	
	}
			
	@Test	
	void test1() {
		System.out.println("Hai, I am Ramya");
	}
	@Test	
	void test2() {
		System.out.println("Hello, I am Priya");
	}
@Disabled
	@Test	
	void test3() {
		System.out.println("Hy, I am sita");
	}
}
