package com.oxaira.airq.subscription.domain.repository;

import com.oxaira.airq.subscription.domain.model.Subscription;

public interface SubscriptionRepository {

    Subscription getCurrentSubscription();

}