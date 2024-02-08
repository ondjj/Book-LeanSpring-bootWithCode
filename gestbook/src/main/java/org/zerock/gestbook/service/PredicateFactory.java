package org.zerock.gestbook.service;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.zerock.gestbook.service.predicate.ApplePredicate;

@Component
@RequiredArgsConstructor
public class PredicateFactory {
    private final Set<ApplePredicate> applePredicateSet;
    private Map<String, ApplePredicate> predicate;

    @PostConstruct
    public void init(){
        createPredicate(applePredicateSet);
    }

    private void createPredicate(Set<ApplePredicate> predicateSet) {
        predicate = new HashMap<String, ApplePredicate>();
        predicateSet.forEach(p -> predicate.put(p.getFilterName(), p));
    }

    public ApplePredicate findBy(String className){
        return predicate.get(className);
    }

}
