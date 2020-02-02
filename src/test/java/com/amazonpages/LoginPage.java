package com.amazonpages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.libglobal.LibGlobal;

public class LoginPage extends LibGlobal {

	public LoginPage() {
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	private List<WebElement> searchField;
	
	public List<WebElement> getSearchField() {
		return searchField;
	}

	public List<WebElement> getSearchBtn() {
		return searchBtn;
	}

	@FindBy(className="nav-input")
	private List<WebElement> searchBtn;
}
