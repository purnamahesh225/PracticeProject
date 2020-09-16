package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {

	public static void main(String[] args) {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String Title = driver.getTitle();
		System.out.println(Title);
		
	}

}
