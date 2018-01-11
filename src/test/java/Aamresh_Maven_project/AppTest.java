package Aamresh_Maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AppTest {
	@Test
	public void OpenBrowser(){
		System.setProperty("webdriver.firefox.marionette", "D://selenium//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ksrtc.in/oprs-web/");
	}
	
}
   