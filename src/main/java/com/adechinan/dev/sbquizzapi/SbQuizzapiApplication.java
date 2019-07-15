package com.adechinan.dev.sbquizzapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SbQuizzapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbQuizzapiApplication.class, args);
    }

}
