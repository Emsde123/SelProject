package InClassTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysAction {
    public static void main(String[] args) throws InterruptedException {
        // Pointing selenium to where our driver location is
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        // Instantiating an object of ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Register.html");
        // Freezes execution for the specified amount of time
        Thread.sleep(500);

        /* Locating first name input box */
        WebElement firstName = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));

        /* Sending keys to the firstName element by using the variable we assigned the xpath to */
        firstName.sendKeys("Daniel");
        Thread.sleep(1000);

        // On the next step, you need to understand where we're tabbing from. The source of where we tab from is important.
        // Look at what happened, we tabbed off the firstName element, and we know the next
        // Element that will be tabbed to is the lastName box, we can tab from firstName and enter the last name
        // All in one line.
        firstName.sendKeys(Keys.TAB, "Berry");
        Thread.sleep(1000);

        driver.quit();
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------




    }




}
