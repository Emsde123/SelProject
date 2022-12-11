package homework.module3.automationPracticeSite;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW {
    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html");





        WebElement skillsDropdown = driver.findElement(By.xpath("//select[@ng-model='Skill']"));
        List<WebElement> skills =
                driver.findElements(By.xpath("//select[@ng-model='Skill']/option"));
        skillsDropdown.click();
        for(WebElement allSkills : skills){
            System.out.println(allSkills.getText());
            if(allSkills.getAttribute("value").equals("Email")){
                break;
            }
        }


    }


}
