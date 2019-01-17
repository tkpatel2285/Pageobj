package Test;

import org.openqa.selenium.By;

public class CreditCardDetailsPage extends Utils

{
    LoadProp loadProp = new LoadProp();

    private By _cardholderNameField = By.id("CardholderName");private By _cardNumberField = By.id("CardNumber");
    private By _cardExpireMonth = By.id("ExpireMonth");
    private By _cardExpireYear = By.id("ExpireYear");
    private By _cardCode = By.id("CardCode");
    private By _clickOnContinue = By.xpath("//input[@onclick='PaymentInfo.save()']");

    private By _confirmorder = By.xpath("//div[@id=\"confirm-order-buttons-container\"]/input");

    public void userShouldBeAbleToEnterCardDetails() {
        explicitwait(By.id("CardholderName"));
        send_keys(_cardholderNameField, loadProp.getproperty("Cardholdername"));
        send_keys(_cardNumberField, loadProp.getproperty("Cardnumber"));
        selectByVisibleText(_cardExpireMonth, loadProp.getproperty("Expiremonth"));
        selectByVisibleText(_cardExpireYear, loadProp.getproperty("Expireyear"));
        send_keys(_cardCode, loadProp.getproperty("Cardcode"));
        click_Element(_clickOnContinue);
        scrollDown();
        explicitwait(By.xpath("//div[@id=\"confirm-order-buttons-container\"]/input"));
        click_Element(_confirmorder);
    }
}
