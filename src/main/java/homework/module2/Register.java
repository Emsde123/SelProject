package homework.module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {



public static void main(String[]args) throws InterruptedException {
//                                                          TASK 1: CREATE ACCOUNT
//    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//    WebDriver driver = new ChromeDriver();
    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    driver.get("https://www.demo.guru99.com/test/newtours");
    driver.manage().window().maximize();

      Thread.sleep(2000);
      driver.findElement(By.linkText("REGISTER")).click();
      Thread.sleep(1000);
      driver.findElement(By.name("firstName")).sendKeys("Danny");
      driver.findElement(By.name("lastName")).sendKeys("Beezly");
      driver.findElement(By.name("phone")).sendKeys("608-334-5067");
      driver.findElement(By.name("userName")).sendKeys("deebeezly@email.com");
      driver.findElement(By.name("address1")).sendKeys("456 Drewery lane");
      driver.findElement(By.name("city")).sendKeys("Serlam");
      driver.findElement(By.name("state")).sendKeys("Oregon");
      driver.findElement(By.name("postalCode")).sendKeys("56734");
      driver.findElement(By.name("email")).sendKeys("Emsde233");
      driver.findElement(By.name("password")).sendKeys("thisismypassword");
      driver.findElement(By.name("confirmPassword")).sendKeys("thisismypassword");
      Thread.sleep(3000);
      driver.findElement(By.name("submit")).click();

      System.out.println(driver.getTitle());
      driver.quit();







        }
}