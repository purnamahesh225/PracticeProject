package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		System.out.println("opened successfully");
		String Title = driver.getTitle();
		String PageCurrentUrl = driver.getCurrentUrl();
		System.out.println(Title);
		System.out.println(PageCurrentUrl);
		driver.close();
		//driver.quit();

	}

}
