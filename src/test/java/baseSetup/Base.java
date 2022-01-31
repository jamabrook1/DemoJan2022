package baseSetup;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	
	protected WebDriver driver = null;  //protected only inside the same package and with extends out or inside the class 
	private String browser = "chrome";
	protected String url = null;
	
	@BeforeClass
	public void initilizeVariables() throws IOException { // if we dont use try catch we have to add throws declaration
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("app.properties");
		prop.load(fis);
		browser = prop.getProperty("browser");
		url = prop.getProperty("url");
	}

	@BeforeMethod
	public void setup() {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else {
			System.setProperty("webdriver.ie.driver", "C:\\webdrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}
}
