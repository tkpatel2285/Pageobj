package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PageLoad {

    static Properties prop;
    static FileInputStream input;
    static String fileName = "TestDataConfig.properties";
    static String fileLocation = "src\\Resources\\config.properties";

    public String getProperty(String key)
    {

        prop = new Properties();
        try{
            input=new FileInputStream("config.properties" + "src\\Resources\\config.properties");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }

}
