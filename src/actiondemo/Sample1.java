package actiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1 {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\QL326NG\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		// move to specific element
		Actions a=new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))).build().perform();
		
		
		// another method
		WebElement move=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		a.moveToElement(move).build().perform();
		
		//right click on select text
		a.moveToElement(move).contextClick().build().perform();
		
		
		// type text in search box with caps and selected the entire text
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).
		click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

	}

}
