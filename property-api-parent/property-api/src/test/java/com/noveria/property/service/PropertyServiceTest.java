package com.noveria.property.service;

import com.noveria.property.model.domain.Property;
import com.noveria.property.model.repositories.PropertyRepository;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PropertyService.class)
@EntityScan("com.noveria.property.model.domain")
@ActiveProfiles("test")
public class PropertyServiceTest {

    @Autowired
    private PropertyService propertyService;

    @MockBean
    PropertyRepository propertyRepository;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void findProperty_returnsExpected_value() {
        Property testProperty = new Property();
        testProperty.setName("testProperty");
        testProperty.setValue("testValue");

        when(propertyRepository.findByName("testProperty")).thenReturn(testProperty);

        Property actual = propertyService.findByName("testProperty");
        assertEquals("testProperty", actual.getName());
        assertEquals("testValue", actual.getValue());
    }

}