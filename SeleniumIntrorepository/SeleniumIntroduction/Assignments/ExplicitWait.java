import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/home/varun/Downloads/chromedriver_linux64/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
		WebDriverWait w = new WebDriverWait(driver, 5);
		String text = w.until(ExpectedConditions.visibilityOfElementLocated(By.id("results"))).getText();
		System.out.println(text);
	}

}
