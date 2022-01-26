package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLighter {
	
	public static void getColor(WebDriver driver, WebElement element) {
		
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", element);
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid green'", element);

			
	}

}