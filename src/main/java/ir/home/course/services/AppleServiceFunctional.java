package ir.home.course.services;

import ir.home.course.model.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Home on 2018-01-05.
 */
public class AppleServiceFunctional implements AppleService {
    public List<Apple> filterGreenApples(List<Apple> appleList) {
        return null;
    }

    @Override
    public List<Apple> filterApples(List<Apple> appleList, ApplePredicate predicate) {
        List<Apple> greenApples = new ArrayList<Apple>();

        for(Apple apple : appleList){
            if (predicate.test(apple)){
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    @Override
    public List<Apple> filterApples(List<Apple> appleList, Predicate<Apple> predicate) {
        List<Apple> greenApples = new ArrayList<Apple>();

        for(Apple apple : appleList){
            if (predicate.test(apple)){
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    @Override
    public List<Apple> filterApples(List<Apple> appleList, Function<Apple, Boolean> predicate) {
        List<Apple> greenApples = new ArrayList<Apple>();

        for(Apple apple : appleList){
            if (predicate.apply(apple)){
                greenApples.add(apple);
            }
        }
        return greenApples;
    }
}
