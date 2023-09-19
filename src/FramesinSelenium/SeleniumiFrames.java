package FramesinSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumiFrames {

	public static void main(String[] args) throws Exception {

        /*DesiredCapabilities cap = DesiredCapabilities.firefox();
        cap.setCapability("marionette", true);
        cap.setCapability("browser", "firefox");
        cap.setCapability("platform", "win10");
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		String exePath = "C:\\Data\\Selenium\\Softwares\\geckodriver-v0.29.1-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath); 	
        //Creating instance of FirefoxDriver	
	    WebDriver driver = new FirefoxDriver();*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Data\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//launch chrome browser

		driver.manage().window().maximize(); //maximize the windows
		driver.manage().deleteAllCookies(); // delete all the cookies
		//dynamic wait		

	    driver.get("http://demo.guru99.com/test/guru99home/");  
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    int size = driver.findElements(By.tagName("iframe")).size();
	    System.out.println(size);
		for(int i=0; i<size; i++){
		    driver.switchTo().frame(i);
		    int total=driver.findElements(By.xpath("html/body/a/img")).size();
			System.out.println(total);
		    driver.switchTo().defaultContent(); //switching back from the iframe
		 }
	    
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='module-surround']/iframe")));
		driver.switchTo().defaultContent();
		//Commented the code for finding the index of the element
	    driver.switchTo().frame(1); //Switching to the frame
		System.out.println("********We are switched to the iframe*******");
		driver.findElement(By.xpath("html/body/a/img")).click();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//Clicking the element in line with Advertisement
	    System.out.println("*********We are done***************");

	    driver.quit();
	   }

}
