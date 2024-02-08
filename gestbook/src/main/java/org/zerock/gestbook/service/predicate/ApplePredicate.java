package org.zerock.gestbook.service.predicate;

import org.zerock.gestbook.entity.Apple;

public abstract class ApplePredicate {
    public String getFilterName() {
        return getClass().getSimpleName();
    }

    public abstract boolean filter(Apple apple);
}
