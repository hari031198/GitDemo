package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\QL326NG\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D60456322738%26hvpone%3D%26hvptwo%3D%26hvadid%3D486393568006%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D5925366827169875571%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9040218%26hvtargid%3Dkwd-360364908477%26hydadcr%3D14451_2154369%26gclid%3DEAIaIQobChMItJH98vP6-gIVyzArCh08GQ_FEAAYASAAEgJlXPD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.id("ap_email")).sendKeys("hariharannov398@gmail.com");
		driver.findElement(By.id("continue")).click();
	
		
		driver.findElement(By.name("password")).sendKeys("qwertyu");
		driver.findElement(By.id("signInSubmit")).click();
		
		System.out.println(driver.findElement(By.cssSelector("span.a-list-item")).getText());
		driver.findElement(By.linkText("Forgot Password")).click();
		driver.findElement(By.id("continue")).click();
		
	}

}
