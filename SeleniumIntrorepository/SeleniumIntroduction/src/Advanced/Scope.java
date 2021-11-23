package Advanced;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "/home/varun/Downloads/chromedriver_linux64/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php/");

		// Count of links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footdriver = driver.findElement(By.id("gf-BIG")); // Limiting web driver scope

		// Count of links in the footer section
		System.out.println(footdriver.findElements(By.tagName("a")).size());

		WebElement columndriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); // Limiting scope

		// Count of links in the first column in footer section
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		// Click on each link of the column and check if they are working
		String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);

		// Open all the tabs
		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
		}

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
