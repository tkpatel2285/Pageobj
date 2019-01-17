package Test;

import org.openqa.selenium.By;


public class UserShouldBeSentEmailSuccessfully extends Utils
{     LogInButton loginbuton    = new LogInButton();
      LoadProp loadprop         = new LoadProp();
      HomePage homepage         = new HomePage();
      UnregisterShouldNotbeAbleToSendEmail email = new UnregisterShouldNotbeAbleToSendEmail();

        By clickemailfriend     = By.xpath("//div[@class=\"overview-buttons\"]/div[3]");
        By friend_email         = By.xpath("//input[@id='FriendEmail']");
   public void UserShouldBeSentEmailSuccessfully() {

      loginbuton.userDetail();
      homepage.appleMacBook();
      click_Element(clickemailfriend);//click on "Email a friend" Button
      send_keys(friend_email,loadprop.getproperty("FriendEmail"));//enter friend's email address
      click_Element(By.xpath("//form[@method=\"post\"]/div[2]/input"));//click on SEND EMAIL button
      String AculatMessgae = driver.findElement(By.xpath("//div[@class=\'result\']")).getText();
      assert_element(AculatMessgae,"Your message has been sent.", "Email address is not valis");//expected result "Your message has been sent"
      //actual result "Your message has been sent"
      //test case pass

   }

   }