package springBootTests;

import org.example.Main;
import org.example.SpringBasedDependencyInjection.RecommendedMovieImplemenation2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(classes = Main.class)
 class RecommendedMovieImplementationSpringBootTest {

    @Autowired
    private RecommendedMovieImplemenation2 movieImplemenation2;

    @Test
     void TestRecommendedMovie(){

        assertArrayEquals(new String[]{"Italian Job","MI","MI3"}, movieImplemenation2.recommendedMovie("Master"));
        //assertArrayEquals(new String[]{"Italian Job","MI","MI3"}, movieImplemenation2.recommendedMovie("Master"));

    }

}