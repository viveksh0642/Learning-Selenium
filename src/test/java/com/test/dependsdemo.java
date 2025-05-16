package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsdemo {
	
	@Test
	public void applyleave() {
		Assert.assertEquals(true, true);
		System.out.println("Leave is Applied");
		
	}

	@Test(dependsOnMethods = "applyleave")
	public void approveleave() { 
		System.out.println("Leave is approved");
		
	}
	
}
