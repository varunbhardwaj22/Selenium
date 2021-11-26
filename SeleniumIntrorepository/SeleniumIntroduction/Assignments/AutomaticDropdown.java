
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomaticDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/home/varun/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://qaclickacademy.com/practice.php");

		driver.findElement(By.id("autocomplete")).sendKeys("ind");

		Thread.sleep(2000);

		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));

	}

}