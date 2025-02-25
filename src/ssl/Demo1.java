package ssl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		ChromeOptions options =new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		//options.addExtensions("file path"); for adding a plugin available in the site
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QL326NG\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		//for maximize
		driver.manage().window().maximize();
		// for delete cookies
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		
	
	}

}
