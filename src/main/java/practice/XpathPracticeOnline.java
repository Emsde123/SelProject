package practice;

public class XpathPracticeOnline {
//                                              XPATH PRACTICE
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    // RELATIVE SELECTOR

    //   //*/a <-- Selects all elements which are 'a' tag, that also have parent elements.
    //   //*/div <-- selects all div elements that have parent elements.
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    // DESCENDANT SELECTOR

    //   //div/b  <-- Selects all b inside of div, b is the descendant element that is inside another element.
    //   //*[@id='fancy']/span    <-- selects any span that is a descendant of any element with an id of 'fancy'
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    // COMBINING DESCENDANT AND ID SELECTORS

    //   //*[@id='id']/a  <-- selects all 'a' inside of any element with an id of 'id'
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    // CLASS SELECTOR WITH CONTAINS METHOD

    //   //*[contains(@class, 'neato')] <-- selects all elements with a class name that contains 'neato'
    //   //a[contains(@class, 'important')] <-- selects all elements with 'a' parent, and class that contains 'important'
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    // SELECT THE SMALL ORANGES INSIDE THE BENTOS

    //   //bento/orange[contains(@class, 'small')]
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    // | COMBINER

    //   //a| //*[@id='fun']  <-- selects all 'a' elements, and all elements with an id of 'fun'
    //   //p|//a|//div        <-- selects all 'p', 'a', and 'div' elements.
    //   //plate|//bento      <-- selects all plates and bentos
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    // UNIVERSAL SELECTOR

    //   //a/*    <-- selects all elements inside of 'a'
    //   //ul[@id='fancy']/*    <-- all elements inside all ul[@id='fancy'] elements.
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    // ADJACENT SIBLING SELECTOR (FOLLOWING)

    //   //a/following-sibling::b  <-- selects all 'b' elements that directly follow 'a' elements.

    //                            Elements that follow one another are called siblings. They are on the same level.

    //   //p/following-sibling::div <-- selects any 'div' elements that follow 'p' elements.
    //   //plate/following-sibling::apple <-- selected all apples that were adjacent to a plate



    // ADJACENT SIBLING SELECTOR (PRECEDING)

    //   //a/preceding-sibling::b   <-- selects all B elements that directly precedes A.
    //   //plate/preceding-sibling::pickle <-- selected all pickles that came before a plate.
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    // INDEX SELECTOR (try to avoid)

    //   (//a)[2]   <-- selects the second 'a' element.
    //   (//pickle)[3] <-- chose the third pickle element.
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    // CHILD SELECTOR

    //   //a/b   <-- selects all 'b' elements that are a direct child of 'a'
    //   //plate/apple <-- chose all apples that were on a plate (child of plate)
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    // LAST SELECTOR

    //   (//div)[last()] <-- selects the last <div> element.
    //    //div/*[last()] <-- selects all the last elements inside div elements.

    //    //plate[@id='fancy']/apple | (//orange)[last()]   <-- selected apple on plate AND the last orange in the list.

    //    //plate/apple[last()]  <-- selects the last apple on each plate.

    // PRO TIP: If there is only one element, it counts as the first child, last child, and only child!
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    // LAST - N SELECTOR

    //   //a[last() - n]  <-- syntax (n can be any number)
    //   //a[last() - 3]  <-- selects the 4th last 'a' element
    //   //plate/apple[last()-1] <-- selects the 2nd apple from the bottom of a plate stacked with apples.
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    // ATTRIBUTE SELECTOR

    //   //*[@attribute]    <-- selects all elements with that attribute.
    //   //a[@href]         <-- selects all 'a' elements that have an href attribute.
    //   //*[@type]         <-- selects all elements that have a type attribute.
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    // MULTIPLE ATTRIBUTE VALUE SELECTOR

    //   //b[@type='my' and @href='myhref']/a               <-- selects all 'a' elements with a 'b' parent that
    //                                                          also has the defined type and href

    //   //plate[@id='fancy' and @for='Hanna']/apple        <-- selects the apple on a fancy plate for Hanna.
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    // ATTRIBUTE STARTS WITH SELECTOR

    //   //toy[starts-with(@category, 'swim')]   <-- selects toys with category "swimwear"
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    // ATTRIBUTE ENDS WITH SELECTOR

    //   //*[substring(@attribute, string-length(@attribute) - string-length('end text')+1) = 'end text']
    //   //img[substring(@src, string-length(@src) - string-length('.jpg')+1) '.jpg']   <-- selects all images display a jpg image
//------------------------------------------------------------------------------------------------------------------------------------------------------------------



}
