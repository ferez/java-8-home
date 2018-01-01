package ir.home.course;

import ir.home.course.model.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Home on 2018-01-01.
 */
public class DataUtil {
    public static List<Apple> createSampleApple(){
        return new ArrayList<Apple>(Arrays.asList(
                new Apple("GREEN"),
                new Apple("GREEN"),
                new Apple("RED"),
                new Apple("YELLOW"),
                new Apple("GREEN"),
                new Apple("RED"),
                new Apple("YELLOW"),
                new Apple("YELLOW")
        ));
    }
}
