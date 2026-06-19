package com.oxaira.airq.machinelearning.domain.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Prediction {

    private Double predictedCo2;

    private Double predictedPm25;

    private String riskLevel;

    private String recommendation;
}