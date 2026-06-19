package com.oxaira.airq.machinelearning.domain.repository;

import com.oxaira.airq.machinelearning.domain.model.Prediction;

public interface PredictionRepository {

    Prediction generatePrediction();

}