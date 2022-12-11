package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//----------------------------------------------------------------------------------------------------------------------------------------
    //                                  XPATH
    // Using absolute path:
    // the below code says that we start from the opening html tag, then we go to body, form, div, div[2],input
    // we have to start from the very beginning through the exact location.
    //  /html/body/form/div/div[2]/input

    // Using relative path:
    // Relative path is like if you wanted to meet your friend and instead of listing all of the exact steps
    // You just tell him how to meet you from Times Square, instead of from his apartment(absolute)
    //
    // Xpath = //tagname[@attribute="value"]
    // DIFFERENCE BETWEEN ABSOLUTE AND RELATIVE FOR THE SAME ELEMENT

    // Relative: //input[@id='bicycle-checkbox']
    // Absolute:  /html/body/form/div/div[2]/input

    // To find out if something is unique in inspect, you can use a wildcard(*)
    //*[@id='checkbox']  <--- This will return all elements with an id of 'checkbox' regardless of tag name.
    //*[@class='text-center'] <--- Returns all elements that have a class of text-center

    // Xpath should only be used if you need a direct path to the element for some reason, if possible try to use By.id or By.name
//----------------------------------------------------------------------------------------------------------------------------------------
//                                      BASIC XPATH
    // input[@name='uid'] --> name
    // a[@id='search]    --> id
    // select[@class='offerings']  -> uses class
    // img  --> uses just tag name
    // div[@value='RESET']          -> uses value attribute
    // a[@href='http://demo.com']   -> uses link
    // img[@src='//cdn.amazon.com/images/cake.png] -> uses an src attribute
    // *[@name='fname']             -> * means any tag name
    // *[@name='fname]/input        -> single slash means the child element of the specified element with the input tag.
    //          /../                 -> means going to parent element

    // You can go from the parent element to the child element using "/"
    // below, we found the parent element with the id of twoWheelVehicles, and then went to the child element (bicycle-checkbox)
    // //div[@id='twoWheelVehicles']/input[@id='bicycle-checkbox']
//---------------------------------------------------------------------------------------------------------------------------------------
//                                     FAMILY STRUCTURE
//      <div class="row-featured-boxed">                  <-- PARENT
//         <div class="col-md-3">                         <-- CHILD
//             <div class="featured-box columnsize1">     <-- GRANDKID
//                  <h4>                                  <-- GREAT GRANDKID
//                    <b>Testing</b>                      <-- GREAT GREAT GRANDKID
//                  <ul class="menu-1">                   <-- BROTHER OF GREAT GRANDCHILD
//


    //  You can skip generations using // example:
    //   //div[@class='col-md-3']//b
    //   this would take us from the child element all the way to the very bottom element. It works because we have already
    //   established a familial relationship.

    // You can also move up in the family chain if you need to, using ..
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                   TASK 1 (LOCATE ELEMENTS USING RELATIVE XPATH)
    // Go to http://automationpractice.com/index.php
    //  Locate these elements using xpath:

    //  Logo                    //img[@class='logo img-responsive']
    //  Cart                    //div[@class='shopping_cart']//b
    //  Cart(teach)             //a[@title='View my shopping cart']

    //  Search input box        //form[@id='searchbox']//input[4]
    //  SIB (Teacher)           //input[@id='search_query_top']

    //  Search button           //form[@id='searchbox']//button
    //  SB(Teacher)             //button[@name='submit_search']

    //  Contact us link         //div[@id='contact-link']//a
    //  CUL(Teacher)            //a[@title='Contact Us']

    // To sum up most of the difference between me and the teachers method, is I was usually going to parent and then going down until I got to my element.
    // With relative xpath we don't have to do that unless we need to so that we can point to a more specific place (like duplicate names or something)
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                          XPATH FOR DYNAMIC ELEMENTS (methods)

    // We were just given an example of a task on Geico. There were 2 fields, one for first name, and one for last name.
    // When the student found the unique ID for the first name input box they thought it was great, but
    // The two boxes are dynamic elements. That means the values can change on refresh of the page.
    // Example: //input[@id='Id_GiveName_80010']  REFRESHED -> //input[@id='Id_GiveName_72944']

    // Contains -> Has an ability to find the element with partial text:
    //    //*[contains(@name, 'btn')] -> have taken the 'name' as an attribute, and 'btn' as the partial value.
    //    //input[contains(@id, 'Id_GiveName_')]

    // Using OR & AND -> We can combine xpath expression with logical operators OR & AND
          //*[@type='submit' or @name='btnReset']
          //input[@type='submit' and @name='btnLogin']
          //input[contains(@id, 'id_GiveName_') and @aira-label='FirstName']

    // Starts-with    -> match the starting text of the attribute, in cases where the rest of the element value changes.
    //      Example: On a page there could be 3 elements with IDs like: message35, message403, message203
    //      //label[starts-with(@id, 'message')]  -> This line would identify all elements whose ID starts with message.


    // Text()       ->  With text function, we find the element with the exact text match
            //*[text() = 'whatever']
    // Partial text
            //*[contains(text(), 'what')]
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //                              GETTING ONE ELEMENT FROM 2 ALMOST IDENTICAL ELEMENTS

    //a[text()='Dresses']  <-- This would return 1 of 2 elements. In order for me to single out the one that I want,
    //                          I am going to go to the grand child of an element that holds the one I want, and then go up to the parent of the element I want,
    //                          Once I made it to the parent element of my desired element I can then move down one element to my desired element.

    //  /../ <-- goes up a level
    //  /a   <-- forward slash + tag name  (or you can use * which will bring back all child elements, and you can specify further, example: /*[text()='Dresses'] <- brings back all child elements with text dresses.)

    //ul[contains(@class,'submenu-container')]/../a[text()='Dresses']
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                      TASK 2 HOMEWORK

//    String username = "Emsde123";
//    String password = "pass123";
//
//    driver.get("https://automationpractice.com/index.php");
//    driver.manage().window().maximize();
//    Thread.sleep(3000);
//    driver.findElement(By.xpath("//a[contains(text(), 'Sign in']")).click();
//    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
//    driver.findElement(By.xpath("//input[@name='passwd'")).sendKeys(password);
//    driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
//        System.out.println(driver.getTitle());
//        driver.quit();
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //                              INDEX

        // In case you can't get a unique identifier for an element, or you can't build a relationship between elements, you can use index to point to it.
        // LAST RESORT LAST RESORT LAST RESORT LAST RESORT LAST RESORT

        // (//a[text()='Dresses'][2]   <-- the code would return 2 elements, so we can use this to point to the second one.
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------




}

































}
