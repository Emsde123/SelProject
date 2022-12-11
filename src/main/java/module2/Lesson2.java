package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Lesson2 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    // //---------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                                              FIND ELEMENT VS FIND ELEMENTS

        // Find element ---> is used to identify a (one) web element within the web page.
        //                      - When using it, it is the responsibility of the tester to make sure the web elements
        //                        are uniquely identifiable using certain properties, such as ID, name, className, etc.
        //                        WebElement loginButton = driver.findElement(By.name("kgn"));
        //
        // - Returns the first most web element if there are multiple found with the same locator
        // - Throws exception NoSuchElementException if there are no elements matching th elocator stratgy
        // - It will only find one web element
        //



        // Find elements ---> is used to identify the list of web elements within the web page,
        //                        - it means there are more than one element that matches the given locator.
        //                        - It returns an empty list if there are no elements found using the given locator strategy and locator value
        //                        List<WebElement> pageLinks = driver.findElements(By.name("customLinks"));

        // - Returns a list of web elements
        // - Returns an empty list if there are no web elements matching the locator strategy
        // - It will find a collection of elements who match the locator strategy
        // - Each web element is indexed with a number starting from 0 like an array.


   //---------------------------------------------------------------------------------------------------------------------------------------------------------------
        //     NAVIGATE TO UBER, MAKE A LIST OF WEBELEMENTS, CLICK ON FIRST 2, CLOSE DRIVER
//            driver.get("https://www.uber.com");
//            driver.manage().window().maximize();
//
//    driver.findElement(By.id("login"));  <--- Will return object of the login button. It will be a WebElement object.
////
//            Thread.sleep(2000);

//            // below code is creating a List of WebElement type, and assigning the values of all the elements that use the specified class name to the list.
//            // You can also create an ArrayList, but it's not necessary because you'd have to do casting for no reason. The list allows us to do everything we need for this scenario.
//            // A list is fixed at creation, but that's okay because we're populating it with all the data we need.
//            // We'll break it down some more below the List line.

//            List<WebElement> topBtns = driver.findElements(By.className("css-eMVmlR"));   // <--- This will return multiple objects of the same className.

//        System.out.println("The size of the ArrayList of WebElements is: " + topBtns.size());
//        System.out.println(topBtns);
////        for(int i = 0; i<2; i++){
////            topBtns.get(i).click();
////            Thread.sleep(2000);
////        }
//
//        // Instead of the above for loop, if we wanted to directly access the last element on the page (login button)
//        // It will be the last element in the list that is 6 elements long, so it's index will be 5.
//        topBtns.get(topBtns.size()-1).click();  //  <--- Clicks on login
////        topBtns.get(5).click();  // <--- This will also do the same thing, but it is hard coded. The above code will always click on the last element.
//
//        System.out.println(driver.getTitle());
//        driver.quit();
//---------------------------------------------------------------------------------------------------------------------------------------------------------------
//                              NAVIGATE TO WEBPAGE, CLICK ON 3 TOTAL SECTIONS (Computers, Electronics, Apparel)
//                              THEN, LIST HOW MANY ITEMS ARE ON EACH SECTION

        //          MY METHOD
//            driver.get("https://demo.nopcommerce.com/digital-downloads");
//            driver.manage().window().maximize();
//            driver.findElement(By.linkText("Computers")).click();
//            List<WebElement> itemList = driver.findElements(By.className("item-box"));
//            System.out.println("The count of items listed on Computers is: " + itemList.size());
//            driver.findElement(By.linkText("Electronics")).click();
//            itemList = driver.findElements(By.className("item-box"));
//            System.out.println("The count of items listed on Electronics is: " + itemList.size());
//            driver.findElement(By.linkText("Apparel")).click();
//            itemList = driver.findElements(By.className("item-box"));
//            System.out.println("The count of items listed on Apparel is: " + itemList.size());
//            driver.quit();



        // BELOW IS OUR INVOCATION OF THE METHOD WE WROTE TO CUT DOWN ON DUPLICATE CODE ABOVE,
        // ALL WE HAD TO DO WAS CREATE AN ARRAY OF STRINGS THAT CONTAINED EACH LOCATOR WE'D BE USING
        // AND IT MADE IT DYNAMIC.

        driver.get("https://demo.nopcommerce.com/digital-downloads");
    String[] tabLocators = {"Computers", "Electronics", "Apparel", "Digital downloads"};
    for(int i = 0; i < tabLocators.length; i++){
        printItemsFromPage(driver, tabLocators[i]);
    }
        driver.quit();
   //---------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                                             XPATH
        // If you can't use general locators like id, class, name, etc then XPath is used to find the element.
        // XPath is defined as XML Path. It is a syntax or language for finding any element on the webpage using XML path expression on HTML DOM structure.

        // HTML --> DISPLAYS INFORMATION
        // XML  --> TRANSFERS INFORMATION

        //                                                      XPATH TYPES
        // NEVER USE ABSOLUTE
        // Absolute Path: / -> Starts from html tag, starts with single slashes.
        //                  - Starts with a single front slash /
        //                  - You need to type the whole address of the element starting from the very beginning of DOM.
        //                  - It is not effective and might fail when application goes through a change. So, avoid using.
        //      example: xpath=/html/body/div[5]/div/div/div/div[2]/div/div[1]/div/span[3]
        //                  - Think of it like the Windows file explorer. C:/Users/program files(x86)/Steam/steamapps/common/Rising Storm 2
        //

        // Relative Path: // -> Can be anywhere in the page, starts with double slashes.
        //                  - We use relative path because it is more reliable.
        //                  - It starts with doubles slashes //
        //                  - It searches for the element in the whole html code.
        //                    it is flexible, even if there are changes on the general html code, it will still work.
        //      example: //input[@id='lst-ib']



        //    Xpath=//tagname[@Attribute='Value']
        //              //       <-- selects current node
        //              tagname  <--









































        //              |------------ATTRIBUTE| |-LINK TEXT-|
//              <a href="http://www.google.com/">Go to Google</a>
//                Attributes describe elements




    }

    // We'll make a method to accomplish a task that we wrote above that involved duplicated lines of code.
   static public void printItemsFromPage(WebDriver driver, String locator) throws InterruptedException{
       List<WebElement> itemList = driver.findElements(By.className("item-box"));
        Thread.sleep(300);
       driver.findElement(By.linkText(locator)).click();
       itemList = driver.findElements(By.className("item-box"));
       System.out.println("The count of items listed on this page is: " + itemList.size());


    }


}
