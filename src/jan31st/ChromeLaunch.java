package jan31st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "E:\\kosmik9amDec\\chromedriver.exe");
		
		
	RemoteWebDriver driver=new  ChromeDriver();
	
	
	//driver.close();
	
	driver.quit();
		
	
	
	
	
		

	}

}
