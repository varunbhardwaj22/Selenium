import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_intro {

	public static void main(String[] args)throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/varun/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		
		//implicit wait - t seconds time out
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmil.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();    //Selecting 2nd index with type text as multiple fields had type=text
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9878675432");       //example xpath 3
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());   //Example css selector 5  
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();  //Example of fusion of xpath 2,3,4
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
//		driver.findElement(By.tagName("p"));   tagname example
		
		
		//Locators
		//ID,Xpath,CSS selector,Class name,Tag name,link text,partial link text
		
		//	Css selectors- 
		//	1.class name->tagname.classname  eg-> Button.signInBtn
		//	2.id->tagname#id  eg->input#inputUsername
		//	3.Tagname[attribute='value']  eg->Input[placeholder='Username'] 
		//	4.Tagname[attribute='value']:nth-child(index) eg-"tbody td:nth-child(4)" identifying using index
		//	5.Parenttagname childtagname   - parent to child traversal
		//  6.input[type*='pass'] - regular expression
		//  7.tagname
		
		//	  XPath-
		//  1.//Tagname[@attribute='value']   eg- //input[@placeholder='Username']
		//  2.//Tagname[@attribute='value'][index] identifying using index
		//  3.//parentTagname/childTagname        - parent to child traversal
		//  4.//button[contains(@class,'submit')] - regular expression
		//  5.//tagname
		//  6.//header/div/button[1]/following-sibling::button[1]   - sibling traversal
		//  7.//header/div/button[1]/parent::div              - child to parent traversal   - (Not possible in css)
		
//		driver.quit();   
		
		Thread.sleep(2000);
		driver.quit(); 
	}

}
