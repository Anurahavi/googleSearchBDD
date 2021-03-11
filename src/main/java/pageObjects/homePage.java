package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilties.Testbase;

public class homePage extends Testbase{
	
public WebDriver driver;
	
	public homePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name="q")
	WebElement textBox;
	@FindBy(name="btnK")
	WebElement searchBtn;
	
	public void textBox() {
		browUtil.sendkeys(textBox, "ducks");
	}
	
	public void searBox() {
		browUtil.clickElement(searchBtn);
	}
	
	
}
