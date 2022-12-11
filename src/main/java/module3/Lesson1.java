package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //                                  Keys Class
        // Handle element with sendKeys
        // We have been using sendKeys to enter text, we can also use Keys class to press different buttons on the keyboard.
        // We can use sendKeys with Keys class, to simulate keyboard keys.
        // Example:
        // Keys.ENTER
        // Keys.TAB
        // Keys.BACK_SPACE
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                          PRACTICE (continued in KeysAction in InClassTasks)
        driver.get("demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Daniel");
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //                                  Checkboxes, radio buttons
        //

        // We use click() to check or uncheck  a checkbox.
        // There's also an isSelected() method that tells you weather the checkbox is toggled on or off. It is also used
        // On radio buttons.
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                          Dropdowns

        // Dropdowns are common elements in any web application.
        // It allows you to select a value from a given list.
        // (First you click on the dropdown so it opens the list and then we can click on an option)

        // Selenium uses Select class to interact with dropdowns.
        // You can ONLY use Select class if the dropdown has select tag in html.

        //                                  TYPES OF DROPDOWNS
        // Single Value Dropdowns                                           Multiple Value Dropdowns
        // ---------------------                                            -------------------------
        // - You can only select one option                                 - Can select multiple values
        // - 90% of Dropdowns are single value.


        // Dropdown options are indexed with numbers. Starts from 0.
        // Each option has a value attribute
        // Each option has visible text







    }
}
