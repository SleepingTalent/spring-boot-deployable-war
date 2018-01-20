package com.noveria.test.steps;

import com.noveria.test.runtime.RuntimeState;
import cucumber.api.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

import static junit.framework.TestCase.fail;

public class DataStep extends AbstractStep {

    private Logger logger = LoggerFactory.getLogger(DataStep.class);


    @Autowired
    RuntimeState runtimeState;

    @Given("^property \"(.*?)\" and \"(.*?)\" exist$")
    public void create_property(String name, String value) throws Throwable {
        logger.warn("Need to Implement DataSetUp!!");
    }

    @Given("^property \"(.*?)\" does not exist$")
    public void check_property_does_not_exist(String name) throws Throwable {
        logger.warn("Need to Implement Data Assertion!!");
    }



}

