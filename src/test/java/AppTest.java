import ir.home.course.model.Apple;
import ir.home.course.services.ApplePredicate;
import ir.home.course.services.AppleService;
import ir.home.course.services.ServiceFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static ir.home.course.services.AppleService.APPLE_COLOR_GREEN;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
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
        assertThat(appleService.filterApples(appleList,(Predicate<Apple>) apple -> APPLE_COLOR_GREEN.equals(apple.getColor())), hasSize(3));
    }

    @Test
    public void success_filter_green_apples_and_weight_greater_than_ten(){

        ApplePredicate ap = apple -> APPLE_COLOR_GREEN.equals(apple.getColor()) && 10 < apple.getWeight();

        Predicate<Apple> p1 = apple -> APPLE_COLOR_GREEN.equals(apple.getColor());
        Predicate<Apple> p2 = apple -> 10 < apple.getWeight();
        Predicate<Apple> p = p1.and(p2);

        Function<Apple, Boolean> f1 = apple -> APPLE_COLOR_GREEN.equals(apple.getColor());
        Function<Apple, Boolean> f2 = apple -> 10 < apple.getWeight();
        Function<Apple, Boolean> f = apple -> f1.apply(apple) && f2.apply(apple);

        assertThat(appleService.filterApples(appleList, f), hasSize(1));
        assertThat(appleService.filterApples(appleList,  f::apply), hasSize(1));

        appleList.sort((o1, o2) -> o1.getWeight() - o2.getWeight());
    }

    @Test
    public void success_for_test(){
        BiFunction<String, Integer, String> function1 = String::substring;
        assertThat(appleService.getSS("teststring", 4, function1), equalTo("string"));

        Supplier<Apple> s = Apple::new;
        BiFunction<String, Integer, Apple> fu = Apple::new;
        Apple app = fu.apply("s", 10);
        Apple a = s.get();
    }
}
