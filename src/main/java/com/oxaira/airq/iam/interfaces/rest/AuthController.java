package com.oxaira.airq.iam.interfaces.rest;

import com.oxaira.airq.iam.application.dto.LoginRequest;
import com.oxaira.airq.iam.application.dto.LoginResponse;
import com.oxaira.airq.iam.application.service.LoginUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final LoginUseCase loginUseCase;

    @PostMapping("/login")
    public LoginResponse login(
            @RequestBody LoginRequest request) {

        return loginUseCase.execute(request);

    }
}