package testng;

//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class Test3 {
	
	 @Parameters({"URL"})
	 @Test
    
	  public void Action(String urlname)
	 {
		 System.out.println(urlname);
		 System.out.println("testing");
		
	 }
}
