package homework.module3.automationPracticeSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class HW6 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html");

        WebElement yearDropdownElement = driver.findElement(By.cssSelector("[ng-model = 'yearbox']"));
        Select yearDropdown = new Select(yearDropdownElement);

        for(WebElement eachYear : yearDropdown.getOptions()){
            System.out.println(eachYear.getText());
        }

        yearDropdown.selectByVisibleText("2015");
        Thread.sleep(2000);

        driver.quit();
    }
}
