package jUnit;

import org.example.movie.ContentFiltering2;
import org.example.movie.MultiFiltering2;
import org.example.movie.RecommendedMovieImplemenation2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;

public class JunitTests {

    @Test
    public void testRecommendMoviesContentFiltering(){

        RecommendedMovieImplemenation2 obj = new RecommendedMovieImplemenation2(new ContentFiltering2());

        assertArrayEquals(new String[]{"Italian Job","MI","MI3"}, obj.recommendedMovie("Master"));
    }

    @Test
    public void testRecommendMovieMultiFiltering(){

        RecommendedMovieImplemenation2 obj = new RecommendedMovieImplemenation2(new MultiFiltering2());

        assertArrayEquals(new String[]{"Ice Age", "Toy Story", "The Croods"}, obj.recommendedMovie("Master"));
    }
}
