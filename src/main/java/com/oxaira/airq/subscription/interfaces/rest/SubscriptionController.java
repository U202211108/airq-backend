package com.oxaira.airq.subscription.interfaces.rest;

import com.oxaira.airq.subscription.application.dto.SubscriptionResponse;
import com.oxaira.airq.subscription.application.service.GetSubscriptionUseCase;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/subscriptions")
@RequiredArgsConstructor
@SecurityRequirement(name = "bearerAuth")
public class SubscriptionController {

    private final GetSubscriptionUseCase useCase;

    @GetMapping
    public SubscriptionResponse getSubscription() {

        return useCase.execute();

    }
}