package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {
    public void Implicitywait() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.NANOSECONDS);
    }

    public static void explicitwait(By by) { WebDriverWait wait = new WebDriverWait(driver, 20);wait.until(ExpectedConditions.elementToBeClickable(by)); }

    public static void click_Element(By by)
    {
        driver.findElement(by).click();
    }

    public static String get_text_Element(By by) { // to get text
        String text = driver.findElement(by).getText();
        return text;
    }

    public static void clear_element(By by) { // to clear element

        driver.findElements(by).clear();
    }

    public static void assert_element(Object actual, Object expected, String message) {//for Assert
        Assert.assertEquals(actual, expected, message);
    }
    public static void selectByValue(By by, String text)
    {
        new Select(driver.findElement(by)).selectByValue(text);
    }

    public static void send_keys(By by, String b)// to send element
    {
        driver.findElement(by).sendKeys(b);
    }
    public static void selectByVisibleText(By element, String name)
    {new Select(driver.findElement(element)).selectByVisibleText(name);}

    public static String get_attriubutes(By by, String b) {
        String attr = driver.findElement(by).getAttribute(b);
        return attr;
    }

    public static List findElements(By by) {
        List a = driver.findElements(by);
        return a; }

    public static void wait_UntilClickable(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    // to wait for element to be invisible
    public static void waitForElementToBeInvisible(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    // to wait for element to be display
    public static void waitForElementToBeDisplay(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
    }
    // to wait and click
    public static void waitAndClick(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).click();
    }
    // to select from drop list by index
    public static void selectByIndex(By element, int numb)
    {new Select(driver.findElement(element)).selectByIndex(numb);
    }
    //get text from given location
    public static String getText(By by) {
        driver.findElement(by).isDisplayed();
        return driver.findElement(by).getText();
    }
    // for creating timestamp to use in email
    public static String timestampShort()
    {
        SimpleDateFormat format = new SimpleDateFormat("DDMMHHMMSS");
        return format.format(new Date());
    }

    public static String timestampLong()
    {
        SimpleDateFormat format = new SimpleDateFormat("DDMMYYHHMMSS");
        Date date = new Date();
        return format.format( date);
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // This  will scroll down the page by  1000 pixel vertical
        js.executeScript("window.scrollBy(0,1000)");
    }
    public void alertDismiss(){ driver.switchTo().alert().dismiss(); }
    public void alertAccept(){ driver.switchTo().alert().accept(); }


}
