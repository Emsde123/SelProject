package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson1 {

    public static void main(String[] args){
        // WebDriver is a Java interface
        // Chrome Driver, Firefox


        // BROWSER METHODS
        // 1. driver.get("https://google.com")           <-- navigates to the given website
        // 2. driver.navigate().to("https://google.com") <-- navigates to the given website

        // 3. driver.navigate().refresh();               <-- refreshes the page

        // 4. driver.navigate().back();                  <-- same as pressing the back button on browser
        // 5. driver.navigate().forward();               <-- same as pressing the forward button on browser

        // 6. driver.close();                            <-- closes only the current window
        // 7. driver.quit();                             <-- closes every associated window which is opened

    // Below on line 9 we told our system where the ChromeDriver is located.
    // "webdriver.chrome.driver" <- KEY
    //  "resources/chromedriver.exe" <- LOCATION OF DRIVER
    // .setProperty is a static method, System is a class so we're calling the static method
    // with Classname.methodName
    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

    // CREATING OBJECT OF CHROMEDRIVER CLASS THAT WILL BE USED TO AUTOMATE OUR ACTIONS IN CHROME
    // WebDriver = type | driver = name | ChromeDriver() <- class
    WebDriver driver = new ChromeDriver();
//
//  //  does the same as above line, conventionally we don't do it like this though.
//  //  conventionally we point to the WebDriver interface like we did above.
//  //  ChromeDriver driver = new ChromeDriver();
//
//        // .get method is used to navigate to specific web pages.
//        // driver is the name of our object, .get is not static because we don't call it with class name.
////        driver.get("https://www.amazon.com");
////        driver.navigate().to("https://www.google.com");
//        // difference between .navigate().to() and .get (they do the same thing, but slightly different)
//        //    - .get will wait for every single element to be downloaded
//        //    - .navigate().to() will load the page right away, doesn't wait for every element to load.
//        //    - .navigate().to() will save navigation history (not entirely true with current Selenium version.)
//        //    - WE DON'T USUALLY NEED TO USE NAVIGATE.TO
//
//        // shortcut for System.out.println() is not syso ctrl + space in Intellej
//        // the shortcut is sout  ctrl + space
//        // We have two options right now for printing the .getTitle() method.
//        // First is done by creating a new string, second way is the way I did it underneath.
//        // gets the title of the page
////        String title = driver.getTitle();
////        System.out.println("The title of https://www.google.com: " + title);
//        driver.navigate().to("https://amazon.com");
//        System.out.println("Current page title: " + driver.getTitle());
//
//        driver.navigate().to("https://spotify.com");
//        System.out.println(driver.getTitle());
//
//        driver.navigate().refresh();
//
//        System.out.println(driver.getTitle());
//
//   //    If I comment out the driver.close(); command, then the page will not automatically close when the execution is done running.
//         driver.close();

        // step 1: We navigate to Facebook page
        // step 2: We navigate to Amazon page
//        driver.navigate().to("https://facebook.com");
//        driver.navigate().to("https://amazon.com");
//        // step 3: We want to navigate back to the Facebook page
//        // we are using a method to get back ot the previous/first page.
//        driver.navigate().back();
//        // step 4: We print the title of the first page
//        System.out.println(driver.getTitle());
//        // step 5: we navigate forward to the second webpage using navigate().forward method
//        driver.navigate().forward();
//        // step 6: we print the title of the second page
//        System.out.println(driver.getTitle());
//        // step 7: close window (all windows that are currently open)
//        driver.quit();
//    // ALWAYS RUN PROGRAMS BY RIGHT CLICKING INSIDE THE .JAVA FILE AND CLICKING RUN
//    // THE PLAY BUTTON IN TOP RIGHT IS NOT GOING TO ALWAYS RUN THE CLASS WE'RE LOOKING AT!




    }
}
