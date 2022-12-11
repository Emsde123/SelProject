package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class WebTables {
    public static void main(String[] args) throws InterruptedException {


    // *[class='className']                                     * is a wildcard
    // tag[id='idSample']/..                                  /.. is how you go up to parent, to go up another level just add another /..
    // *[@attrName='AttrValue']/div[@AttrName='Attrvalue']    / lets you go down to the child element.

    // METHODS:
    // contains: //tagname[contains(@AttrName, 'PartialAttrValue')]

    // WEBTABLES

    // 'table' tag -> defines html table
    // 'thead' tag -> defines container for table header
    // 'tbody' tag -> defines the table body
    // 'td'    tag -> defines the data cell (row + td = data cell)
    // 'tr'    tag -> defines table row

    // below is an example of a table structure, and how we'd use xpath to select an element on a table.

    //-------------------------------------------
    // table (parent)                           |
    //      thead (child)                       |
    //          tr (grand child)                |
    //      tbody (child)                       |
    //          tr (grand child)                |
    //              td(grand grand child)       |
    //------------------------------------------|

    // th = table header
    // td = table data/body (most info here)
    // tr = table row

    // //table[@id='expenses-table']/tbody/tr[1]/td[6]
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // INTERACTING WITH A TABLE TO PRINT ALL NAMES IN A ROW

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
//
//        driver.get("https://testautomationpractice.blogspot.com/");
//        List<WebElement> allAuthors = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[2]"));
//        System.out.println("The allAuthors list size is: " + allAuthors.size());
//
//        // OPTION 1 (FOR EACH LOOP)
//        for(WebElement eachAuthor : allAuthors){
//            System.out.println(eachAuthor.getText());
//        }
//
//
//        // OPTION 2 (FOR LOOP)
//        for(int i = 0; i < allAuthors.size(); i++){
//            System.out.println(allAuthors.get(i).getText());  // <--- .getText() is a MUST!! If you don't use it then you will not get what you want.
//        }
//
//
//        // OPTION 3 (DO WHILE)
//        int count = 0;
//        do{
//            System.out.println(allAuthors.get(count).getText());
//        }while(count < allAuthors.size());
//
//        driver.quit();
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                          PRINTING A WHOLE TABLE IN THE CONSOLE

        // Holy crap, this task was crazy.
        // We started by creating a list and populating it with all the authors. We did this by using xpath till we narrowed down 1 of 6 and they were all authors.
        // Once we had the list of authors, we created a string that contained the xpath to get the author and all the authors books.
        // Instead of hardcoding the xpath and creating a new xpath for each author we added %authorName% and %index%
        // Both of those substrings were meant to be unique identifiers that we can easily go back and replace with the values we want to specify.
        // We did that inside the inner for loop. I'll break it down below.

        // driver.findElement(By.xpath(xpathGeneric.replace("%authorName%", allAuthors.get(i).getText()).replace("%index%", String.valueOf(j)))).getText() + ", ";


        // xpathGeneric.replace("%authorName%", allAuthors.get(i).getText()).replace("%index%", String.valueOf(j)))).getText()



                driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
                Thread.sleep(2000);
               List<WebElement> allAuthors = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']/tbody/tr/td[1]"));
               String xpathGeneric = "//table[@id='BooksAuthorsTable']//td[text()='%authorName%']/following-sibling::td[%index%]";
               String authorsBooks = "";

                for(int i = 0; i < allAuthors.size(); i++){
                    for(int j = 1; j <= 3; j++){
                        // This line is interacting with the xpathGeneric String above, and replacing %authorName% with the actual authors name, letting us use a dynamic xpath.
                    authorsBooks += driver.findElement(By.xpath(xpathGeneric.replace("%authorName%", allAuthors.get(i).getText())
                                .replace("%index%", String.valueOf(j)))).getText() + ", "; // <-- That was complaining because we can't replace char with integer, so we had to make the number a string basically.
                    }
                    System.out.println(allAuthors.get(i).getText() + ": " + authorsBooks.substring(0, authorsBooks.length()-2));
                    authorsBooks = ""; // <-- This is to reset the string every time it loops, so we don't end up with a list of every single book.
                }


            driver.quit();


   }
}
