package com.hrm.test;

import org.testng.annotations.Test;

import com.hrmpages.HOMEPAGE;

public class homepagetest extends basetest{
	
	@Test
	public void logout() {
		
		HOMEPAGE homepage = new HOMEPAGE();
		homepage.Logout();
	}

}
