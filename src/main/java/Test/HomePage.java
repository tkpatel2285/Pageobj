package Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;


import java.util.List;

public class HomePage extends Utils {

    By clicklogin = By.linkText("Log in");
    By enteremail = By.id("Email");
    By enterpassword= By.id("Password");
    By clickcomputer = By.linkText("Computers");
    By clickelectronics = By.linkText("Electronics");
    By clickappareL = By.linkText("Apparel");
    By clickdownloads = By.linkText("downloads");
    By clickbooks = By.linkText("Books");
    By clickjewelry = By.linkText("Jewelry");
    By clickgiftcard = By.linkText("Gift Cards");




    public void userDetail()
    {
        click_Element(clicklogin);
        send_keys(enteremail,("tkpatel2285@gmail.com"));
        send_keys(enterpassword,"Tarun123");
    }

    public void electronicsButton()
    {
        click_Element(clickelectronics);

    }

    public void computerButton(){
        click_Element(clickcomputer);
    }
    public void appareLButton()
    {
        click_Element(clickappareL);
    }
    public void booksButton()
    {
        click_Element(clickbooks);
    }
    public void downloadsButton()
    {
        click_Element(clickdownloads);
    }public void jewelryButton()
    {
        click_Element(clickjewelry);
    }public void giftCardButton()
    {
        click_Element(clickgiftcard);
    }

    //    SoftAssert softAssert = new SoftAssert();
//
//    public void addtoCartButtonPresent() {
//        int a = 0;
//        // Arreylist method to get the list
//        List<WebElement> addtocart = findElements(By.xpath("// div[@class=\"item-grid\"]/div/div[@class=\"product-item\"]/div[2]/div[3]/div[2]/input[1]"));
//
////for each to get the value for "Add to cart button" and increase
//        for (WebElement b2 : addtocart) {
//            softAssert.assertEquals("Add to cart", b2.getAttribute("value"));
//            a++;
//            System.out.println(b2.getAttribute("Value"));
//        }
//
//        System.out.println("****************************");
////      compare the actual vs expected addtocart button present
//        assert_element(addtocart.size(), a, "Test case failed");
//
//        System.out.println(addtocart.size() + "");
//        System.out.println(a + "");
////        softAssert.assertAll();
//
//
//    }
}