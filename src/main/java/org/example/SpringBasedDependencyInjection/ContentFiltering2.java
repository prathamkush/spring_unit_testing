package org.example.SpringBasedDependencyInjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Making this class - ContentFiltering as a bean
// @Qualifier("CF2")
@Component
@Primary
public class ContentFiltering2 implements Filterr {
    @Override
    public String[] getRecommendatins(String movie) {
        return new String[]{"Italian Job","MI","MI3"};
    }
}
