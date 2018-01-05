package ir.home.course.services;

import ir.home.course.model.Apple;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Home on 2018-01-02.
 */
public interface AppleService {

    String APPLE_COLOR_GREEN = "GREEN";

//    List<Apple> filterGreenApples(List<Apple> appleList);

    List<Apple> filterApples(List<Apple> appleList, ApplePredicate predicate);
    List<Apple> filterApples(List<Apple> appleList, Predicate<Apple> predicate);
    List<Apple> filterApples(List<Apple> appleList, Function<Apple, Boolean> predicate);
}
