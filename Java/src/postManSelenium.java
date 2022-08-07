import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class postManSelenium {
    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saisathwik\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.postman.com/");
        driver.findElement(By.xpath("//*[@placeholder='Search Postman']")).click();



    }

}
