package com.oxaira.airq.subscription.application.service;

import com.oxaira.airq.subscription.application.dto.SubscriptionResponse;
import com.oxaira.airq.subscription.domain.model.Subscription;
import com.oxaira.airq.subscription.domain.repository.SubscriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetSubscriptionUseCase {

    private final SubscriptionRepository repository;

    public SubscriptionResponse execute() {

        Subscription subscription = repository.getCurrentSubscription();

        return new SubscriptionResponse(
                subscription.getOrganizationName(),
                subscription.getPlan().getName(),
                subscription.getPlan().getMonthlyPrice(),
                subscription.getStartDate(),
                subscription.getEndDate(),
                subscription.getStatus());
    }
}