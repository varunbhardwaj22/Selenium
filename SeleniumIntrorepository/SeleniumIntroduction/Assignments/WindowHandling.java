import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"/home/varun/Downloads/chromedriver_linux64/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText()); //1st page 2nd window
		driver.findElement(By.linkText("Click Here")).click();     //1st page second window
		
		Set<String> windows = driver.getWindowHandles(); 

		Iterator<String>it = windows.iterator();

		String Page1 = it.next();

		String Page2 = it.next();
		
		driver.switchTo().window(Page2);
		
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());  //2nd page
		
	}

}
