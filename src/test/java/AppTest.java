import ir.home.course.model.Apple;
import ir.home.course.services.AppleService;
import ir.home.course.services.ServiceFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.collection.IsCollectionWithSize.*;
import static org.junit.Assert.assertThat;
/**
 * Created by Home on 2018-01-02.
 */
public class AppTest {

    private List<Apple> appleList;
    private AppleService appleService = ServiceFactory.getAppleService();

    @Before
    public void init(){
        appleList = TestDataUtil.createSampleApple();
    }

    @Test
    public void success_filter_green_apple(){
        assertThat(appleService.filterGreenApples(appleList), hasSize(3));
    }
}
