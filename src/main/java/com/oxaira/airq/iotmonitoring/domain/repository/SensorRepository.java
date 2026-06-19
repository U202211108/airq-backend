package com.oxaira.airq.iotmonitoring.domain.repository;

import com.oxaira.airq.iotmonitoring.domain.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository
        extends JpaRepository<Sensor, Long> {
}