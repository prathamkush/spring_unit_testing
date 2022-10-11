package org.example.SpringBasedDependencyInjection;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//
@Component
public class MultiFiltering2 implements Filterr {

    @Override
    public String[] getRecommendatins(String movie) {
        return new String[]{"Ice Age", "Toy Story", "The Croods"};
    }
}
