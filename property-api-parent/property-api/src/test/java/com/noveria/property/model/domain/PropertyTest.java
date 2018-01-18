package com.noveria.property.model.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyTest {

    private Property property = new Property();

    @Test
    public void getId() {
        property.setId(32L);
        assertEquals(32L, property.getId().longValue());
    }

    @Test
    public void getName() {
        property.setName("Be Here Now");
        assertEquals("Be Here Now", property.getName());
    }

    @Test
    public void getValue() {
        property.setValue("3rd Property");
        assertEquals("3rd Property", property.getValue());
    }
}