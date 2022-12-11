package homework.module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demo.guru99.com/test/newtours");
        driver.findElement(By.name("userName")).sendKeys("Emsde223");
        driver.findElement(By.name("password")).sendKeys("thisismypassword");
        Thread.sleep(200);
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.partialLinkText("acation")).click();
        driver.findElement(By.linkText("REGISTER")).click();
//        driver.quit();




    }
}
