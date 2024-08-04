package com.example.work_search.services;

import com.example.work_search.models.User;
import com.example.work_search.models.Vacancy;
import com.example.work_search.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
@Slf4j
public class UserService {
    UserRepository userRepository;

    @PostConstruct
    public void init() {
        log.info("userService was created");
    }

    public void createUser(String name, String email) {
        User user = User.builder()
                .name(name)
                .email(email)
                .build();
        this.userRepository.add(user);
    }

    public void createUserVacancy(BigDecimal salary, String description) {
        Vacancy vacancy =  Vacancy.builder()
                .salary(salary)
                .description(description)
                .build();
    }
}
