package RadioButtonOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonOps {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Data\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/radio-button");
		driver.manage().window().maximize();

		

		/**
		 * Find radio button using Xpath, Validate isDisplayed and click to select
		 */
		WebElement radioElem = driver.findElement(By.xpath("//div/input[@id='impressiveRadio']"));
		boolean sel = radioElem.isDisplayed();

		// performing click operation if element is displayed
		if (sel == true) {
			radioElem.click();
		}

		/**
		 * Find radio button using CSS Selector, Validate isEnabled and click to select
		 */
		WebElement radioNo = driver.findElement(By.cssSelector("input[id='noRadio']"));
		boolean selectNo = radioNo.isEnabled();

		// performing click operation if element is enabled
		if (selectNo == true) {
			radioNo.click();
		}
		
		driver.quit();
	}

}

//Notes :
//1. isDisplayed() is the method used to verify the presence of a web element within the web page. 
//	The method returns a “true” value if the specified web element is present on the web page and 
//  a “false” value if the web element is not present on the webpage.
//  The isDisplayed() is capable to check for the presence of all kinds of web elements available.
//2.isEnabled() is the method used to verify if the web element is enabled or disabled within the 
//	web page.The isEnabled() is primarily used with buttons.
//3.isSelected() is the method used to verify if the web element is selected or not. 
//  The isSelected() method is predominantly used with radio buttons, dropdowns and checkboxes.
