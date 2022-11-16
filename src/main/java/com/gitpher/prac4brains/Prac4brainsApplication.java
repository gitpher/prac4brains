package com.gitpher.prac4brains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaAuditing
@SpringBootApplication
public class Prac4brainsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Prac4brainsApplication.class, args);
    }

}
