package WebElementsCommandsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementbyClassname {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Data\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");		

			WebDriver driver = new ChromeDriver();

			driver.get("https://demoqa.com/automation-practice-form/");
			
			WebElement parentElement = driver.findElement(By.className("btn btn-primary"));
			//List<WebElement> webList = driver.findElements(By.className("button")) ;
			
			if(parentElement != null) {
				System.out.println("Element found by ClassName");
			}
			
		}
}
