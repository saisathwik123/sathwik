import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {
    public static void main(String[] args) {
        // Set the path of the chromedriver.exe file
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
//        
        // Create a new ChromeDriver instance
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the webpage that contains the links to be tested
        driver.get("https://www.iana.org/domains/reserved");
        
        // Get all the links on the page
        List<WebElement> linksList = driver.findElements(By.tagName("a"));
        
        // Loop through each link and check if it's broken
        for (WebElement link : linksList) {
            String url = link.getAttribute("href");
            HttpURLConnection connection = null;
            try {
                connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("HEAD");
                connection.connect();
                int statusCode = connection.getResponseCode();
                if (statusCode >= 400) {
                    System.out.println("Broken link found: " + url);
                } else {
                    System.out.println("Valid link: " + url);
                }
            } catch (Exception e) {
                System.out.println("Error connecting to URL: " + url);
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
            }
        }
        
        // Close the browser
        driver.quit();
    }
}
