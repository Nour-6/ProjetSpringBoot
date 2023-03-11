package com.esprit.alternance.projet_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Projet1Application {

    public static void main(String[] args) {
        SpringApplication.run(Projet1Application.class, args);
    }

}
