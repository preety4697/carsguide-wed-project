package com.car.guide.practice.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features" ,
        glue = "com/car/guide/practice/steps" ,
        plugin = {"html:target/cucumber-reports/cucumber.html" ,
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = ""
)
public class RunCukeTest extends AbstractTestNGCucumberTests {
}
