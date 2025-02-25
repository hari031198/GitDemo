package javastreams;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QL326NG\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		 String Parentwindow = it.next();
		 String childwindow = it.next();
		  driver.switchTo().window(childwindow);
		  driver.get("https://rahulshettyacademy.com/");
		  String coursename=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(5).getText();
		  	System.out.println(coursename);
		  	driver.switchTo().window(Parentwindow);
		  	driver.findElement(By.xpath("//input[@name='name']")).sendKeys(coursename);
	}

}
