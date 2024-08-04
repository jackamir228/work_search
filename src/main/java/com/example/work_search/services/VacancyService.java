package com.example.work_search.services;

import com.example.work_search.models.User;
import com.example.work_search.models.Vacancy;
import com.example.work_search.repositories.UserRepository;
import com.example.work_search.repositories.VacancyRepository;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

import static ch.qos.logback.classic.spi.ThrowableProxyVO.build;

@Service
@Getter
@Setter
@Slf4j
public class VacancyService {
    VacancyRepository vacancyRepository;
    UserRepository userRepository;

    @PostConstruct
    public void init() {
        log.info("VacancyService was created");
    }

    public void createVacancy(String position, String description, BigDecimal salary, String currency) {
        Vacancy vacancy = Vacancy.builder()
                .position(position)
                .description(description)
                .salary(salary)
                .currency(currency)
                .build();
        this.vacancyRepository.add(vacancy);
    }

    public VacancyRepository getVacancy() {
        return this.vacancyRepository;
    }


}
