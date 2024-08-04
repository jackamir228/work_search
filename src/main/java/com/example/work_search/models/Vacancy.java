package com.example.work_search.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
//Создавать вакансию внутри компании (наименование должности, описание вакансии, заработная плата, валюта из ресурсов)
public class Vacancy {
    private long id;
    private String position;
    private String description;
    private BigDecimal salary;
    private String currency;

}
