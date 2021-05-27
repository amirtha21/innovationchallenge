package StepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import pageObjects.Loginpage;
import java.util.Properties;

//Created for generating the same data again and again


public class BaseClass {
    
	public WebDriver driver;
    public LoginSteps lp;
    
    //Created for generating random string for Unique email
    public static String randomestring() {
        String generatedString1 = RandomStringUtils.randomAlphabetic(5);
        return (generatedString1);
    }

}