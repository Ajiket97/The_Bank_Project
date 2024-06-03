package com.BankPropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	String path;

	public PropertiesFile(String path) {

		this.path = path;
	}
	

	public String readPropertFile(String path, String key) throws IOException {
		FileInputStream file = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(file);
		String keyy = prop.getProperty(key);
		return keyy;

	}

	public String readPropertFile(String key) throws IOException {
		FileInputStream file = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(file);
		String keyy = prop.getProperty(key);
		return keyy;

	}
}
