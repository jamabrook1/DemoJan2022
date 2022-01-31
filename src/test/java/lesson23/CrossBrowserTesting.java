package lesson23;


import org.testng.annotations.Test;

import baseSetup.Base;

public class CrossBrowserTesting extends Base{

	

	

	@Test
	public void test() {
		driver.get(url);
	}
}
