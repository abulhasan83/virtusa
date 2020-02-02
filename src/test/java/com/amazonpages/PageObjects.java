package com.amazonpages;

public class PageObjects {
	private LoginPage loginPage;

	public LoginPage getLoginPage() {
		return (loginPage==null)?loginPage=new LoginPage():loginPage;
	}
	

}
