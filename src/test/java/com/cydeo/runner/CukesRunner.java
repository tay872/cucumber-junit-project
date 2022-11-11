package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions                     //This option is giving everything from the cucumber

        (
               plugin = {"pretty",
                       "json:target/cucumber.json",
                       "html:target/cucumber-report.html",
                       "rerun:target/rerun.txt" ,
                       "me.jvt.cucumber.report.PrettyReports:target/cucumber"//we will create rerun under target folder and name it rerun.txt
               },
                features = "src/test/resources/features",//features/googleSearch.feature
                glue = "com/cydeo/step_definitions", // glue is mean the implementation of
                //step_definition folder
                dryRun = false, // To check if anything unimplemented in the project
                //default is already false
               // tags = "@smoke" ,  //Help us to know which annotation we need to run by giving tags name ex: @smoke @regression
                publish = true

        )
public class CukesRunner {



}
