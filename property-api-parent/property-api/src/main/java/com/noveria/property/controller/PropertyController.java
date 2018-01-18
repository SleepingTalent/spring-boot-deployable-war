package com.noveria.property.controller;

import com.noveria.property.model.domain.Property;
import com.noveria.property.service.PropertyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class PropertyController {

    private Logger logger = LoggerFactory.getLogger(PropertyController.class);

    @Autowired
    PropertyService propertyService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getPropertyValue(@PathVariable String name) {
        logger.info("getPropertyValue() invoked");
        Property property = propertyService.findByName(name);
        logger.info("getPropertyValue() found: {}",property);

        return property.getValue();
    }
    @RequestMapping(value = "/{name}/{value}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void createProperty(@PathVariable String name, @PathVariable String value) {
        logger.info("createProperty({}:{}) invoked",name,value);
        propertyService.createProperty(name,value);
    }

    @RequestMapping(value = "/{name}/{value}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void updateProperty(@PathVariable String name, @PathVariable String value) {
        logger.info("updateProperty({}:{}) invoked",name,value);
        propertyService.updateProperty(name,value);
    }

    @RequestMapping(value = "/{name}/{value}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteProperty(@PathVariable String name) {
        logger.info("deleteProperty({}:{}) invoked",name);
        propertyService.deleteProperty(name);
    }
}
