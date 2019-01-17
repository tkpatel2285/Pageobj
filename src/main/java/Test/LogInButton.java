package Test;

import org.openqa.selenium.By;

import java.util.Date;

public class LogInButton extends Utils{

    HomePage hm = new HomePage();
    LoadProp loadProp = new LoadProp();

    By _enteremail = By.id("Email");
    By _enterpassword= By.id("Password");
    By _loginbuttonfinal = By.xpath("//input[@value='Log in']");
    By _logout = By.linkText("Log out");
    public void userDetail()
    {
        hm.clickOnLogIn();
        send_keys(_enteremail,"tkpatel2285@gmail.com");
        send_keys(_enterpassword,"Tarun123");
        click_Element(_loginbuttonfinal);
    }

    public void userLogOut(){
        click_Element(By.linkText("Log out"));
    }


}
