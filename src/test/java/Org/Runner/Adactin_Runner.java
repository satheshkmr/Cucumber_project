package Org.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Org.Base_Class.Base_Class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Org\\Feature",glue="Org.StepDefinition",
monochrome = true,dryRun = false)

public class Adactin_Runner { 
	
public static WebDriver driver;
	
	@BeforeClass
	public static void start()
	{
		
	driver=Base_Class.launch_browser();
	driver.manage().window().maximize();
	}
	
   // @AfterClass
    public static void End()
    {
    	driver.quit();
    }
	
	

}
