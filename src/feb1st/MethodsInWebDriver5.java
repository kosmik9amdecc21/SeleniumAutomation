package feb1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebDriver5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\kosmik9amDec\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		//to launch  app
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		
		System.out.println(driver.findElement(By.linkText("New User Register Here")).getCssValue("font-family"));
		
		driver.quit();
		
		
		
		
		
		
		

	}

}
