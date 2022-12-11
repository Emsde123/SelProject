package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//
//        driver.get("https://guru99.com");
//        driver.manage().window().maximize();
//        Thread.sleep(2000);
//
//        driver.findElement(By.xpath("//*[@title='Software Testing']")).click();
//        System.out.println(driver.getTitle());
//        driver.quit();


//        driver.get("http://automationpractice.com/index.php");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//ul[contains(@class, 'submenu-container')]/../a[text()='Dresses']"));
//        Thread.sleep(5000);
//        if(driver.getTitle().equalsIgnoreCase("Dresses - My Store")){
//            System.out.println("Test Case Passed!");
//        }
//        driver.quit();

        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Contact us']")).click();
        Thread.sleep(5000);
        if(driver.getTitle().equalsIgnoreCase("Contact us - My Store")){
            System.out.println("Test Case Passed!");
        }


    }
}
