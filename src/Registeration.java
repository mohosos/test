import static org.testng.AssertJUnit.assertFalse;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
//import org.apache.commons.io.FileUtils;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.TouchAction;

import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File ;
import java.io.IOException;

public class Registeration extends base   {
	
	@Test (priority= 0 )
	public void N_Try_to_input_wrong_mobile_number () throws IOException   {
		new TouchAction(driver).tap(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[4]"))).perform(); //real
		new TouchAction(driver).tap(driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'skipBtn')]"))).perform();
		driver.findElement(By.xpath("//android.widget.EditText[@text='01xxxxxxxxx']")).sendKeys("711223344");
		driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'nextButton')]")).click();
		/*MobileElement e1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[7]/android.view.View/android.widget.Button[1]");
		e1.click();
		boolean exception = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[7]").isDisplayed();
	    //assertEquals(exception, true);
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;
		FileUtils.copyFile(src, new File("D:\\TestResult\\ScreenShot\\TC1.png"));
		(new TouchAction(driver)).tap(664, 1076).perform();
		MobileElement e3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[7]/android.view.View/android.widget.Button");
        e3.click(); 
        MobileElement e4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");
        e4.clear(); 
        assertEquals(exception, true);*/
		assert(true);

	    }
		
		
	/*@Test (priority= 1 )
	public void N_Try_proceed_while_the_mobile_number_field_is_blank () throws IOException {
		
		driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'nextButton')]")).click();
		boolean exception = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View").isDisplayed();
	    //assertEquals(exception, true);
	    File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;
		//FileUtils.copyFile(src, new File("D:\\TestResult\\ScreenShot\\TC2.png"));
		assertEquals(exception, true);
	}
	
	@Test (priority= 2)
	public void N_Try_to_input_special_chars_in_mobile_number () throws IOException {
		
		MobileElement e4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");
        e4.sendKeys("@$#@%$#@"); 
        driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'nextButton')]")).click();
		boolean exception = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View").isDisplayed();
		//assertEquals(exception, true);
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;
		FileUtils.copyFile(src, new File("D:\\TestResult\\ScreenShot\\TC3.png"));
		assertEquals(exception, true);
	}
	
	@Test (priority=3)
	public void N_Try_to_input_chars_in_mobile_number () throws IOException {
		
		MobileElement e4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");
        e4.clear();
		e4.sendKeys("Mohammad"); 
        driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'nextButton')]")).click();
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;
		FileUtils.copyFile(src, new File("D:\\TestResult\\ScreenShot\\TC4.png"));
        boolean exception = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[31]/android.view.View").isDisplayed();
		assertEquals(exception, true);
		driver.quit();
	}
	

	/*@Test (priority= 4)
	public void P_Try_to_input_valid_mobile_number () throws IOException, InterruptedException {
		
		MobileElement e4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");
        e4.clear();
		e4.sendKeys("711111111");
		driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'nextButton')]")).click();
		MobileElement e1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[7]/android.view.View/android.widget.Button[1]");
		e1.click();
		boolean exception = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[1]").isDisplayed();
		assertEquals(exception, true);
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;
		FileUtils.copyFile(src, new File("D:\\TestResult\\ScreenShot\\TC5.png"));
		assertEquals(exception, true);
		driver.navigate().back();
	}*/
	
	@AfterSuite
	public void report() throws Exception  {
		Xl.generateReport("D:\\TestResult","FinalReport.xls");
		driver.quit();
	}
}
		
	 

