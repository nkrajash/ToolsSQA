package WebDriverCommandsTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands_2 {

		public static void main(String[] args) {
	
			String driverExecutablePath = "C:\\Data\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverExecutablePath);
			// Create a new instance of the FireFox driver 
			WebDriver driver = new ChromeDriver(); 
			
			// Storing the Application Url in the String variable 
			String url = "https://demoqa.com/browser-windows/"; 

			//Putting implicit wait
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			//Launch the ToolsQA WebSite 
			driver.get(url); 
			
			WebElement element = driver.findElement(By.xpath("//button[@id = 'windowButton']"));
			Boolean display= element.isDisplayed();
			System.out.println(display);
			
			driver.quit();
		}

}
