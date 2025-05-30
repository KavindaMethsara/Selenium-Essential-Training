import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        webElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Kavinda Methsara");

        webElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }
}
