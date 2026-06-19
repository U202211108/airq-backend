package com.oxaira.airq.machinelearning.application.dto;

public record PredictionResponse(

        Double predictedCo2,

        Double predictedPm25,

        String riskLevel,

        String recommendation

) {
}