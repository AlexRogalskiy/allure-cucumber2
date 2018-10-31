package ru.allure.test;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty"},
        glue = {"ru.allure.test.stepdefs"},
        features = {"src/test/resources/features/"}
)
public class CucumberTest {}
