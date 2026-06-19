package com.oxaira.airq.subscription.domain.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Plan {

    private Long id;

    private String name;

    private Double monthlyPrice;

    private Integer maxSensors;
}