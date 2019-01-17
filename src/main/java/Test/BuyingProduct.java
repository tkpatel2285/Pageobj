package Test;

import org.openqa.selenium.By;

public class BuyingProduct extends Utils
{
    LogInButton a5 = new LogInButton();
    ShoppingCartPage shoppingcartpage = new ShoppingCartPage();
    CreditCardDetailsPage creditcard = new CreditCardDetailsPage();
    HomePage homepage = new HomePage();

    By adtocartbutton = By.xpath("//input[@id=\"add-to-cart-button-4\"]");
    By shoppingcart = By.linkText("Shopping cart");

    public void buying() {
        a5.userDetail();
        click_Element(adtocartbutton);
        click_Element(shoppingcart);
        homepage.appleMacBook();
        shoppingcartpage.checkOut();
        click_Element(By.id("paymentmethod_1"));
        creditcard.userShouldBeAbleToEnterCardDetails();


    }
}