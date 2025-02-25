package addingToList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QL326NG\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		//for selecting single item from the list of items
		
	List<WebElement> product=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<product.size();i++)
		{
			String name=product.get(i).getText();
			
			if(name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
			
		}

	}

}
