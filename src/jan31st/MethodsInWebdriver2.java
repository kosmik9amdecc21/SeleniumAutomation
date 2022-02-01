package jan31st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebdriver2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "E:\\kosmik9amDec\\chromedriver.exe");
		
		
	WebDriver driver=new ChromeDriver();
		
	
	driver.get("https://adactinhotelapp.com/");
	
	
	//System.out.println(driver.getTitle());
	
	//System.out.println(driver.getCurrentUrl());
	
	driver.findElement(By.linkText("New User Register Here")).click();
	
	Thread.sleep(5000);
	
	//System.out.println(driver.getTitle());
	//System.out.println(driver.getCurrentUrl());
	
	System.out.println(driver.getPageSource());
	
	driver.quit();
	
	
	
	
		

	}

}
