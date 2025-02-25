package ssl;

//import java.io.File;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.edge.driver","C:\\Users\\QL326NG\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\QL326NG\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src,new File("C:\\Users\\QL326NG\\screenshot.png"));
		
		FileUtils.copyFile(src,new File("C:\\Users\\QL326NG\\screenshot.png"));

	}

}
