package com.oxaira.airq.iotmonitoring.application.service;

import com.oxaira.airq.iotmonitoring.domain.repository.MeasurementRepository;
import com.oxaira.airq.iotmonitoring.domain.repository.SensorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class DeleteSensorUseCase {

    private final SensorRepository sensorRepository;

    private final MeasurementRepository measurementRepository;

    public void execute(Long id) {

        if (!sensorRepository.existsById(id)) {

            throw new RuntimeException(
                    "Sensor no encontrado");
        }

        measurementRepository
                .deleteBySensorId(id);

        sensorRepository
                .deleteById(id);
    }
}