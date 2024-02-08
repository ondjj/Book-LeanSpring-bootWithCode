package org.zerock.gestbook.service;

import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.zerock.gestbook.entity.Apple;
import org.zerock.gestbook.service.predicate.ApplePredicate;

@Service
@RequiredArgsConstructor
public class AppleService {
    private final PredicateFactory factory;

    public List<Apple> getFilteredAppleList(List<Apple> appleList, String className) {
        List<Apple> result = new ArrayList<Apple>();
        ApplePredicate predicate = factory.findBy(className);
        for (Apple apple : appleList) {
            if (predicate.filter(apple))
                result.add(apple);
        }
        return result;
    }
}
