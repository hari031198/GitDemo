package ssl;

import java.io.IOException;
//import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.MalformedURLException;
import java.net.URL;
//import java.net.URLConnection;
//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.asserts.SoftAssert;

public class Brokenlink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QL326NG\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		//to find the particular link is broken url or not
		
		String url =driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		
		HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int test =conn.getResponseCode();
		System.out.println(test);
		
	}

}
