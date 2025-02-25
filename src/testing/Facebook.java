package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QL326NG\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("hariharannov398@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Pass123");
		driver.findElement(By.name("login")).click();
		//System.out.println(driver.findElement(By.id("error_box")).getText());
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
	}

}
