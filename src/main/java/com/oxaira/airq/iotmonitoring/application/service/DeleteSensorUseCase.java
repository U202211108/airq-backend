package com.oxaira.airq.iotmonitoring.application.service;

import com.oxaira.airq.iotmonitoring.domain.repository.SensorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteSensorUseCase {

    private final SensorRepository sensorRepository;

    public void execute(
            Long id) {

        if (!sensorRepository.existsById(id)) {

            throw new RuntimeException(
                    "Sensor no encontrado");

        }

        sensorRepository.deleteById(
                id);

    }

}