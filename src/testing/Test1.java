package testing;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QL326NG\\Downloads\\chrome-win64\\chrome-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//driver.findElement(By.id("email")).sendKeys("hariharannov398@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("Pass123");
		//driver.findElement(By.name("commit")).click();
		//System.out.println(driver.findElement(By.cssSelector("span.text-with-icon")).getText());

	}

}
