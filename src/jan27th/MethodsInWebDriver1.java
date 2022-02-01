package jan27th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebDriver1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\kosmik9amDec\\chromedriver.exe");
		
		//starts the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//will launch the application
		driver.get("https://adactinhotelapp.com/");
		
		Thread.sleep(5000);
		
		//river.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		//will close the browser's tab
		
		Thread.sleep(5000);
		
		//iver.close();
		
		driver.quit();
		
		Thread.sleep(5000);

	}

}
