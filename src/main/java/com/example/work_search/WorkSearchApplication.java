package com.example.work_search;

import com.example.work_search.services.WorkSearchService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;

@SpringBootApplication
public class WorkSearchApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(WorkSearchApplication.class, args);
        Map<String, WorkSearchService> workSearchServiceMap = context.getBeansOfType(WorkSearchService.class);
        System.out.println(workSearchServiceMap);

    }

}
