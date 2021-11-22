import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/varun/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Actions a = new Actions(driver);
		
		//hover over element
		WebElement move = driver.findElement(By.className("gb_Nc"));   
		
		//pressing keys on keyboard
		a.moveToElement(driver.findElement(By.cssSelector("input[title='Search']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//mouse right click
		a.moveToElement(move).contextClick().build().perform();  
		
	}

}
