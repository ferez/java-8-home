package ir.home.course.services;

import ir.home.course.model.Apple;

import static ir.home.course.services.AppleService.APPLE_COLOR_GREEN;

/**
 * Created by Home on 2018-01-05.
 */
public class ApplePredicateGreenApple implements ApplePredicate {
    public boolean test(Apple apple) {
        return APPLE_COLOR_GREEN.equals(apple.getColor());
    }
}
