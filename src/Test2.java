
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

@Test
public class Test2 {

	
	AppiumDriver<MobileElement> driver ;
	
	public void pass()  {
		
		assertTrue(false);
		
	}
	
      public void fail()  {
		
		assertTrue(false);
		
	}
     @AfterTest
    public void generate() throws Exception {
    	
    	  Xl.generateReport("D:\\SDK","report1.xls");
    	
    } 
      
}