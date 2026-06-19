package com.oxaira.airq.iotmonitoring.infrastructure.adapter;

import com.oxaira.airq.iotmonitoring.domain.model.Measurement;
import org.springframework.stereotype.Component;

@Component
public class SensorTelemetryAdapter {

    public void receiveMeasurement(
            Measurement measurement) {

        System.out.println(
                "Telemetry received from sensor: "
                        + measurement.getSensor().getId());
    }
}