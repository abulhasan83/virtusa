package com.stepdefinition;

import java.io.IOException;

import com.amazonpages.PageObjects;
import com.libglobal.LibGlobal;

import io.cucumber.java.en.*;

public class LogStepDef extends LibGlobal {
    public static PageObjects page =  new PageObjects();
@Given("User enters the product in the search field")
public void user_enters_the_product_in_the_search_field() throws IOException, InterruptedException {
     Thread.sleep(10000);
	typeText(page.getLoginPage().getSearchField().get(0), getData(0,0));
    
}

@When("User clicks the search button")
public void user_clicks_the_search_button() {
   clkBtn(page.getLoginPage().getSearchBtn().get(0));
   
}

@When("User navigate to product listing")
public void user_navigate_to_product_listing() {
   
}

@Then("User should seen the desired product list")
public void user_should_seen_the_desired_product_list() {
   
}


}
