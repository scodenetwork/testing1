package selenim;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class LaunchChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiv\\Desktop\\web\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://scodenetwork.com");

	}

}
