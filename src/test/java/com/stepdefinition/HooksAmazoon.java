package com.stepdefinition;

import com.libglobal.LibGlobal;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksAmazoon extends LibGlobal {

@Before
public void launchBrowser() {
	launch();
	loadUrl("https://www.amazon.in/");
}

@After
public void close() {
	dr.close();
}


}
