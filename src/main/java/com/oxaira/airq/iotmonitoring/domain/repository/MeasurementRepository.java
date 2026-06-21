package com.oxaira.airq.iotmonitoring.domain.repository;

import com.oxaira.airq.iotmonitoring.domain.model.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MeasurementRepository
        extends JpaRepository<Measurement, Long> {

    List<Measurement> findBySensorId(Long sensorId);

    @Modifying
    @Transactional
    @Query("""
            DELETE FROM Measurement m
            WHERE m.sensor.id = :sensorId
            """)
    void deleteBySensorId(Long sensorId);

}