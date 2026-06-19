package com.oxaira.airq.machinelearning.interfaces.rest;

import com.oxaira.airq.machinelearning.application.dto.PredictionResponse;
import com.oxaira.airq.machinelearning.application.service.GeneratePredictionUseCase;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/predictions")
@RequiredArgsConstructor
@SecurityRequirement(name = "bearerAuth")
public class PredictionController {

    private final GeneratePredictionUseCase useCase;

    @GetMapping
    public PredictionResponse predict() {
        return useCase.execute();
    }
}