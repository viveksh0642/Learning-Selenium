package com.test;

import org.testng.annotations.Test;

public class groupdemo {

	@Test(groups = {"login", "sanity"})
	public void login_1() {

		System.out.println("Login1");
	}

	@Test(groups = "login")
	public void login_2() {

		System.out.println("Login2");

	}

	@Test(groups = "reset")
	public void resetPassword_1() {

		System.out.println("resetPassword1");

	}

	@Test(groups = {"reset", "sanity"})
	public void resetPassword_2() {

		System.out.println("resetPassword2");
	}
}
