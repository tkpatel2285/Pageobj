package Test;

import org.openqa.selenium.By;

import static Test.Utils.click_Element;

public class UnregisterShouldNotbeAbleToSendEmail extends Utils
{       LoadProp loadprop = new LoadProp();
        HomePage homepage = new HomePage();
        By clickemailfriend = By.xpath("//div[@class=\"overview-buttons\"]/div[3]");
        By friend_email = By.xpath("//input[@id='FriendEmail']");
        By youremail = By.xpath("//input[@id='YourEmailAddress']");
        By sendemailbutton = By.xpath("//form[@method=\"post\"]/div[2]/input");


    public void unregisterEmailUserNotBeAble() {
    // click on any product
    homepage.appleMacBook();
    click_Element(clickemailfriend);////click on "Email a friend" Button
    send_keys(friend_email,loadprop.getproperty("FriendEmail"));//enter friend's email address
    send_keys(youremail,"tkpaagv@gmail.com");//enter unregister email address
    click_Element(sendemailbutton);//click on SEND EMAIL button
    String actualerrormessage = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]")).getText();
    assert_element(actualerrormessage,"Only registered customers can use email a friend feature", "You need to Register ur email address");
    //expected result = "Only registered customers can use email a friend feature"
    //actual result = "Only registered customers can use email a friend feature"
    //Test case pass


}



}
