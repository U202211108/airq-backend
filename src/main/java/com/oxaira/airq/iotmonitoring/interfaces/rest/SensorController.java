package com.oxaira.airq.iotmonitoring.interfaces.rest;

import com.oxaira.airq.iotmonitoring.application.dto.CreateSensorRequest;
import com.oxaira.airq.iotmonitoring.application.service.DeleteSensorUseCase;
import com.oxaira.airq.iotmonitoring.application.service.GetAllSensorsUseCase;
import com.oxaira.airq.iotmonitoring.application.service.RegisterSensorUseCase;
import com.oxaira.airq.iotmonitoring.application.service.UpdateSensorUseCase;
import com.oxaira.airq.iotmonitoring.domain.model.Sensor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@SecurityRequirement(name = "bearerAuth")
@RestController
@RequestMapping("/api/v1/sensors")
@RequiredArgsConstructor
public class SensorController {

    private final RegisterSensorUseCase registerSensorUseCase;

    private final GetAllSensorsUseCase getAllSensorsUseCase;

    private final UpdateSensorUseCase updateSensorUseCase;

    private final DeleteSensorUseCase deleteSensorUseCase;

    @PostMapping
    public Sensor create(
            @RequestBody CreateSensorRequest request) {

        return registerSensorUseCase.execute(request);
    }

    @GetMapping
    public List<Sensor> getAll() {
        return getAllSensorsUseCase.execute();
    }

    @PutMapping("/{id}")
    public Sensor update(

            @PathVariable Long id,

            @RequestBody CreateSensorRequest request) {

        return updateSensorUseCase.execute(
                id,
                request);

    }

    @DeleteMapping("/{id}")
    public void delete(

            @PathVariable Long id) {

        deleteSensorUseCase.execute(
                id);

    }
}