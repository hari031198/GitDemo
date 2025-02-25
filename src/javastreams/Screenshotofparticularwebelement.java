package javastreams;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotofparticularwebelement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//copying code from Multiplewindowhandling
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
		  String coursename=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']"))
				  .get(5).getText();
		  	System.out.println(coursename);
		  	driver.switchTo().window(Parentwindow);
		  	WebElement name =driver.findElement(By.xpath("//input[@name='name']"));
		  	name.sendKeys(coursename);
		  	//web element screen shot
		  	File file=name.getScreenshotAs(OutputType.FILE);
		  	FileUtils.copyFile(file,new File("C:\\Users\\QL326NG\\screenshot.png"));
		  		// find the height and width of the page
		  	System.out.println(name.getRect().getDimension().getHeight());
		  	System.out.println(name.getRect().getDimension().getWidth());
		  	

	}

}
