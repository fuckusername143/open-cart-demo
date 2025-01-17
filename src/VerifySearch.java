import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySearch {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://www.example.com");

        // Find the search box and enter a search query
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");

        // Find the search button and click it
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();

        // Wait for results to load and verify the search
        try {
            Thread.sleep(3000); // Wait for results to load
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify the search result page
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("Selenium")) {
            System.out.println("Search verified successfully!");
        } else {
            System.out.println("Search verification failed.");
        }

        // Close the browser
        driver.quit();
    }
}
