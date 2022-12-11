package homework.module3.automationPracticeSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW5 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html");

        WebElement yearDropdownElement = driver.findElement(By.cssSelector("[ng-model = 'yearbox']"));
        Select yearDropdown = new Select(yearDropdownElement);

        yearDropdown.selectByVisibleText("2000");

        System.out.println(yearDropdown.getFirstSelectedOption().getText());
    }
}
