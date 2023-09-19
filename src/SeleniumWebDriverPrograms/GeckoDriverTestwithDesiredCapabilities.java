package SeleniumWebDriverPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GeckoDriverTestwithDesiredCapabilities {

	public static void main(String[] args) throws InterruptedException {

        System.out.println("Execution started-- Opening Firefox browser.");
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        cap.setCapability("marionette", true);
        cap.setCapability("browser", "firefox");
        cap.setCapability("platform", "win10");
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        System.setProperty("webdriver.gecko.driver", "C:\\Data\\Selenium\\Softwares\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/");
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Execution ending-- Webdriver session is closed.");

	}

}
