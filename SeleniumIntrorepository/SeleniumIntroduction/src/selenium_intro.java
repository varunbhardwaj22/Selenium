//Ctrl+shift+F - Formatting code

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_intro {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * WebDriver is an interface which provides set of browser automation methods
		 * with empty bodies WebDriver driver = new ChromeDriver(); driver object has
		 * access to methods of chrome driver
		 * 
		 * WebDriver driver = new ChromeDriver(); driver object has access to methods of
		 * chrome driver which are defined in web driver interface
		 *
		 * chromedriver.exe-> chrome browser webdriver.chrome.driver-> value of path
		 */

		// Firefox Launch
		// System.setProperty("webdriver.gecko.driver",
		// "/home/varun/Downloads/geckodriver_linux64/geckodriver");
		// WebDriver driver = new FirefoxDriver();

		// Chrome launch
		System.setProperty("webdriver.chrome.driver",
				"/home/varun/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.cssSelector(".form-control.medantory.hasDatepicker")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[2]/a")).click();

		// System.out.println(driver.getTitle());
		// driver.close(); //closes current window
		// driver.quit(); //closes all associated windows

	}

}
