package jUnit;

import org.example.movie.RecommendedMovieImplemenation2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "/app-context.xml")
public class RecommendedMovieXmlTests {

    @Autowired
    RecommendedMovieImplemenation2 movieImplemenation2;

    @Test
    public void TestRecommendedMovie(){

        assertArrayEquals(new String[]{"Italian Job","MI","MI3"}, movieImplemenation2.recommendedMovie("Master"));

    }

}
