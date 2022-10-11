package jUnit;

import com.sun.org.apache.xpath.internal.operations.Mult;
import org.example.SpringBasedDependencyInjection.ContentFiltering2;
import org.example.SpringBasedDependencyInjection.MultiFiltering2;
import org.example.SpringBasedDependencyInjection.RecommendedMovieImplemenation2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
