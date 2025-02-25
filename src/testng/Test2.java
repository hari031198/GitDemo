package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Test2 {

//groups can be used to identify for particular set of operation 
	// we can use include and exclude in the group
	 @Test(groups= {"smoke"})
	 public void Firstclass()
	 {
		 System.out.println("okok");
	 }
}
