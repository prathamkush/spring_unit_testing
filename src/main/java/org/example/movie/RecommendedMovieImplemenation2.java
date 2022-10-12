package org.example.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// Making this as a bean via spring so that it will get selected
@Component
public class RecommendedMovieImplemenation2 {

    // Defining dependency as Filterr via spring
    @Autowired
    private Filterr filter;


    // Constructor Injection (Autowiring + Injecting)
    public RecommendedMovieImplemenation2(Filterr filter){
        super();
        this.filter = filter;
    }

    public String[] recommendedMovie(String movie){
        System.out.println("Checking the filter names in usage : "+ filter+"\n");
        String[] resultMovies = filter.getRecommendatins(movie);

        return resultMovies;
    }
}
