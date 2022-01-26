package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {
	
	public static String getConfig(String value) throws IOException{
		
		File file = new File("./config.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties pro = new Properties();
		pro.load(fis);
		
//		System.out.println(pro.get(value));
		
		return pro.get(value).toString();
		
	
	}

}
