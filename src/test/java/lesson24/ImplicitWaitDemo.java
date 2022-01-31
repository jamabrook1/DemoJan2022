package lesson24;

import java.time.Duration;

import org.testng.annotations.Test;

import baseSetup.Base;

public class ImplicitWaitDemo extends Base{
	
	@Test
	public void testImplicitWait() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// whatever code comes after this your test cases will implement it and usually above method 
		// we have to put in base because we want throughout our whole test case so it is global 
		
	}

}
