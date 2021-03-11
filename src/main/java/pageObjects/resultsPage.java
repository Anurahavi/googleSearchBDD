package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.utilties.Testbase;

public class resultsPage extends Testbase {
	
	
public WebDriver driver;
	
	public resultsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[text()='Duck - Wikipedia']")
	WebElement results;
	
	public void results() {
		Assert.assertEquals(true, results.isDisplayed());
	}

}
