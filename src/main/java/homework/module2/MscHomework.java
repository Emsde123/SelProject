package homework.module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MscHomework {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //
//        driver.get("https://haltersweb.github.io/Accessibility/submit-disabling.html");
//
//        WebElement submitButton = driver.findElement(By.xpath("//button[@type = 'submit']"));
//        WebElement firstNameInput = driver.findElement(By.id("firstName"));
//        WebElement lastNameInput = driver.findElement(By.id("lastName"));
//
//
//
//        System.out.println("The submit button is disabled: " + submitButton.getAttribute("aria-disabled"));
//
//        firstNameInput.sendKeys("Daniel");
//        lastNameInput.sendKeys("Berry");
//        driver.findElement(By.xpath("//div[@class='form-row']")).click();
//        System.out.println("The submit button is disabled: " + submitButton.getAttribute( "aria-disabled"));
//        submitButton.click();
//        driver.quit();
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//        driver.get("http://automationpractice.com/");
//        WebElement womenBtn = driver.findElement(By.xpath("//a[@title='Women']"));
//
//
//        System.out.println(womenBtn.getCssValue("background-color"));
//        womenBtn.click();
//        System.out.println(driver.findElement(By.xpath("//a[@title='Women']")).getCssValue("background"));
//        driver.quit();



//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        driver.get("https://html.com/attributes/button-disabled/");
//        driver.manage().window().maximize();
//        Thread.sleep(4000);
//        System.out.println("Is the button enabled? " + driver.findElement(By.xpath("//button")).isEnabled() );
//        driver.quit();
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement searchBtn = driver.findElement(By.xpath("//button[@class='btn btn-default button-search']"));
        System.out.println(searchBtn.getCssValue("background-color"));
        System.out.println(searchBtn.getCssValue("color"));
        System.out.println(searchBtn.getCssValue("position"));
        driver.quit();

    }
}
