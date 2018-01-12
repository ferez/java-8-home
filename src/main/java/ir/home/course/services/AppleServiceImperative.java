package ir.home.course.services;

import ir.home.course.model.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Home on 2018-01-03.
 */
public class AppleServiceImperative implements AppleService {

    public List<Apple> filterGreenApples(List<Apple> appleList) {
        List<Apple> greenApples = new ArrayList<Apple>();

        for (Apple apple : appleList) {
            if (APPLE_COLOR_GREEN.equals(apple.getColor())) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    @Override
    public List<Apple> filterApples(List<Apple> appleList, ApplePredicate predicate) {
        throw new RuntimeException("Not implemented yet!");
    }

    @Override
    public List<Apple> filterApples(List<Apple> appleList, Predicate<Apple> predicate) {
        throw new RuntimeException("Not implemented yet!");
    }

    @Override
    public List<Apple> filterApples(List<Apple> appleList, Function<Apple, Boolean> predicate) {
        throw new RuntimeException("Not implemented yet!");
    }

    @Override
    public String getSS(String s, Integer i, BiFunction<String, Integer, String> function) {
        return null;
    }
}
