package ir.home.course.services;

import ir.home.course.model.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Home on 2018-01-03.
 */
public class AppleServiceImperative implements AppleService {

    public List<Apple> filterGreenApples(List<Apple> appleList) {
        List<Apple> greenApples = new ArrayList<Apple>();

        for(Apple apple : appleList){
            if (APPLE_COLOR_GREEN.equals(apple.getColor())){
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

}
