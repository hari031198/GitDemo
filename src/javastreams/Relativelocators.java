package javastreams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Relativelocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QL326NG\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//relative locators are not suppott flex html code
	//above locators
		WebElement  name=driver.findElement(By.xpath("//input[@name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText());
		//below locators
		    WebElement alpha= driver.findElement(By.cssSelector("[for='dateofBirth']"));
		  driver.findElement(with(By.tagName("input")).below(alpha)).click();
		    //left before
		  WebElement iceCreamLabel =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();
//right before
WebElement rdb = driver.findElement(By.id("inlineRadio1"));
 System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());


	}

}
