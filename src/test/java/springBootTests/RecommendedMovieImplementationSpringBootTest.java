package springBootTests;

import org.example.SpringBasedDependencyInjection.RecommendedMovieImplemenation2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class RecommendedMovieImplementationSpringBootTest {

    @Autowired
    private RecommendedMovieImplemenation2 movieImplemenation2;

    @Test
    public void TestRecommendedMovie(){

        assertArrayEquals(new String[]{"Ice Age", "Toy Story", "The Croods"}, movieImplemenation2.recommendedMovie("Master"));
        //assertArrayEquals(new String[]{"Italian Job","MI","MI3"}, movieImplemenation2.recommendedMovie("Master"));

    }

}