package com.Testrunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@Test
@CucumberOptions(features = "src/test/resources/DDT.feature",glue = "src/main/java/com/Stepdefinatuion/StepDefinationTwo.java",dryRun = false)
public class TestRunner extends AbstractTestNGCucumberTests {

}
