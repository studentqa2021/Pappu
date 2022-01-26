package com.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;
import com.util.HighLighter;

public class BaseLogin {
	
	public void getLogin() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(BaseConfig.getConfig("URL"));
		driver.manage().window().maximize();
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
	
		HighLighter.getColor(driver, mpf.getUsername());
		mpf.getUsername().sendKeys(BaseConfig.getConfig("USER"));
		HighLighter.getColor(driver, mpf.getPassword());
		mpf.getPassword().sendKeys(BaseConfig.getConfig("PASS"));
		mpf.getLogin().click();
		
	}


}
