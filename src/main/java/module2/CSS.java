package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CSS {
    public static void main(String[] args) throws InterruptedException {

        /*CSS is an alternative to xpath, it is faster and simpler than xpath.*/
        // it's not as flexible as xpath though. Example of syntax below:

        // CSS:                         a[href*='top-deals']  <-- The * works like contains method
        // CSS:                         a[href$='ape']        <-- $ signifies starts with
        // CSS:                         a[href^='deals']      <-- ^ is ends with
        // xpath:                  //div[@name='booking']
        // CSS:                      div[name='booking']
        // CSS wildcard:             [name='booking']     <-- no *
        // Syntax:                   tag[attribute='value']
        // Full CSS selector:        driver.findElement(By.css("[class='primary-btn']"));
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        // BEST BUY TASK WITH CSS
//        // https://www.bestbuy.com/
//        // Searchbox
//        //  Fairfax (your city might be different)
//        // Cart
//        // Logo

//        driver.get("https://bestbuy.com");
//        driver.findElement(By.cssSelector("input[id='gh-search-input']"));
//        driver.findElement(By.cssSelector("span[class='store-display-name']"));
//        driver.findElement(By.cssSelector("span[class='cart-label']"));
//        driver.findElement(By.cssSelector("svg[aria-label='BestBuy.com']"));
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    // CSS SHORTCUTS

    // CSS: .  <-- Refers to class always
    // CSS: #  <-- Refers to ID always

    // Selecting by classname
    // CSS: div[class='className']
    // CSS shortcut: .className     <-- brings all elements that have className
    //               div.className  <-- also does the same thing, but narrows it down.

    // Selecting by ID
    // CSS:         div[id='IDName']
    // Shortcut:    div#IDName
    // Shortcut2:   #IDName


    // Parent to child
    // .bottom-nav-right>li>div>button[data-lid='hdr_shistory_lv']

    // :nth-child(n)
    // CSS
    // .bottom-nav-right>li:nth-child(1)  <-- goes to the specific child
    // XPATH
    // //*[@class='bottom-nav-right']/child::li  <-- goes to li child
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//      MULTIPLE CLASS NAMES (WHITE SPACE)
        // When you have an empty space in a class name, CSS treats it as 2 names.
        // Sometimes CSS does this so the start of a class can be the same as others, but they get specific with the last half.
        // Example:  class = "c-button plButton orderStatus-button"
        // Example2: class = "c-button burritoButton orderLog-button"

        // HOW TO DEAL: .c-button.burritoButton.orderLog-button

        // .c-button burritoButton orderLog-button <-- WILL NOT WORK

        // You can also negate the first part of the name, since CSS treats it as seperate classes. Example:
        // .orderLog-button   <-- would find burritoButton element even if we don't add the c-button.burritoButton before it.
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // SKIP GENERATIONS WITH CSS
        // if we had an element that isn't a direct child we can actually skip whole generations.
        // We do this by utilizing white space. Example below:
        //   #ul-id-2 span  <-- returns me all span descendants of ui-id-2 IDs.

        // to get more in depth we can combine it with previous methods.
        // #ui-id-2>li:nth-child(1) span  <-- should return all span elements that are the first child of an li parent that resides inside of all #ul-id-2 elements

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //                  CONTAINS CSS

        //  .categories-menu [href*='tanks-men'] <-- using the * we can accomplish the same thing as contains in xpath.
        //  [contains(@href, 'tanks-men')]       <-- xpath equivalent of above line
        // the above line is saying to locate any descendants of categories-menu class that have an href value that contains "tanks-men"
 //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //                  MULTIPLE ATTRIBUTES CSS

        // You can use multiple attributes in CSS like you can in xpath. Both examples are below:
        //  XPATH:     //*[@attrName='attrValue' and @attrName = 'attrValue']
        //  XPATH2:    //*[@attrName='attrValue'][@attrName = 'attrValue']

        // CSS:        span[id=glow-ingress-line2][class='nva-line2']
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //                                                          PRACTICE


//        driver.get("https://bestbuy.com");
//        driver.manage().window();
//        WebElement searchBox = driver.findElement(By.cssSelector("#gh-search-input"));  // <-- SEARCH BY ID
//        WebElement searchBtn = driver.findElement(By.cssSelector(".header-search-button")); // <-- BY CLASS
//
//        searchBox.sendKeys("Iphone");
//        searchBtn.click();
//        driver.quit();

//        driver.get("https://magento.softwaretestingboard.com/");
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("#ul-id-2>li:nth-child(1) span")).click();
//
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //                                                      PRACTICE 2
        // Grab all tab elements from amazon, and loop through them until the title equaled "New releases", once it did that we click on it and then break the loop. We then print the title.
//        driver.get("https://www.amazon.com");
//        driver.manage().window().maximize();
//        List<WebElement> allTabElems = driver.findElements(By.cssSelector("#nav-xshop-container a"));  // <-- we avoided going to the parent of a, and instead skipped a generation with the space.
//        for(WebElement eachTab : allTabElems){
//            if(eachTab.getText().equalsIgnoreCase("New releases")){
//                eachTab.click();
//                break;
//            }
//        }
//        Thread.sleep(1000);
//        System.out.println(driver.getTitle());
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                                               PRACTICE 3

//        driver.get("http://automationpractice.com/index.php");
//        driver.manage().window().maximize();
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("ul.submenu-container a[class='sf-with-ul'][title='Dresses']")).click();
//        System.out.println(driver.getTitle());
//        driver.quit();
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                                                IN CLASS TASK
        driver.get("https://www.ohchr.org/");
        driver.manage().window().maximize();
        WebElement donateBtn = driver.findElement(By.cssSelector(".btn-donate"));
        WebElement navBar = driver.findElement(By.cssSelector(".ml-menu--level-0.ml-menu--oh-main-nav"));
        List<WebElement> navBarChildElements = driver.findElements(By.cssSelector(".ml-menu--level-0.ml-menu--oh-main-nav>li"));
        System.out.println(navBarChildElements.size());
        driver.quit();









    }


}
