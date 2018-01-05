package ir.home.course.services;

import ir.home.course.model.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Home on 2018-01-05.
 */
public class AppleServiceFunctional implements AppleService {
    public List<Apple> filterGreenApples(List<Apple> appleList) {
        return null;
    }

    public List<Apple> filterApples(List<Apple> appleList, ApplePredicate predicate) {
        List<Apple> greenApples = new ArrayList<Apple>();

        for(Apple apple : appleList){
            if (predicate.test(apple)){
                greenApples.add(apple);
            }
        }
        return greenApples;

    }
}
