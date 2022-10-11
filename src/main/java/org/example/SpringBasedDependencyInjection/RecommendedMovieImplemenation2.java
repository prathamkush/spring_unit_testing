package org.example.SpringBasedDependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


// Making this as a bean via spring so that it will get selected
@Component
public class RecommendedMovieImplemenation2 {

    // Defining dependency as Filterr via spring
    @Autowired
    private Filterr filter;


    // Constructor Injection (Autowiring + Injecting)
    public RecommendedMovieImplemenation2(@Qualifier("MF2") Filterr filter){
        this.filter = filter;
    }

    public String[] recommendedMovie(String movie){
        System.out.println("Checking the filter names in usage : "+ filter+"\n");
        String[] resultMovies = filter.getRecommendatins(movie);

        return resultMovies;
    }
}
