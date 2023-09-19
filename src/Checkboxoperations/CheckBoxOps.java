package Checkboxoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxOps {

		public static void main(String[] args) {

			String exePath = "C:\\Data\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.demoqa.com/automation-practice-form");
			driver.manage().window().maximize();

			/**
			 * Validate isSelected and click
			 */

			//By.xpath
			WebElement checkBoxSelected1 = driver.findElement(By.xpath("//label[text()='Sports']"));
			boolean isSelected1 = checkBoxSelected1.isSelected();			
			// performing click operation if element is not selected 
			if(isSelected1 == false) {
				checkBoxSelected1.click();
			}
			checkBoxSelected1.click();
			
			
			//By.cssSelector
			WebElement checkBoxSelected2 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
			boolean isSelected2 = checkBoxSelected2.isSelected();			
			// performing click operation if element is not selected 
			if(isSelected2 == false) {
				checkBoxSelected2.click();
			}
			checkBoxSelected2.click();
			
			/**
			 * Validate isDisplayed and click
			 */
			WebElement checkBoxDisplayed = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
			boolean isDisplayed = checkBoxDisplayed.isDisplayed();

			// performing click operation if element is displayed
			if (isDisplayed == true) {
				checkBoxDisplayed.click();
			}
			
			/**
			 * Validate isEnabled and click
			 */
			WebElement checkBoxEnabled = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
			boolean isEnabled = checkBoxEnabled.isEnabled();

			// performing click operation if element is enabled
			if (isEnabled == true) {
				checkBoxEnabled.click();
			}
			
			driver.quit();
		}

}
