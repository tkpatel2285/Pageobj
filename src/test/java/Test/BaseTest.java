package Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;

public class BaseTest extends Utils
{

    @BeforeMethod

    public void before()
    {
            chrome_Driver();

    }

    @AfterMethod
    public void after(ITestResult result)
    {
        if (ITestResult.FAILURE == result.getStatus())
        {
            try
            {
                TakesScreenshot ts = (TakesScreenshot) driver;
                File source = ts.getScreenshotAs(OutputType.FILE);
                  FileUtils.copyFile(source, new File("src\\test\\java\\Resources\\Driver\\Screenshot" + result.getName() + ".png"));
                System.out.println("Screenshot taken");
            }
            catch (Exception e)
            {
                System.out.println("exception while taking Screenshot " + e.getMessage());
            }

        }
        driver.quit();
    }



}

