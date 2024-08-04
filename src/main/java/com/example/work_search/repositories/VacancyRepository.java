package com.example.work_search.repositories;

import com.example.work_search.exceptions.VacancyRepositoryException;
import com.example.work_search.models.Vacancy;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Getter
@Setter
//сначала репозиторий:
//add
//Optional<> findById
//findAll
//deleteAll
public class VacancyRepository {

    private List<Vacancy> vacancies;

    public void add(Vacancy vacancy) {
        vacancies.add(vacancy);
    }

    public void remove(Vacancy vacancy) {
        vacancies.remove(vacancy);
    }

    public Vacancy findById(long id) {
        return vacancies.stream()
                .filter(vacancy -> vacancy.getId() == id)
                .findFirst()
                .orElseThrow(() -> new VacancyRepositoryException("вакансия с таким id" + id + "не найдена"));
    }
    public List<Vacancy> findAll() {
        return vacancies;
    }

    public void deleteAll() {
        vacancies.clear();
    }
}
