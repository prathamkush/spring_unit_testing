package org.example;


import org.example.movie.RecommendedMovieImplemenation2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = SpringApplication.run(Main.class, args);

        RecommendedMovieImplemenation2 recommender = context.getBean(RecommendedMovieImplemenation2.class);
        String[] result = recommender.recommendedMovie("Master");
        System.out.println(Arrays.toString(result));
    }
}