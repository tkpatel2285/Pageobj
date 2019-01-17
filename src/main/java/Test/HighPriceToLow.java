package Test;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HighPriceToLow extends Utils
{
    HomePage homepage = new HomePage();

    By _cameranphoto = By.linkText("Camera & photo");
    By _sortorder = By.xpath("//select[@aria-label=\"Select product sort order\"]/option[5]");

    public void SortThePriceHighToLow() {

        homepage.electronicsButton();
        click_Element(_cameranphoto);
        click_Element(_sortorder);
        String highprice = get_text_Element(By.xpath("//div[@class='item-grid']/div[1]/div/div[2]/div[3]/div[1]/span"));

        String lowprice = get_text_Element(By.xpath("//div[@class=\"item-grid\"]/div[3]/div/div[2]/div[3]/div[1]/span"));
        String firstitme= highprice.replaceAll("[$,]", "");
        // Converting a String into Integer
        float first_item_price = Float.valueOf(firstitme);
        // getting the  price of the last product

        // Removing the Specials Keywords
        String lastitem = lowprice.replaceAll("[$,]", "");
        // Converting the string into Integer
        float low_item = Float.valueOf(lastitem);
        Assert.assertTrue(first_item_price>low_item,"Test Pass");
        if (first_item_price > low_item) {
            System.out.println("Test pass");
        }
        else {
            System.out.println("tset fail");
        }
        System.out.println("First price displayed = "+first_item_price);
        System.out.println("Last price displayed = "+low_item);



    }

}
