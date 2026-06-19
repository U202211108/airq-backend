package com.oxaira.airq.iotmonitoring.domain.repository;

import com.oxaira.airq.iotmonitoring.domain.model.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MeasurementRepository
        extends JpaRepository<Measurement, Long> {

    List<Measurement> findBySensorId(Long sensorId);

}