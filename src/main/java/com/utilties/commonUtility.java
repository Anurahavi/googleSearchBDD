package com.utilties;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class commonUtility {
	
	public Properties prop;
	public String projectpath =System.getProperty("user.dir");
	
	public String getproperty(String value) throws IOException {
		prop=new Properties(); 
	   	FileInputStream fis=new FileInputStream(projectpath+"\\src\\main\\java\\Properties\\data.properties");
		prop.load(fis);	
		return prop.getProperty(value);
		
	}
	
	
              
	
}
