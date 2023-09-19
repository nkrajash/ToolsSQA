package WebElementsCommandsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementbyId {
	
	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Data\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");		
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://demoqa.com/text-box/");
	        WebElement element = driver.findElement(By.id("submit"));
			

		if(element != null) {
		    System.out.println("Element found by ID");
		}

	}

}
