package InClassTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class DropdownCustom {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.jqueryscript.net/demo/jQuery-Multiple-Select-Plugin-For-Bootstrap-Bootstrap-Multiselect/");
        Thread.sleep(1000);
        System.out.println("The title of the page is: " + driver.getTitle());

        //TODO Come back and update this webelement with a dynamic one
        WebElement dropdown = driver.findElement(By.xpath("(//button[@title='None selected'])[1]"));
        // since we don't have a select type dropdown we need to click on it first, so we can pull up the list.
        dropdown.click();

        // 7 dropdown elements
        List<WebElement> dropdownOptions = driver.findElements(By.xpath("(//button[@title='None selected'])[1]/../ul/li"));

        for(int i  = 0; i < dropdownOptions.size(); i++){
            System.out.println(dropdownOptions.get(i).toString());
        }

        driver.quit();


    }
}
