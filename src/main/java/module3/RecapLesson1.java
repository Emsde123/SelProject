package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RecapLesson1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        // A good idea for locating an on a table, inspect one of the cell values and then collapse it.
        // This will bring you to the list of sibling elements under the parent.

        //  <-- means we want to skip a generation
//       /  <-- We want to implicitly call the next generation member


        //  TBODY   <-- TABLE BODY
        //  TH      <-- TABLE HEADER
        //  TD      <-- TABLE DATA


        // BIG DIFFERENCE BETWEEN CSS AND XPATH
        // BACKWARDS CAN ONLY BE DONE BY XPATH


        // COMMON WEB ELEMENTS THAT YOU MOSTLY INTERACT WITH:
        // Buttons        (Something happens when I click it)
        // Input Boxes
        // Forms
        // Radio Buttons (either or, can only choose one, can't unselect. Must choose a different radio button.)
        // Checkboxes    (Can check, uncheck)
        // Dropdowns     (Click on it and it drops down a list of choices)
        // Tables
        // Images
        // Tabs


        // We can have multiple testing types for one test case.
        // Example: Integration testing, End-to-End, load can all be on one test case.
        //

    }
}
