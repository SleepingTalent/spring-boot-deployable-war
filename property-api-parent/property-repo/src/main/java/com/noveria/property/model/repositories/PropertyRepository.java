package com.noveria.property.model.repositories;

import com.noveria.property.model.domain.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropertyRepository extends JpaRepository<Property, Long> {

    Property findByName(String name);

    List<Property> findByValue(String value);
}

