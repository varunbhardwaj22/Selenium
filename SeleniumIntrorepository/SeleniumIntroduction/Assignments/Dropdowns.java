import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/home/varun.bhardwaj@npci.org.in/Downloads/chromedriver_linux64/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.cleartrip.com/");

		// driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		// driver.findElement(By.cssSelector("a[value='AMD']"));
		// driver.findElement(By.cssSelector("li[class='city_selected ']
		// a[value='BLR']"));

//		driver.findElement(By.className("button[class='flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900']")).click();

	}

}
