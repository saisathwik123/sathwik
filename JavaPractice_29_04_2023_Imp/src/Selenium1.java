import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium1 {
	public static void main(String args[])
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		// prevents Chrome from displaying the notification 'Chrome is being controlled
        // by automated software'
		chromeOptions.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		WebElement ele = driver.findElement(By.xpath("//*[@id='userId']"));
		
	}

}
