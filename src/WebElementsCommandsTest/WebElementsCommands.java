package WebElementsCommandsTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {

	   public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "C:\\Data\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");		

		   WebDriver driver = new ChromeDriver();

		   driver.get("https://demoqa.com/text-box/");
			
		   // Find elements using tag name
		   List<WebElement> allInputElements = driver.findElements(By.tagName("input"));
			
		   if(allInputElements.size() != 0) 
		   {
			   System.out.println(allInputElements.size() + " Elements found by TagName as input \n");
				
			   for(WebElement inputElement : allInputElements) 
			   {
				   System.out.println(inputElement.getAttribute("placeholder"));
			   }
		   }
	   }
}

/*o/p:

<input autocomplete="off" placeholder="Full Name" type="text" id="userName" class=" mr-sm-2 form-control">
<input autocomplete="off" placeholder="name@example.com" type="email" id="userEmail" class="mr-sm-2 form-control">

2 Elements found by TagName as input 
Full Name
name@example.com

*/