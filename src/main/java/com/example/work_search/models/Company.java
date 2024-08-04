package com.example.work_search.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Company {
    private String name;
    private List<Vacancy> vacancies;
}
