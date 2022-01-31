package lesson22;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectsLibrary.LetsCodeItPage;

public class POM_Demo1 {
	
	private String url="https://courses.letskodeit.com/practice";
	private WebDriver driver;
	private LetsCodeItPage letsCodeItPage;
		
	
	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		letsCodeItPage= new LetsCodeItPage(driver);
	}

	@Test
	public void testPOM() {
		LetsCodeItPage letsCodeItPage= new LetsCodeItPage(driver);
		driver.get(url);
		
		//driver.findElement(By.id("bmwradio")).click(); we use above method to call it
		letsCodeItPage.clickBmwRadBtn();
		
		letsCodeItPage.clickOpenWinBtn();
		
		letsCodeItPage.insertNameIntoBox(url);
			
		
	}
	@Test
	public void testPageFactory() {
		LetsCodeItPageFactory letsCodeItPageFactory = new LetsCodeItPageFactory(driver);
		
		driver.get(url);
		letsCodeItPageFactory.clickBmwRadBtn();
	}
	
	
	}
