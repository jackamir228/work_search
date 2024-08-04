package com.example.work_search.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {
    private long id;
    private String name;
    private String email;
    private String password;
    private Vacancy vacancy;
}
