package jan27th;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "E:\\kosmik9amDec\\msedgedriver.exe");
		
		new EdgeDriver();

	}

}
