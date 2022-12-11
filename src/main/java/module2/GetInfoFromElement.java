package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetInfoFromElement {
    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();



//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // isDisplayed method
        // If we use isDisplayed method for an element that is not present, it will throw an exception. (NO SUCH ELEMENT)
        // We get around this with booleans and empty lists. Example below:

//        boolean isPresent = driver.findElements(By.xpath("//a[text()='Clarissa']")).size() > 0;
        // The above will return true or false based on weather the list is bigger than 0 or not.


//        driver.get("https://dev-hrm.yoll.io/index.php/auth/login");
//        driver.findElement(By.id("txtUsername")).sendKeys("yoll-student");
//        driver.findElement(By.id("txtPassword")).sendKeys("password");
//        driver.findElement(By.id("btnLogin")).click();
//        Thread.sleep(1500);
//        driver.findElement(By.id("menu_pim_viewPimModule")).click();
//        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
//        Thread.sleep(1000);
//        System.out.println(driver.getTitle());
//
//        // Finding clarisa. verifying if she is displayed or not.
//        WebElement clarissa = driver.findElement(By.xpath("//a[text()='Clarissa Belissima']"));
//        if(clarissa.isDisplayed()){
//            System.out.println("She is displayed! Yay! Test case passed!");
//        }
//        WebElement clarissasCheckbox = driver.findElement(By.xpath("//a[text()='Clarissa Belissima']/../../td/input"));
//        WebElement deleteButton = driver.findElement(By.id("btnDelete"));
//        WebElement dialogDeleteButton = driver.findElement(By.id("dialogDeleteBtn"));
//
//        // Deleting Clarissa.
//        deleteButton.click();
//        Thread.sleep(1000);
//        dialogDeleteButton.click();
//
//        // We shouldn't be able to locate her at this point, because we deleted her.
//        boolean isPresent = driver.findElements(By.xpath("//a[text()='Clarissa']")).size() > 0;
//        if(!isPresent){
//            System.out.println("She is not part of the UI anymore!");
//        }
//
//
//        // If the below code is not met, it will still throw an exception.
//        // Because we are using isDisplayed and not the isPresent method we created.
//        if(!clarissa.isDisplayed()){
//            System.out.println("She is not displayed! Yay! Test case passed!");
//        }
//
//        driver.quit();




//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // PRINTING TEXT OF ROW OF TABLE
//        driver.get("https://dev-hrm.yoll.io/index.php/auth/login");
//        driver.findElement(By.id("txtUsername")).sendKeys("yoll-student");
//        driver.findElement(By.id("txtPassword")).sendKeys("password");
//        driver.findElement(By.id("btnLogin")).click();
//        Thread.sleep(1500);
//        driver.findElement(By.id("menu_pim_viewPimModule")).click();
//        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
//        Thread.sleep(1000);
//        System.out.println(driver.findElement(By.cssSelector("table#resultTable tr:nth-child(4)")).getText());

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                    // getAttribute("")
        // getAttribute method gets the value of an attribute.
        // title='Office' <-- title is attribute, Office is the value.
        // driver.findElement(By.id("bruh")).getAttribute("title");
        // getAttribute() returns blank as a value if the attribute is not set to any value.
        // it returns true if you are searching for a boolean value.
        // example of boolean attributes: async, autofocus, autoplay, checked, compact, complete, etc.

        // We can't extract text from any editable item using getText(), to get a text from an editable
        // We need to use getAttribute("value")
        // driver.findElement(By.id("item")).getAttribute("value");


//        driver.get("https://dev-hrm.yoll.io/index.php/auth/login");
//        driver.findElement(By.id("txtUsername")).sendKeys("yoll-student");
//        driver.findElement(By.id("txtPassword")).sendKeys("password");
//        driver.findElement(By.id("btnLogin")).click();
//        Thread.sleep(1500);
//        driver.findElement(By.id("menu_pim_viewPimModule")).click();
//        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
//        WebElement searchBtn = driver.findElement(By.id("searchBtn"));
//        System.out.println(searchBtn.getAttribute("type"));  // button
//        System.out.println(searchBtn.getAttribute("value")); // Search
//        System.out.println(searchBtn.getAttribute("name"));  // _search
//        System.out.println(searchBtn.getAttribute("class")); // (empty string)
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                //  isEnabled()
//        // isEnabled() method --> verifies and returns true or false based on the state of the element weather it is enabled or not.
//        driver.findElement(By.name("btn")).isEnabled();
//        // Sometimes you might not get the value of the element, and it doesn't matter weather it is enabled or disabled.
//        // In those situations you need to inspect the element and find what attribute makes the element disabled.
//        driver.findElement(By.name("tch")).getAttribute("disabled");
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //          PRACTICE

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.get("https://www.wufoo.com/html5/disabled-attribute/?");
        System.out.println(driver.findElement(By.xpath("//form[@id='form-demo']/input[@type='text']")).isEnabled());  // false
        System.out.println( driver.findElement(By.xpath("//form[@id='form-demo']/textarea")).isEnabled());            // false
        driver.quit();
        // PRACTICE 2
//        driver.get("https://html.com/attributes/button-disabled/");
//        Thread.sleep(1000);
//        System.out.println(driver.findElement(By.xpath("//*[text()=\"You can't click me.\"]")).isEnabled()); // false
//        driver.quit();


        // PRACTICE 3

//        driver.get("https://haltersweb.github.io/Accessibility/submit-disabling.html");
//        Thread.sleep(1000);
//        System.out.println(driver.findElement(By.xpath("//button[@class='btn']")).getAttribute("aria-disabled")); // true
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Daniel");
//        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Beezly");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//li")).click();
//
//        System.out.println(driver.findElement(By.xpath("//button[text()='Submit']")).getAttribute("aria-disabled")); // false (button was enabled)
//
//        driver.quit();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                  GET CSS VALUE
        // getCssValue() <-- gets the value of a CSS property of a web element.
        // We have to specify what property we want to get. Example:
            // .getCssValue("background-color");
            // .getCssValue ("border-bottom-color");
            // .getCssValue ("border-bottom-width");

        // Whenever you verify any CSS property you should check the values in Styles & Computed tab.
        // You can find the property and corresponding value there.



    }

    // REUSABLE isPresent method
    public static boolean isPresent(WebDriver driver, By loc){
        return driver.findElements(loc).size()>0;
    }


}
