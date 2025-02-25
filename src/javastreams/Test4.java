package javastreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QL326NG\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        driver.findElement(By.id("search-field")).sendKeys("ch");

        List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
        
        List<String> out= veggies.stream().map(s->s.getText()).collect(Collectors.toList());
        out.stream().forEach(s->System.out.println(s));


        //1 results

       List<WebElement> filteredList= veggies.stream().filter(veggie->veggie.getText().contains("Chocolate")).

        collect(Collectors.toList());
       List<String> ad= filteredList.stream().map(s->s.getText()).collect(Collectors.toList());
       ad.stream().forEach(s->System.out.println(s));

       //1 result

      
	}

}
