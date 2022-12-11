package InClassTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonsAndCheckboxes {
    public static void main(String[] args) throws InterruptedException {

        // Click on "Male" checkbox, and "Hockey" checkbox, then close driver.

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");


        WebElement maleCheckBox = driver.findElement(By.xpath("//input[@value='Male']"));

        List<WebElement> allHobbies = driver.findElements(By.xpath("//*[text()='Hobbies']/..//input"));


        allHobbies.get(0).click();
        allHobbies.get(2).click();
        maleCheckBox.click();


        Thread.sleep(1000);
        driver.quit();

    }

}
