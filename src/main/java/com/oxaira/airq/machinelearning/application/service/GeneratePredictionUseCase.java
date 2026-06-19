package com.oxaira.airq.machinelearning.application.service;

import com.oxaira.airq.machinelearning.application.dto.PredictionResponse;
import com.oxaira.airq.machinelearning.domain.model.Prediction;
import com.oxaira.airq.machinelearning.domain.repository.PredictionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GeneratePredictionUseCase {

    private final PredictionRepository predictionRepository;

    public PredictionResponse execute() {

        Prediction prediction = predictionRepository.generatePrediction();

        return new PredictionResponse(
                prediction.getPredictedCo2(),
                prediction.getPredictedPm25(),
                prediction.getRiskLevel(),
                prediction.getRecommendation());
    }
}