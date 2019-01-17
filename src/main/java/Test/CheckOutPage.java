package Test;

import org.openqa.selenium.By;

public class CheckOutPage extends Utils
{
    LoadProp loadProp = new LoadProp();

     By _firstNameField = By.id("BillingNewAddress_FirstName");
     By _lastNameField = By.id("BillingNewAddress_LastName");
     By _emailField = By.id("BillingNewAddress_Email");
     By _countryNameField = By.id("BillingNewAddress_CountryId");
     By _billingCity = By.id("BillingNewAddress_City");
     By _billingAddress1 = By.id("BillingNewAddress_Address1");
     By _billingPostCode = By.id("BillingNewAddress_ZipPostalCode");
     By _billingPhoneNumber = By.id("BillingNewAddress_PhoneNumber");
     By _clickOnContinueButton = By.xpath("//input[@title='Continue']");


    public void fillCheckOutPageDetails()
    {
        send_keys(_firstNameField, loadProp.getproperty("Firstname"));
        send_keys(_lastNameField, loadProp.getproperty("Lastname"));
        send_keys(_emailField, loadProp.getproperty("Email") + timestampLong() + "@gmail.com");
        selectByVisibleText(_countryNameField,loadProp.getproperty("Country"));
        send_keys(_billingCity,loadProp.getproperty("City"));
        send_keys(_billingAddress1,loadProp.getproperty("Address1"));
        send_keys(_billingPostCode, loadProp.getproperty("Postcode"));
        send_keys(_billingPhoneNumber,loadProp.getproperty("Phonenumber"));
        click_Element(_clickOnContinueButton);
    }

    public void clickOnContinue()
    {
        click_Element(_clickOnContinueButton);
    }



   }


