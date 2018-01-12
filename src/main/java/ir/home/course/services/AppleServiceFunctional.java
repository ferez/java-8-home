package ir.home.course.services;

import ir.home.course.model.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Home on 2018-01-05.
 */
public class AppleServiceFunctional implements AppleService {

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
        return filterApples(appleList, (ApplePredicate) apple -> predicate.test(apple));
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

/*
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
*/

    @Override
    public String getSS(String s, Integer i, BiFunction<String , Integer, String> function){
        return function.apply(s, i);
    }
}
