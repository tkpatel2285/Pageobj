package Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{
    AddTOCartButton addtocartbutton = new AddTOCartButton();
    BuyingProduct buyingproduct = new BuyingProduct();
    RegisterPage usershouldberegister = new RegisterPage();
    UserShouldBeSentEmailSuccessfully userShouldBeSentEmailSuccessfully = new UserShouldBeSentEmailSuccessfully();
    UnregisterShouldNotbeAbleToSendEmail unreg = new UnregisterShouldNotbeAbleToSendEmail();
    ShoppingCartPage shopingcart = new ShoppingCartPage();
    HighPriceToLow highpricetolow = new HighPriceToLow();
    HomePage homepage = new HomePage();
    Jewellery jewellery = new Jewellery();
    LogInButton loginbutton = new LogInButton();
    CheckOutPage checkoutpage = new CheckOutPage();
    CreditCardDetailsPage creditcard = new CreditCardDetailsPage();
    BrowserSetUp browsr = new BrowserSetUp();

    private final static String expectedPaymentConfirmation  = "Your order has been successfully processed!";


    @Test
    public void addtoCartButtonPresentInHomepage() {

    addtocartbutton.addtoCartButtonPresent(); }

    @Test
    public void buyingProductSuccesfully() { buyingproduct.buying();
        creditcard.userShouldBeAbleToEnterCardDetails(); }

    @Test
    public void userShouldBeRegistersucessfullygkkkk()//for register new user
    {
        usershouldberegister.registerNewUser();
        loginbutton.userLogOut();
    }

    @Test
    public void userShouldEmailSuccessfullyToFriend()//for send an email for product to friend with valid login
    {
        userShouldBeSentEmailSuccessfully.UserShouldBeSentEmailSuccessfully();
        loginbutton.userLogOut();


    }

    @Test
    public void userShouldNotEmail()//for cant send an email for product to friend without register email
    {
        unreg.unregisterEmailUserNotBeAble();
    }

    @Test
    public void termsConditions()//terms n condition needs to accept
    {
        shopingcart.acceptTermsAndConditions();
    }


    @Test
    public void highpriceToLowprice() {
        highpricetolow.SortThePriceHighToLow();
    }


    @Test
    public void jewelleryEuroTodollor(){

        jewellery.dollorToEuro();
    }


}


