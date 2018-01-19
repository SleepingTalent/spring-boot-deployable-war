package com.noveria.property.model.repositories;

import com.noveria.property.model.domain.Property;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest(classes = Property.class)
public class MessageRepositoryTest extends BaseRepositoryTest {

    @Autowired
    private PropertyRepository propertyRepository;

    private Property property;

    @Before
    public void setUp() throws Exception {
        property = new Property();
        property.setName("testProperty");
        property.setValue("testValue");
        entityManager.persist(property);
    }

    @After
    public void tearDown() throws Exception {
        entityManager.remove(property);
    }

    @Test
    public void findPropertyById() {
        Property actual = propertyRepository.findOne(property.getId());

        assertEquals("testProperty", actual.getName());
        assertEquals("testValue", actual.getValue());
    }

    @Test
    public void findPropertyByName() {
        Property actual = propertyRepository.findByName(property.getName());

        assertEquals("testProperty", actual.getName());
        assertEquals("testValue", actual.getValue());
    }

}