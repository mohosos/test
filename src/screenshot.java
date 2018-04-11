import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.jfree.io.FileUtilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File ;


public class screenshot extends TestListenerAdapter  {

	public void onTestFailure(ITestResult tr) {

		File src= ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.FILE) ;
		try {
			FileUtils.copyFile(src, new File("D:\\SDK\\Screen.png"+tr.getName()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   

	}
	
	
}
