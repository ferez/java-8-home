package ir.home.course.services;

import ir.home.course.model.Apple;

import java.util.List;

/**
 * Created by Home on 2018-01-02.
 */
public interface AppleService {

    String APPLE_COLOR_GREEN = "GREEN";

    public List<Apple> filterGreenApples(List<Apple> appleList);
}
