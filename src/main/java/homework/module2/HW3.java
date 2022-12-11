package homework.module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String email = "ystudent@email.com";
        String PW = "secret";


        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.xpath("//a[contains(text(), 'Sign in')]")).click();


        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys(PW);
        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();

        System.out.println(driver.getTitle());
        driver.quit();

    }

}
