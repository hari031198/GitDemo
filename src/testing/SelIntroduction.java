package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QL326NG\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
				//WebDriver driver = new FirefoxDriver();
				
				//System.setProperty("webdriver.edge.driver","C:\\Users\\QL326NG\\Downloads\\edgedriver_win64\\msedgedriver.exe");
				WebDriver driver = new EdgeDriver ();
				
				driver.get("https://www.amazon.in");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.quit();
				
	}

}
