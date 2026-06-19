package com.oxaira.airq.notifications.interfaces.rest;

import com.oxaira.airq.notifications.application.dto.NotificationResponse;
import com.oxaira.airq.notifications.application.service.GenerateNotificationUseCase;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/notifications")
@RequiredArgsConstructor
@SecurityRequirement(name = "bearerAuth")
public class NotificationController {

    private final GenerateNotificationUseCase useCase;

    @GetMapping
    public NotificationResponse generate() {

        return useCase.execute();

    }
}