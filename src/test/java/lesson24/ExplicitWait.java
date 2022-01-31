package lesson24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseSetup.Base;

public class ExplicitWait extends Base {
	
	@Test
	public void testExplicitWait() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("");
		
		//Opens  a new page (takes 10 seconds to load) 
		driver.findElement(By.id(url)).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("")));
		
		// Continue your testing now because it get loaded
		driver.findElement(By.id("")).click();
		
		
		// every class extends by default from object class unless we use extends keyWord 
		
	}

}
