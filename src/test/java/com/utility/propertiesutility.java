package com.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propertiesutility {
	
	public  static String getData(String key) throws IOException {
		
		//Create file class object 
		
		File file = new File("C:\\Users\\Vivek Sharma\\Documents\\TestData.properties");
		
		// Create file reader class object 
		FileReader reader = new FileReader(file);
		
		// Properties class object
		
		Properties prop = new Properties();
		
		// Load Properties File
		
		prop.load(reader);
		
		// Call get value method of properties class
		
		return (String) prop.get(key);
		
	}

}
