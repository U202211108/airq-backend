package com.oxaira.airq.iam.infrastructure.persistence;

import com.oxaira.airq.iam.domain.model.Role;
import com.oxaira.airq.iam.domain.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final RoleRepository roleRepository;

    @Override
    public void run(String... args) {

        createRole("ADMIN");
        createRole("OPERATOR");
        createRole("CLIENT");

    }

    private void createRole(String roleName) {

        if (roleRepository.findByName(roleName).isEmpty()) {

            roleRepository.save(
                    Role.builder()
                            .name(roleName)
                            .build());

        }

    }

}