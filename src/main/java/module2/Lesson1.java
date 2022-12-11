package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson1 {




public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                                 HTML (Hypertext Markup Language)
//  - HTML is not a programming language
//  - It doesn't have the ability to create dynamic functionality, or logic.
//  - Instead it makes it possible to organize and format pages with help of tags (similar to Microsoft word)
//  - Then, browsers read this HTML text and show them in a formatted and colorful way to the user.
//
//  - Plain HTML is not enough for modern web applications
//  - HTML + CSS + Javascript combo is used for modern web applications.
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                                  INSPECTING AN ELEMENT IN HTML
    // - You can right click on an element and click inspect
    // - Another way is to be in the inspect menu and click on the button in the top left (inspect element) and then click on the element.
    // - We can interact with elements by using the element identifier
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                                   HTML TAG
//     -  Some elements have more than one line of code. It's still one element.
//     - all Elements have an opening tag, the majority of elements have both opening and closing. images usually don't have closing tags. Every element must have an opening tag.
//       TAG, ATT, ----------------------------------------------------------------------------VALUE----------------------
//      <img src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%2016%2016'%3E%3C/svg%3E"
//     tag, attribute, value, freetext (written in white usually)
//      Below is another example
//       TAG                        ATT         VALUE
//      <img alt="" class="sr-only" src="https://pisces.bbystatic.com/image2/BestBuy_US/images/products/4900/4900964_sd.jpg;maxHeight=214;maxWidth=278">
//      You can change the value of an image to another image and it will update the image. It's client side.
//      Each element has
//              <html>   <- TAG
////  - TAGS and ATTRIBUTES are pre-defined in HTML. Values are not.
////  - Attributes describe the element.                  closing tag
//               |-----OPENING TAG---------------|           |--|
//              <a href="http://www.google.com/">Go to Google</a>
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                                 ATTRIBUTES

//                 |----------ATTRIBUTE--------|
//              <a href="http://www.google.com/">Go to Google</a>
//                Attributes describe elements
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                               LOCATORS (AKA Selectors)
//   - Locators are commands that point Selenium to the correct web based GUI elements that it needs to interact with.

//   - By.id              -> Locates element by it's ID
//          - IDs are unique attributes of elements
//          - Should be your #1 choice when locating element
//          - They are supposed to be unique, but due to bad practices you might see the duplicate IDs in applications.
//              (not a bug, just bad practice)

//          - Example: <ul id="pet_item">                               Code that returns the web element for dog:
//                          <li id="dog_item">Dog</li>                        driver.findElement(By.id("dog_item"));
//                          <li id="cat_item">Cat</li>
//                     </ul>
//


//   - By.name            -> Locates elements whose name attribute has given value:
//      - Should be your #2 choice behind ID for locating elements.

//              Example: driver.findElement(By.name("dog_name"));


//
//   - By.tag             -> finds element based on the tag
//   - By.className       -> Find element based on class name
//   - By.xpath           -> Find different elements on web page by XML
//   - By.css             -> Find elements on web page by their CSS values
//   - By.linkText        -> finds element by the text of the link
//   - By.partialLinkText -> finds element by part of the text of the link
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                                                                      CLICK METHOD click();
//      We can use the click method for different purposes, it's a method that mimics a user clicking on a specific element.
//       Below we will go to Facebook and sign into our account.
//       Here is the email element:
        //              <input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="Email or phone number" autofocus="1" aria-label="Email or phone number">
//       And the password element:
//      //              <input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass" data-testid="royal_pass" placeholder="Password" aria-label="Password">
        // Now for the login button element:
        //              <button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login" data-testid="royal_login_button" type="submit" id="u_0_c_qJ">Log In</button>
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                                                                      SENDKEYS() and CLEAR()
//      We use the sendkeys() method for typing in inputbox. It basically sends key strokes to the browser.
//      sendkeys() will not clear text that was previously entered, so we need to use clear()
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                                                                       FACEBOOK LOG IN
//      Here we are going to put all of what we just learned together so we can log in to Facebook.
 //        1. Navigate to web page
        driver.get("https://facebook.com");

        // 2. Find the email element
        WebElement email =  driver.findElement(By.id("email"));
        email.sendKeys("berrydaniel@live.com");

        // 3. Find password element
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("why=mx+B");

        //4. Click on the login button
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();


        //5. Verification step. Using driver.getTitle();
        System.out.println(driver.getTitle());


        // 6. Navigate back (when you hit back on FB it won't log you out, so it just refreshes the page.)
        driver.navigate().back();

        // 7. Close driver
        driver.quit();

//---------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                                                      BY TAGNAME & CLASSNAME
        // By.tagname locates elements within a given tag name:
        // <a href="http://google.com">Google</a>

        // By.classname locates an element based on it's classname.
//        driver.get("https://www.guru99.com/selenium-tutorial.html");
//        WebElement submit = driver.findElement(By.className("submit"));
//        WebElement emailTextBox = driver.findElement(By.id("awf_field-111232675"));
//        emailTextBox.sendKeys("myemail@email.com");
//        Thread.sleep(1000);
//        submit.click();
//        System.out.println(driver.getTitle());
//        driver.quit();
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
        //                                                              BY LINKTEXT & PARTIAL LINK TEXT
//                      Locates link elements whose visible elements matches the given string:
        //              <a href="http://google.com">Google</a>
        //
        //                      PARTIAL LINK TEXT
        //              Locates link elements whose visible text CONTAINS the given substring.
        //      <ul>
        //         <li><a href="https://en.wikipedia.org/wiki/Doge_(meme)">
        //          Doge meme</a></li>
        //                      </ul>
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                                                      TASK 1:  CREATING ACCOUNT
//        driver.get("https://www.demo.guru99.com/test/newtours");
//        driver.manage().window().maximize();
//        Thread.sleep(2000);
//
//        driver.findElement(By.linkText("REGISTER")).click();
//        WebElement firstName = driver.findElement(By.name("firstName"));
//        WebElement lastName = driver.findElement(By.name("lastName"));
//        WebElement phoneNum = driver.findElement(By.name("phone"));
//        WebElement email = driver.findElement(By.name("userName"));
//        WebElement address = driver.findElement(By.name("address1"));
//        WebElement city = driver.findElement(By.name("city"));
//        WebElement state = driver.findElement(By.name("state"));
//        WebElement postal = driver.findElement(By.name("postalCode"));
//        WebElement userName = driver.findElement(By.name("email"));
//        WebElement pass = driver.findElement(By.name("password"));
//        WebElement confirmPass = driver.findElement(By.name("confirmPassword"));
//        WebElement submit = driver.findElement(By.name("submit"));
//
//        firstName.sendKeys("Danny");
//        lastName.sendKeys("Beezly");
//        phoneNum.sendKeys("608-334-5067");
//        email.sendKeys("deebeezly@email.com");
//        address.sendKeys("456 Drewery lane");
//        city.sendKeys("Serlam");
//        state.sendKeys("Oregon");
//        postal.sendKeys("56734");
//        userName.sendKeys("Emsde233");
//        pass.sendKeys("thisismypassword");
//        confirmPass.sendKeys("thisismypassword");
//        Thread.sleep(2000);
//        submit.click();
//        System.out.println(driver.getTitle());
//        Thread.sleep(1000);
//        driver.quit();
//_______________________________________________________________________________________________________________________






        }
}