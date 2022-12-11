package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson2 {

public static void main(String[]args) throws InterruptedException {
//___________________________________________________________________________________
                                // BROWSER METHODS

    // 1. driver.get("https://google.com")           <-- navigates to the given website
    // 2. driver.navigate().to("https://google.com") <-- navigates to the given website

    // 3. driver.navigate().refresh();               <-- refreshes the page
    // 4. driver.navigate().back();                  <-- same as pressing the back button on browser
    // 5. driver.navigate().forward();               <-- same as pressing the forward button on browser

    // 6. driver.close();                            <-- closes only the current window
    // 7. driver.quit();                             <-- closes every associated window which is opened

    // 8. driver.manage().window().maximize();       <-- starts browser maximised mode

    // 9. driver.getTitle();                         <-- gets the title of the webpage as a String




//___________________________________________________________________________________
// FOR NOW, WE WILL ALWAYS HAVE TO DO THE BELOW STEPS
    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    // (recommended) driver.manage().window().maximize();
//______________________________________________________________________________________________________________________________________________________________________
    // We say open the window to the max size, and then define the url.
    // After that, we print the url and then close all windows.

//    driver.manage().window().maximize();
//
//    driver.get("https://facebook.com");
//    System.out.println(driver.getCurrentUrl());
//    driver.quit();
//______________________________________________________________________________________________________________________________________________________________________
  // TASK 1
 //    go to google using Navigate method
//    driver.navigate().to("https://www.google.com");
//    // after that, navigate to uber.com
//    driver.get("https://www.uber.com");
//    // print the url of current page (UBER)
//    System.out.println(driver.getCurrentUrl());
//    // go back to google
//    driver.navigate().back();
//    // print the url of the current page (GOOGLE)
//    System.out.println(driver.getCurrentUrl());
//    // if the url contains google then we print success
//    if(driver.getCurrentUrl().contains("google")){
//        System.out.println("success");
//    }
//    // MAXIMIZE
//    driver.manage().window().maximize();
//    // QUIT
//    driver.quit();
//______________________________________________________________________________________________________________________________________________________________________
//  TASK 2

//    driver.get("https://reddit.com");
//    driver.manage().window().maximize();
//    driver.get("https://youtube.com");
//   // below code will pause the execution for the chosen amount of time (5 seconds)
//  //  Thread.sleep(5000);
//    driver.get("https://facebook.com");
//    driver.navigate().to("https://discord.com");
//    System.out.println(driver.getTitle());
//    driver.navigate().back();
//    System.out.println(driver.getTitle());
//    driver.navigate().back();
//    System.out.println(driver.getTitle());
//    driver.navigate().back();
//    System.out.println(driver.getTitle());
//    driver.quit();
                            //  TASK 2 (kind of) WITH LOOPS
//
//
//    driver.manage().window().maximize();
//    driver.get("https://reddit.com");
//    driver.get("https://youtube.com");
//    driver.get("https://facebook.com");
//    driver.navigate().to("https://discord.com");
//    String [] websites = {"https://reddit.com", "https://youtube.com","https://facebook.com", "https://discord.com"};
//
//    for(int i = 0; i < websites.length; i++){
//        System.out.println(websites[i]);
//    }driver.quit();
//
//    System.out.println(driver.getTitle());
//    driver.navigate().back();
//    System.out.println(driver.getTitle());
//    driver.navigate().back();
//    System.out.println(driver.getTitle());
//    driver.navigate().back();
//    System.out.println(driver.getTitle());
//______________________________________________________________________________________________________________________________________________________________________









}
}
