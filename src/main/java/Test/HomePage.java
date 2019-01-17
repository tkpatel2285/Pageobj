package Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;


import java.util.List;

public class HomePage extends Utils {

    By _clicklogin = By.linkText("Log in");
    By _clickcomputer = By.linkText("Computers");
    By _clickelectronics = By.linkText("Electronics");
    By _clickappareL = By.linkText("Apparel");
    By _clickdownloads = By.linkText("downloads");
    By _clickbooks = By.linkText("Books");
    By _clickjewelry = By.linkText("Jewelry");
    By _clickgiftcard = By.linkText("Gift Cards");
    By _applemacbook = By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[2]/div/div[1]");



    public void electronicsButton() { click_Element(_clickelectronics); }
    public void computerButton(){ click_Element(_clickcomputer); }
    public void appareLButton()
    {
        click_Element(_clickappareL);
    }
    public void booksButton()
    {
        click_Element(_clickbooks);
    }
    public void downloadsButton()
    {
        click_Element(_clickdownloads);
    }
    public void jewelryButton()
    {
        click_Element(_clickjewelry);
    }
    public void giftCardButton()
    {
        click_Element(_clickgiftcard);
    }
    public void clickOnLogIn()
    {
        click_Element(_clicklogin);
    }
    public void changeCurrencyToDollar()
    {
        selectByVisibleText(By.id("customerCurrency"),"US Dollar");
    }
    public void changeCurrencyToEuro() {
        selectByVisibleText(By.id("customerCurrency"), "Euro");
    }
    public void appleMacBook(){ click_Element(_applemacbook); }
}

