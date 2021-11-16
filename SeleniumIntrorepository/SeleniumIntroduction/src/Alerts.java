import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Alerts {

public static void main(String[] args) {

String text="Rahul";

System.setProperty("webdriver.chrome.driver", "/home/varun.bhardwaj@npci.org.in/Downloads/chromedriver_linux64/chromedriver");

WebDriver driver = new ChromeDriver();

driver.get("https://rahulshettyacademy.com/AutomationPractice/");

driver.findElement(By.id("name")).sendKeys(text);

driver.findElement(By.cssSelector("[id='alertbtn']")).click();

System.out.println(driver.switchTo().alert().getText());

driver.switchTo().alert().accept();

driver.findElement(By.id("confirmbtn")).click();

System.out.println(driver.switchTo().alert().getText());



driver.switchTo().alert().dismiss();

}

}