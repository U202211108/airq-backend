package com.oxaira.airq.subscription.domain.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Subscription {

    private Long id;

    private String organizationName;

    private LocalDate startDate;

    private LocalDate endDate;

    private String status;

    private Plan plan;
}