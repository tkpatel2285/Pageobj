package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import java.util.concurrent.TimeUnit;

public class BasePage
{
    public static WebDriver driver;
    public static void chrome_Driver()
    {
        // pre condition for all the test cases : need to open chrome browser
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Resources\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.NANOSECONDS);
        driver.manage().window().fullscreen();
        driver.get(" https://demo.nopcommerce.com/");//pre condition for all the test cases : Type URL demo.nopcommerce.com

    }}




