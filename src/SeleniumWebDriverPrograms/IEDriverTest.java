package SeleniumWebDriverPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IEDriverTest {

	    public static void main(String[] args){
	 
	        System.out.println("IE Driver execution on Windows!!");
	        System.setProperty("webdriver.ie.driver", "C:\\Data\\Selenium\\Softwares\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
	        WebDriver driver=new InternetExplorerDriver();  
	      	driver.get("https://google.com");
	        Capabilities c = ((RemoteWebDriver) driver).getCapabilities();
	        // get the browser name, version and platform with Capabilities object and 
	        // getCapability() method
	        System.out.println("Current browser Name is : " +c.getBrowserName());
	        System.out.println("Current browser Version is : " +c.getVersion());
	        System.out.println("Current platform is : " +c.getPlatform().toString());
	        driver.quit();

	}

}

//Note for some challenges faced in running Selenium tests on Internet Explorer:
//How to set the Protected Mode settings in IE Browser
//1) Go to Tools > Internet Options and Under Internet Options click on the Security tab.

//2) Click on the Internet zone to Select a zone and to view its Protected Mode property.

//3) Now check the Enable Protected Mode check-box. 
//Whichever one you choose, needs to be set for all the other zones. 
//This means either it can be OFF for all the zones or ON for all the zones.
//Repeat this task for all the zones
//Internet
//Local Intranet
//Trusted Sites
//Restricted Sites

//5) Click OK and run the Selenium script again. It will work this time.


