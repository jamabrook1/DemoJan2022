package lesson24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseSetup.Base;

public class SoftAssertDemo extends Base {
	
	
	@Test
	public void testSoftAssert() { // for softAssert we need to create an object
		
		SoftAssert softAssert = new SoftAssert(); // soft assert object has to be create for each test
		
		
		driver.get("https://demostore.x-cart.com/");
		WebElement searchBox = driver.findElement(By.xpath("//div[@id='search']/div"));
		softAssert.assertNotNull(searchBox);
		
		String actualtext = driver.findElement(By.xpath("//div[@class='category-description']/h1")).getText();
		String expectedText = "Welcome to X-Cart Store!";
		softAssert.assertEquals(actualtext, expectedText);
		
		
		driver.findElement(By.cssSelector("span[class='country-indicator']")).click();
		driver.findElement(By.xpath("//div[@class='header_bar-locale dropdown open']//button/span")).click();
		driver.findElement(By.xpath("//div[@class='header_bar-sign_in']/button/span")).click();
		// (need to find it)driver.findElement(By.xpath("//div[@class='block block-block']//li//a/span")).click();
		
		// whenever we do softAssert at the end we need one more assert to summarize everything
		softAssert.assertAll(); // this method check the list of results and validate them all 
	}


}
