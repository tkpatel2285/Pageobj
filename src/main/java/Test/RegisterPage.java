package Test;

import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;


public class RegisterPage extends Utils{

            LoadProp lodprop = new LoadProp();

        By register         = By.linkText("Register");//click on register page
        By gender           = By.id("gender-male");//select gender
        By firstname        = By.id("FirstName");//type firstname
        By lastname         = By.id("LastName");//type last name
    //select date of Birth
        By dateofbirth      = By.xpath("//div[@class=\"page registration-page\"]/div[2]/form/div[1]/div[2]/div[4]/div/select[1]/option[5]");
        By monthofbirth     = By.xpath("//div[@class=\"page registration-page\"]/div[2]/form/div[1]/div[2]/div[4]/div/select[2]/option[3]");
        By yearofbirth      = By.xpath("//div[@class=\"page registration-page\"]/div[2]/form/div[1]/div[2]/div[4]/div/select[3]/option[79]");
        By enteremail       = By.id("Email");//enter email address
        By company          = By.id("Company");
        By newsletter       = By.id("Newsletter");
        By password         = By.id("Password");//enter password
        By reenterpassword  = By.id("ConfirmPassword");//reenter password
        By clickregister    = By.id("register-button");//click on register button


        public  void registerNewUser(){

        click_Element(register);
        click_Element(gender);
        send_keys(firstname,lodprop.getproperty("Firstname"));
        send_keys(lastname,lodprop.getproperty("Lastname"));
        click_Element(dateofbirth);
        click_Element(monthofbirth);
        click_Element(yearofbirth);
        send_keys(enteremail,"tkpatel22851789+" +timestampLong() + "@gmail.com");
        send_keys(company,lodprop.getproperty("CompanyName"));
        click_Element(newsletter);
        send_keys(password,lodprop.getproperty("Password"));
        send_keys(reenterpassword,lodprop.getproperty("Password"));
        click_Element(clickregister);
        String actualRegisterSuccessMessage = driver.findElement(By.xpath("//div[@class='result']")).getText();//expected result"Your registration completed"
        // actual result "Your registration completed"
        assert_element(actualRegisterSuccessMessage,"Your registration completed","Test case failed");


    }
}
