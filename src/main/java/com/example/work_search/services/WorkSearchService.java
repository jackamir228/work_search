package com.example.work_search.services;

import com.example.work_search.models.User;
import com.example.work_search.models.Vacancy;
import com.example.work_search.repositories.VacancyRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
public class WorkSearchService {
    VacancyService vacancyService;
    UserService userService;

    @PostConstruct
    public void init() {
        log.info("workSearchService was created");
    }

    public void createUser(String name, String email) {
        userService.createUser(name, email);
    }

    public void createUserVacancy(BigDecimal salary, String description) {
        userService.createUserVacancy(salary, description);
    }

    public void createVacancy(String position, String description, BigDecimal salary, String currency) {
    vacancyService.createVacancy(position, description, salary, currency);
    }

}
