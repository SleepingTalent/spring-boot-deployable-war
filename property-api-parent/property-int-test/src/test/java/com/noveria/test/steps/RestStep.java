package com.noveria.test.steps;


import com.noveria.test.helper.rest.RestHelper;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class RestStep extends AbstractStep {

    @Autowired
    RestHelper restHelper;

    @When("^get property is called with \"(.*?)\"$")
    public void getPropertyIsCalledWith(String name) throws Throwable {
        restHelper.callGetProperty(name);
    }

    @When("^delete property is called with \"(.*?)\"$")
    public void deletePropertyIsCalledWith(String name) throws Throwable {
        restHelper.callDeleteProperty(name);
    }

    @When("^update property is called with \"(.*?)\" and \"(.*?)\"$")
    public void updatePropertyIsCalledWith(String name, String value) throws Throwable {
        restHelper.callUpdateProperty(name,value);
    }

    @When("^create property is called with \"(.*?)\" and \"(.*?)\"$")
    public void createPropertyIsCalledWith(String name, String value) throws Throwable {
        restHelper.callCreateProperty(name,value);
    }
}
