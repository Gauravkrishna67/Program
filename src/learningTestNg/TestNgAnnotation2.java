package learningTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotation2 {
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test");
	}
	
	@Test
	public void test3(){
		System.out.println("Testing DataSet3");
	}
	
	@Test
	public void test4(){
		System.out.println("Testing DataSet4");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("After test");
	}
	
	@BeforeClass
	public void BeforeClass(){
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void AfterClass(){
		System.out.println("After Class");
	}
	

}
