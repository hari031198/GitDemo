package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {

	
	//In Testng we can use parameterization by using passing value from xml file and data provider  
    @Test
    public void test11()
    {
        
        System.out.println("Test case 11 in Day1");     
        Assert.assertTrue(false);
    }
    @Parameters({"URL"}) //Only to Particular test method only
    @Test
    public void test12(String urlname)
    {
    	System.out.println(urlname);
        System.out.println("Test case 12 in Day1");
    }
    @Test(dataProvider="finding")
    public void test13(String username, String password)
    {
        System.out.println("Test case 13 in Day1\n");
        System.out.println(username);
        System.out.println(password);
    }

    @DataProvider
    public Object[][] finding()
    {
    	Object[][] data=new Object[3][2];
    	
    	data[0][0] ="first";
    	data[0][1] ="pass";
    	
    	data[1][0] ="second";
    	data[1][1] ="secpass";
    	
    	data[2][0] ="third";
    	data[2][1] ="thpass";
    	
    	return data;
    			
    }
}


