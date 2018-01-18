package com.noveria.property.service;

import com.noveria.property.model.domain.Property;
import com.noveria.property.model.repositories.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    public List<Property> findByValue(String value) {
        return propertyRepository.findByValue(value);
    }

    public Property findByName(String name) {
        return propertyRepository.findByName(name);
    }

    public void createProperty(String name, String value) {
        Property newProperty = new Property();
        newProperty.setName(name);
        newProperty.setValue(value);

        propertyRepository.save(newProperty);
    }

    public void updateProperty(String name, String value) {
        Property propertyToUpdate = propertyRepository.findByName(name);
        propertyToUpdate.setValue(value);

        propertyRepository.save(propertyToUpdate);
    }

    public void deleteProperty(String name) {
        Property propertyToDelete = propertyRepository.findByName(name);

        propertyRepository.delete(propertyToDelete);
    }

}
