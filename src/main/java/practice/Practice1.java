package practice;

import org.checkerframework.checker.fenum.qual.SwingTitleJustification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        // Supremacy log in 
//        driver.get("https://supremacy1914.com/");
//        driver.manage().window().maximize();
//        Thread.sleep(2000);
//        driver.findElement(By.name("user")).sendKeys("mrdankystanky");
//        driver.findElement(By.name("pass")).sendKeys("Youngleroy123!");
//        driver.findElement(By.id("func_loginbutton")).click();
//        Thread.sleep(2000);

        WebElement videoGameButton = driver.findElement(By.xpath("//*[text()='Video Games']"));


        driver.get("https://www.bestbuy.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
        Thread.sleep(2000);
        videoGameButton.click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.quit();


    }


}
