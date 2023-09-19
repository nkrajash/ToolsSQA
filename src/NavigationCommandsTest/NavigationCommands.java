package NavigationCommandsTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {

	public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Data\\Selenium\\Softwares\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();


		driver.manage().window().maximize();
		// Open ToolsQA web site
		String appUrl = "https://www.DemoQA.com";
		//Difference between get() and navigate().to() 
		//navigate().to() is used to launch external URL.
		//get() is used to launch the current URL.
		driver.get(appUrl);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Click on Registration link
		driver.findElement(By.xpath(".//div[@class='home-banner']/a")).click();

		// Go back to Home Page
		driver.navigate().back();

		// Go forward to Registration page
		driver.navigate().forward();
		
		// Go back to Home page 
		
		driver.navigate().to(appUrl);

		// Refresh browser
		driver.navigate().refresh();
		
		// Close browser
		driver.close();
	}

}
