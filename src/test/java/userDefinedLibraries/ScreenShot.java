package userDefinedLibraries;



import java.io.File;
import java.io.IOException;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class ScreenShot {
	
	WebDriver driver;
	
	public ScreenShot() {}
	
	public ScreenShot(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public static String filepath = System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshot\\";
	
	public  void screenShotTC(WebDriver scdriver,String fileName){
		
		File src=((TakesScreenshot)scdriver).getScreenshotAs(OutputType.FILE);       
		try
		{  // now copy the  screenshot to desired location using copyFile method
			FileUtils.copyFile(src, new File(filepath+fileName+".png"));
			
        }catch (IOException e)      
			{
        		System.out.println(e.getMessage());      
			}
	  }

}

