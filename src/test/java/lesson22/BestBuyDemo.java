package lesson22;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BestBuyDemo {
	private String practiceUrl = "https://www.bestbuy.com/";
	private WebDriver driver;
	private BestBuyPage bestBuyPage;
	
	
	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		bestBuyPage  = new BestBuyPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		
		//System.out.println(alert.getText());
		//try {
		//	Thread.sleep(3000);
		//} catch (Exception e) {
		//	e.printStackTrace();
		//}
		//alert.dismiss();
		
				
		}
	@Test
	public void BestBuyMenu() throws InterruptedException {
	driver.get(practiceUrl);
	bestBuyPage.SelectBestBuyUsLink();
	//Thread.sleep(2000);
	
	
	
	//bestBuyPage.swithcToAlert();
	//Alert alert = driver.switchTo().alert();
	//alert.sendKeys("jamabrook1@gmail.com");
	//driver.switchTo().alert().dismiss();
	
	//bestBuyPage.swithcToAlert();
	//driver.switchTo().alert();
	//Alert alert =driver.switchTo().alert();
	//alert.dismiss();
	
	bestBuyPage.closeMarAdd();	
	bestBuyPage.clickMenuNavigatBtn();
	bestBuyPage.clickMenuDropDown();
	bestBuyPage.selectBrandsApple();
	//driver.navigate().refresh();
	bestBuyPage.clickSameDayDel();
	//driver.navigate().refresh();
	bestBuyPage.insertZipCode(11223);
	bestBuyPage.clickSubmitZipCode();
	bestBuyPage.clickShopBestBuy();
	bestBuyPage.clickAppleIcon();
	bestBuyPage.clickSaveUpToIphone13Pro();
	
		
		
		
				
		


	
	}
	
}
