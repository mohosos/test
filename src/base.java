import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.automationtesting.excelreport.Xl;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.AppiumDriver ;
import io.appium.java_client.MobileElement;

public class base {
       
       public static AppiumDriver<MobileElement> driver ;
       @BeforeTest
       
public void dependencies () throws MalformedURLException {
	
    	  DesiredCapabilities capabilities = new DesiredCapabilities();
 		  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "NE1GAM4782367683"); //NE1GAM4782367683
 		  //capabilities.setCapability("automationName", "uiautomator2");
 		  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
 		  capabilities.setCapability(MobileCapabilityType.VERSION, "7.0");
 		  capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.ebc.mvisa.intellisc");
 		  capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".EBC");
 		  driver = new AndroidDriver<MobileElement> ( new URL ("http://0.0.0.0:4723/wd/hub") , capabilities) ;
 		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 		  
}

/*@AfterTest
public void after() throws Exception  {
	
	Xl.generateReport("D:\\TestResult","FinalReport.xls");
}*/

}
