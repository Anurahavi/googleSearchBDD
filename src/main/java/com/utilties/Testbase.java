package com.utilties;


import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.utilties.browserUtility;
import com.utilties.commonUtility;

public class Testbase {
	
	public WebDriver driver;
	public Properties prop;
	public String projectpath =System.getProperty("user.dir");
	public browserUtility browUtil= new browserUtility();
	public commonUtility comUtil=new commonUtility();
	
	
	public WebDriver launchUrl() throws IOException {
		driver=browUtil.initializeDriver(comUtil.getproperty("browser"));
		driver.get(comUtil.getproperty("url"));
		return driver;
		
		
	}

	

}
