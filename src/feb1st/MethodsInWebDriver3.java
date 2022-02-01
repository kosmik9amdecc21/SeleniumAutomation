 package feb1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebDriver3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\kosmik9amDec\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		//to launch  app
		driver.get("https://adactinhotelapp.com/");
		
		
		System.out.println(driver.getWindowHandle());
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.getWindowHandles());
		driver.quit();
		
		
		
		
		
		
		

	}

}
