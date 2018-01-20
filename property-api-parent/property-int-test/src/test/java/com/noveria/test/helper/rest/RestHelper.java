package com.noveria.test.helper.rest;

import com.noveria.test.runtime.RuntimeState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.fail;

@Component
public class RestHelper {

    @Autowired
    RuntimeState runtimeState;

    @Autowired
    RestTemplate restTemplate;

    @Value("${property.api.url}")
    String baseUrl;

    public void callGetProperty(String name) {
        String response = restTemplate.getForObject(baseUrl+"/property/"+name,String.class);
        runtimeState.setResponse(response);
    }

    public void callUpdateProperty(String name, String value) {
        fail("todo implement me!");
    }

    public void callCreateProperty(String name, String value) {
        fail("todo implement me!");
    }

    public void callDeleteProperty(String name) {
        fail("todo implement me!");
    }
}
