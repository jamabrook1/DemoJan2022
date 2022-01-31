package lesson22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LetsCodeItPageFactory {
	
	private WebDriver driver;
	
	
	//Locators
	@FindBy (id = "bmwradio")
	WebElement bmwRadBtn;
	
	
	//Constructor
	public LetsCodeItPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void clickBmwRadBtn() {
		bmwRadBtn.click();
	}
	

}
