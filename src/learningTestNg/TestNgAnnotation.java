package learningTestNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgAnnotation {
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Suite");
	}
	
	@Test
	public void test1(){
		System.out.println("Testing DataSet1");
	}
	
	@Test
	public void test2(){
		System.out.println("Testing DataSet2");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("After Suite");
	}

}
