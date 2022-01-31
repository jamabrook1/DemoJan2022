package lesson24;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseSetup.Base;

public class HardAsserDemo extends Base {
	
	
	
	@Test
	public void testHardAssert() {
		driver.get("https://demostore.x-cart.com/");
		WebElement searchBox = driver.findElement(By.xpath("//div[@id='search']/div"));
		Assert.assertNotNull(searchBox);
		
		String actualtext = driver.findElement(By.xpath("//div[@class='category-description']/h1")).getText();
		String expectedText = "Welcome to X-Cart Store!";
		Assert.assertEquals(actualtext, expectedText);
		// this is hardAssert for any reason if I have more tests below in wont run because hardAssert stops code
		// hardAssert has static method but for soft you need create an object
		driver.findElement(By.cssSelector("span[class='country-indicator']")).click();
		driver.findElement(By.xpath("//div[@class='header_bar-locale dropdown open']//button/span")).click();
		driver.findElement(By.xpath("//div[@class='header_bar-sign_in']/button/span")).click();
	}

}
