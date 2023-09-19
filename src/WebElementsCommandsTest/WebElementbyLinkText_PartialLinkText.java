package WebElementsCommandsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementbyLinkText_PartialLinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Data\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		WebElement element = driver.findElement (By.linkText("Home"));
		
		if(element != null) {
			System.out.println("Element found by LinkText");
		}
		System.out.println(element.getText());
		element= driver.findElement (By.partialLinkText("Bad"));
		System.out.println(element.getText());
		
		if(element!= null) {
			System.out.println("Element found by PartialLinkText");
		}
	}
}
/*
Element found by LinkText
Home
Bad Request
Element found by PartialLinkText
*/