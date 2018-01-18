package com.noveria.property.controller;

import com.noveria.property.model.domain.Property;
import com.noveria.property.service.PropertyService;
import org.junit.Before;
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

import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PropertyController.class)
@EntityScan("com.noveria.property.model.domain")
@ActiveProfiles("test")
public class PropertyControllerTest {

    @Autowired
    private PropertyController propertyController;

    @MockBean
    private PropertyService propertyService;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    Property property;

    @Before
    public void setUp() throws Exception {
        property = new Property();
        property.setName("testProperty");
        property.setValue("testValue");
    }

    @Test
    public void getPropertyValue() {
        when(propertyService.findByName(property.getName())).thenReturn(property);
        propertyController.getPropertyValue(property.getName());
        verify(propertyService, times(1)).findByName(eq(property.getName()));
    }


}
