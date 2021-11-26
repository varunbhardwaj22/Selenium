package Advanced;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Ssl {

public static void main(String[] args) {

//Desired capabilities=
//general chrome profile
//DesiredCapabilities ch = DesiredCapabilities.chrome();  //Old module
ChromeOptions ch = new ChromeOptions();
//ch.acceptInsecureCerts();
ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

//Belows to your local browser
ChromeOptions c= new ChromeOptions();
c.merge(ch);
System.setProperty("webdriver.chrome.driver",
		"/home/varun/Downloads/chromedriver_linux64/chromedriver");
WebDriver driver=new ChromeDriver(c);




}

}
