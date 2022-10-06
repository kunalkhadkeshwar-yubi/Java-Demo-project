package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.FEBRUARY;
import static java.util.Calendar.JANUARY;


@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student mariam = new Student(
                "mariam",
                "mariam@gmail.com",
                LocalDate.of(2000, Month.FEBRUARY, 21)
            );

            Student alex = new Student(
                "alex",
                "alex@gmail.com",
                LocalDate.of(2001, Month.JANUARY, 21)
            );

            studentRepository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
