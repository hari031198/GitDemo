package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tata1 {
	
	@Test
	// @Test indicates the annotation , every time need to mentioned @test for each method
	 public void Demo()
	 {
		
		System.out.println("Hello");

	 }
	 @AfterTest
	 public void Firstclass()
	 {
		 System.out.println("test");
	 }

}
