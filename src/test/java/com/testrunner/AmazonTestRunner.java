package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},glue = {"com.stepdefinition"},dryRun=false,strict=true,monochrome=true,plugin= {"pretty","json:src\\test\\resources\\Reports\\Amazon.json"})
public class AmazonTestRunner {

}
