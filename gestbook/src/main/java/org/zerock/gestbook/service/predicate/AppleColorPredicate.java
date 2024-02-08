package org.zerock.gestbook.service.predicate;

import static org.zerock.gestbook.entity.Color.GREEN;

import org.springframework.stereotype.Component;
import org.zerock.gestbook.entity.Apple;

@Component
public class AppleColorPredicate extends ApplePredicate {
    @Override
    public boolean filter(Apple apple) {
        return GREEN.equals(apple.getColor());
    }
}
