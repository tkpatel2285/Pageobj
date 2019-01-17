package Test;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils
{
    HomePage homePage = new HomePage();
        By _billinggmethod       = By.xpath("//div[@id=\"billing-buttons-container\"]/input");
        By _shippingmethod       = By.xpath("//div[@id=\"shipping-method-buttons-container\"]/input");
        By _shippingmethodnext   = By.xpath("//input[@class=\\\"button-1 shipping-method-next-step-button\\\"]");
        By payment               = By.id("paymentmethod_1");
        By paymentnext           = By.xpath("// input[@class=\"button-1 payment-method-next-step-button\"]");
        By checkout              = By.id("checkout");
        By termsofservice        = By.id("termsofservice");

        //checkout for any products
        public void checkOut(){
        acceptTermsAndConditions();
        clickOnCheckOut();
        click_Element(_billinggmethod);
        explicitwait(_shippingmethod);
        click_Element(_shippingmethod);
        //waitForElementToBeDisplay(By.xpath("//div[@id=\\\"shipping-method-buttons-container\"]/input"),10);
        click_Element(_shippingmethodnext);
        // Select Credit Card
        explicitwait(payment);
        click_Element(payment);
        // Click on Continue
        click_Element(paymentnext);
    }
    public void clickOnCheckOut()
    {//     To click on check out button
        click_Element(checkout);
    }

    public void acceptTermsAndConditions()
    {
//    To accept terms and conditions
        click_Element(termsofservice);
    }
}
