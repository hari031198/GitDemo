package addingToList;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//another method for selecting a list in the card
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QL326NG\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(30));
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		String[] itemNeeded= {"Beetroot","Cucumber","Beans"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Thread.sleep(3000);
		addItem(driver,itemNeeded);
	
	driver.findElement(By.cssSelector("[alt='Cart']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	
	//explict wait
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
	driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("button.promoBtn")).click();
	
	
	
	//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.cssSelector("span.promoInfo"))));
	
	
	
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
	System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
				
		
	}


public static void addItem(WebDriver driver ,String[] itemNeeded)
{
	List<WebElement> product=driver.findElements(By.cssSelector("h4.product-name"));
	int j=0;
	
	for(int i=0; i<product.size();i++)
	{
		
		String[] name=product.get(i).getText().split("-");
		String formatedName =name[0].trim();
		
		List itemNeededList= Arrays.asList(itemNeeded);
		
		if(itemNeededList.contains(formatedName))
		{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
			
			if(j==itemNeeded.length)
			{
				break;
			}
		}
		
	}

	}

}
