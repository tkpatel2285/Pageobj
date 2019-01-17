package Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class BrowserSetUp extends BasePage
{
    LoadProp loadprop = new LoadProp();




    public void selectBrowser(){

                //String browser = loadprop.getproperty("Browser");
            String browser = System.getProperty("browser");
            if (browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver","src\\test\\java\\Resources\\Driver\\geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();

            }
            else  if(browser.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Resources\\Driver\\chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("disable-infobars");
                options.addArguments("--disable-extensions");
                options.addArguments("--disable-browser-side-navigation");
                options.addArguments("--incognito");
                options.addArguments("--disable-blink-features-Blockcredentialedsubsources");

                driver = new ChromeDriver(options);
                driver.manage().window().maximize();

            }
                else if(browser.equalsIgnoreCase("IE")) {
                System.setProperty("webdriver.ie.driver", "src\\test\\java\\Resources\\Driver\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                InternetExplorerOptions options = new InternetExplorerOptions();
                options.setCapability(InternetExplorerDriver.IE_SWITCHES,"-private");
                options.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
                driver = new InternetExplorerDriver(options);
                driver.manage().window().maximize();

                }
            {System.out.print("Wrong Browser" +browser);}
        }
    }
