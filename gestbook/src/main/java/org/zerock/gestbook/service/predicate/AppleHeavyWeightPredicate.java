package org.zerock.gestbook.service.predicate;

import org.springframework.stereotype.Component;
import org.zerock.gestbook.entity.Apple;

@Component
public class AppleHeavyWeightPredicate extends ApplePredicate {
    @Override
    public boolean filter(Apple apple) {
        return apple.getWeight() > 15;
    }
}
