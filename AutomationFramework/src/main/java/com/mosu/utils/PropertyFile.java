package com.mosu.utils;

import java.io.FileInputStream;
import java.util.Properties;

public final class PropertyFile {
	
	private PropertyFile() {
		
	}
	
	public static String getValue(String key) throws Exception {
		String value="";
		Properties property= new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");
		property.load(file);
		value = property.getProperty(key);
		if(value==null) {
			throw new Exception("The property name" +key+ " is not found. Please check config.properties");
		}
		return value;
	}

	
}
