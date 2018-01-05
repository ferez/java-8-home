package ir.home.course.services;

import ir.home.course.model.Apple;

/**
 * Created by Home on 2018-01-05.
 */

@FunctionalInterface
public interface ApplePredicate {
    boolean test (Apple apple);
}
