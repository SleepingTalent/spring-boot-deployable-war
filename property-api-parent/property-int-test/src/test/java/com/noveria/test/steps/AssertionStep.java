package com.noveria.test.steps;


import com.noveria.test.runtime.RuntimeState;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class AssertionStep extends AbstractStep {

    @Autowired
    RuntimeState runtimeState;

    @Then("^\"(.*?)\" is returned$")
    public void assert_response_message(String message) throws Throwable {
        assertEquals(message,runtimeState.getResponse());
    }

}
