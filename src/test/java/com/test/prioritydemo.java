package com.test;

import org.testng.annotations.Test;

public class prioritydemo {

	@Test(priority = 2)
	public void a() {
		System.out.println("This is test case a");
	}
	
    @Test(priority = 1)
	public void c() {
		System.out.println("This is test case c");
	}
 
     @Test(priority = 4)
	public void b() {
		System.out.println("This is test case b");
	}

     @Test(priority = 3)
	public void d() {
		System.out.println("This is test case d");
	}

}
