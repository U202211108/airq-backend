package com.oxaira.airq.subscription.domain.service;

import org.springframework.stereotype.Service;

@Service
public class BillingCalculationService {

    public Double calculateMonthlyCost(
            Double price) {

        return price;

    }
}