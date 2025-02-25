package actiondemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UnsafetyWebSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options= new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QL326NG\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
