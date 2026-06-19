package com.oxaira.airq.subscription.application.dto;

import java.time.LocalDate;

public record SubscriptionResponse(

        String organizationName,

        String planName,

        Double monthlyPrice,

        LocalDate startDate,

        LocalDate endDate,

        String status

) {
}