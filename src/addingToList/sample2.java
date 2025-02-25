package addingToList;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// adding multiple product to cart
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QL326NG\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
int j=0;
		
		String[] itemNeeded= {"Beetroot","Cucumber","Beans"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
				
		List<WebElement> product=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<product.size();i++)
		{
			
			String[] name=product.get(i).getText().split("-");
			String formatedName =name[0].trim();
			
			List itemNeededList= Arrays.asList(itemNeeded);
			
			if(itemNeededList.contains(formatedName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//Thread.sleep(3000);
				
				if(j==itemNeeded.length)
				{
					break;
				}
			}
			
		}

	}

}
