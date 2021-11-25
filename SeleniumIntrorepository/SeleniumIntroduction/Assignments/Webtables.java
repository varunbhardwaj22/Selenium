import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

		public static void main(String arsg[])
		{
			System.setProperty("webdriver.chrome.driver",
					"/home/varun/Downloads/chromedriver_linux64/chromedriver");
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("http://qaclickacademy.com/practice.php");
			WebElement table = driver.findElement(By.xpath("//div[@class='block large-row-spacer'][3]/div[@class='left-align']/fieldset/table[@id='product']/tbody"));
			int rows = table.findElements(By.xpath("//tr")).size();
			int columns =  table.findElements(By.xpath("//tr[1]/th")).size();
			System.out.println("Rows:"+ rows);
			System.out.println("Columns:"+ columns);
			String text = table.findElement(By.xpath("//tr[3]/td[1]")).getText() +" "+ table.findElement(By.xpath("//tr[3]/td[2]")).getText() +" "+ table.findElement(By.xpath("//tr[3]/td[3]")).getText();
			System.out.println("Second Row text is: "+ text);
 
		}
}