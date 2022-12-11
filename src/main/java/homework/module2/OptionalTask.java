package main.java.homework.module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class OptionalTask {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        String firstName = "Santa";
        String lastName = "Claus";
        String email = "email"+Math.random()+"@email.com";
        String pass = "ThIsIsMyPaSsWoRd22123!@#$";

        driver.get("https://magento.softwaretestingboard.com/");
        Thread.sleep(2000);
        checkTitle(driver, "Home Page - Magento eCommerce - website to practice selenium | demo website for automation testing | selenium practice sites | selenium demo sites | best website to practice selenium automation | automation practice sites Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");


        System.out.println(driver.findElement(By.linkText("Create an Account")).isDisplayed());

        driver.findElement(By.xpath("//a[@id='ui-id-8']/span")).click();
        driver.findElement(By.xpath("//a[contains(@href, 'tees-men') and text()='Tees']")).click();
        checkTitle(driver, "Tees - Tops - Men");
        List<WebElement> teeList = driver.findElements(By.xpath("//li[@class='item product product-item']"));

        if(teeList.size() == 12){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.findElement(By.xpath("//a[@class='action skip contentarea']//following-sibling::ul/li/a[text()='Create an Account']")).click();

        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstName);
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys(pass);
        driver.findElement(By.xpath("//button[@class='action submit primary']/span")).click();
        Thread.sleep(1500);


        System.out.println("Account creation was successful: " + driver.findElement(By.xpath("//div[@class='message-success success message']")).isDisplayed());


        driver.findElement(By.xpath("//div[@class='box box-information']/div//following-sibling::a[@class='action edit']/span")).click();

        driver.findElement(By.xpath("//input[@id='firstname']")).clear();
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Selenium");
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(1000);

        System.out.println("The account edit was successful: " + driver.findElement(By.xpath("//div[@class='box-content']/p[contains(text(), 'Selenium Claus')]")).isDisplayed());








    }

    public static void checkTitle(WebDriver driver, String expectedTitle){
        if(expectedTitle.contains(driver.getTitle())){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

    }



}
