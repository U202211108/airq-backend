package com.oxaira.airq.subscription.infrastructure.persistence;

import com.oxaira.airq.subscription.domain.model.Plan;
import com.oxaira.airq.subscription.domain.model.Subscription;
import com.oxaira.airq.subscription.domain.repository.SubscriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
@RequiredArgsConstructor
public class SubscriptionRepositoryImpl
        implements SubscriptionRepository {

    @Override
    public Subscription getCurrentSubscription() {

        Plan plan = Plan.builder()
                .id(1L)
                .name("Professional")
                .monthlyPrice(99.90)
                .maxSensors(50)
                .build();

        return Subscription.builder()
                .id(1L)
                .organizationName("AirQ Demo Organization")
                .startDate(LocalDate.now())
                .endDate(LocalDate.now().plusMonths(1))
                .status("ACTIVE")
                .plan(plan)
                .build();
    }
}