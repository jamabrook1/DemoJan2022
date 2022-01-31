package pageObjectsLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import lesson22.LetsCodeItPageFactory;

public class LetsCodeItPage {
	
	private WebDriver driver;

	//Locators
	By bmwRadBtn = By.id("bmwradio");
	By openWinBtn = By.id("openwindow");
	By searchBox = By.id("name");
	// you can add other object locators here 
	
	// then we need to create Constructor
	public LetsCodeItPage (WebDriver driver) {
		this.driver = driver;
	}
	
	//Actions:
	public void clickBmwRadBtn() {
		driver.findElement(bmwRadBtn).click();
	}
	public void clickOpenWinBtn() {
		driver.findElement(openWinBtn).click();
		
	}
	public void insertNameIntoBox (String myName) {
		driver.findElement(searchBox).sendKeys("max");
	}
	
	
}

