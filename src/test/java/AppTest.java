import ir.home.course.DataUtil;
import ir.home.course.model.Apple;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by Home on 2018-01-02.
 */
public class AppTest {

    private List<Apple> appleList;

    @Before
    public void init(){
        appleList = DataUtil.createSampleApple();
    }

    @Test
    public void success_filter_green_apple(){

    }
}
