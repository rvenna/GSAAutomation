package gov.gsa.managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {
	
	public static WebDriver getDriver(){
		String browserType = FileReaderManager.getInstance().getConfigFileReader().getBrowser();
		WebDriver driver;
		
		switch(browserType){
		   case "chrome":
			   System.setProperty("webdriver.chrome.driver",
						"src/main/resources/browser_exe/chrome/chromedriver.exe");
			   driver = new ChromeDriver();
			   break;
		   case "firefox":
			   driver = new FirefoxDriver();
			   break;
		   default:
			   driver = new ChromeDriver();
			   break;
		}
			   
		if(FileReaderManager.getInstance().getConfigFileReader().isWindowMaximize()) driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait(), TimeUnit.SECONDS);
		
		return driver;
		
		
		
	}

}
