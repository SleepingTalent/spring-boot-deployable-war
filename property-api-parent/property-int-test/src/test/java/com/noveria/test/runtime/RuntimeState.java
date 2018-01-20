package com.noveria.test.runtime;

import cucumber.api.Scenario;
import org.springframework.stereotype.Component;

@Component
public class RuntimeState {

    private Scenario scenario;
    private String host;
    private String response;

    public Scenario getScenario() {
        return scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void initialise() {
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }
}
