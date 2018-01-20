package com.noveria.test.steps;

import com.noveria.test.runtime.RuntimeState;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class BeforeAfterSteps extends AbstractStep{

    @Autowired
    RuntimeState runtimeState;

    @Autowired
    RestTemplate restTemplate;

    @Before
    public void setUp(Scenario scenario) throws InterruptedException {
        runtimeState.initialise();
        runtimeState.setScenario(scenario);
    }

    @After
    public void tearDown(Scenario scenario) {

    }
}

