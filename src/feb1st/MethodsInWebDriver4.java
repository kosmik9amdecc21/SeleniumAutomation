package feb1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebDriver4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\kosmik9amDec\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		//to launch  app
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("New User Register Here")).click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		

	}

}
