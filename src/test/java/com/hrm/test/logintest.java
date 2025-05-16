package com.hrm.test;

import java.io.IOException;

//import org.apache.logging.log4j.util.PropertiesUtil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.hrmpages.loginpage;
import com.utility.excelutility;
import com.utility.propertiesutility;

public class logintest extends basetest{

	@Test
	public void loginToApplication() throws InvalidFormatException, IOException {
		
		loginpage loginpage =new loginpage();
		
		//loginpage.loginToApplication(excelutility.getTestData(1, 0), excelutility.getTestData(1, 1));

		loginpage.loginToApplication(propertiesutility.getData("username"), propertiesutility.getData("password") );
		
		
	}
	
}
