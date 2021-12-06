import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Need to add this dependency for using FileUtils 
//<dependency>
//<groupId>org.apache.directory.studio</groupId>
//<artifactId>org.apache.commons.io</artifactId>
//<version>2.4</version>
//</dependency>
public class CookiesAndScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/home/varun/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("session");  //To delete a particular cookie
		driver.get("https://www.google.co.in/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("/home/varun/Desktop/SeleniumScreenshot.png"));
		
	}

}
