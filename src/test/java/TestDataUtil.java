import ir.home.course.model.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Home on 2018-01-01.
 */
public class TestDataUtil {

    public static List<Apple> createSampleApple(){
        return new ArrayList<Apple>(Arrays.asList(
                new Apple("GREEN", 12),
                new Apple("GREEN", 10),
                new Apple("RED", 5),
                new Apple("YELLOW", 6),
                new Apple("GREEN", 1),
                new Apple("RED", 10),
                new Apple("YELLOW", 13),
                new Apple("YELLOW", 16)
        ));
    }
}
