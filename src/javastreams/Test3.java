package javastreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QL326NG\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click on the column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all webelement into list
		List<WebElement> data=driver.findElements(By.xpath("//tr/td[1]"));
		List<String> orgdata= data.stream().map(s->s.getText()).collect(Collectors.toList());
		//sorting the original data
		orgdata.stream().sorted().collect(Collectors.toList()).forEach(s->System.out.println(s));
		
        
		
		// to display the particular value price
		// required item display in first page
		
      List<String> price=data.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceItem(s)).collect(Collectors.toList());
        
       price.forEach(a->System.out.println(a));
        
        
         //required item is in not in first page means
		//List<String> price;
        do
        {
        	List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
        	price=rows.stream().filter(s->s.getText().contains("Mango"))
        			.map(s->getPriceItem(s)).collect(Collectors.toList());
            
            price.forEach(a->System.out.println(a));
            
            if(price.size()<1)
            {
            	driver.findElement(By.cssSelector("[aria-label='Next']")).click();
            }
        	
        }while(price.size()<1);
	}

	private static String getPriceItem(WebElement s) {
		String pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}
}
