package com.oxaira.airq.machinelearning.infrastructure.persistence;

import com.oxaira.airq.analytics.domain.model.AnalyticsSummary;
import com.oxaira.airq.machinelearning.domain.model.Prediction;
import com.oxaira.airq.machinelearning.domain.repository.PredictionRepository;
import com.oxaira.airq.machinelearning.domain.service.RecommendationService;
import com.oxaira.airq.machinelearning.domain.service.RiskEvaluationService;
import com.oxaira.airq.machinelearning.infrastructure.adapter.AnalyticsAdapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PredictionRepositoryImpl
        implements PredictionRepository {

    private final AnalyticsAdapter analyticsAdapter;

    private final RiskEvaluationService riskService;

    private final RecommendationService recommendationService;

    @Override
    public Prediction generatePrediction() {

        AnalyticsSummary summary = analyticsAdapter.getAnalyticsSummary();

        double predictedCo2 = summary.getAverageCo2() * 1.10;

        double predictedPm25 = summary.getAveragePm25() * 1.05;

        String risk = riskService.evaluateRisk(
                predictedCo2,
                predictedPm25);

        String recommendation = recommendationService
                .generateRecommendation(risk);

        return Prediction.builder()
                .predictedCo2(predictedCo2)
                .predictedPm25(predictedPm25)
                .riskLevel(risk)
                .recommendation(recommendation)
                .build();
    }
}