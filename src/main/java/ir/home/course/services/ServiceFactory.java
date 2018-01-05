package ir.home.course.services;

/**
 * Created by Home on 2018-01-03.
 */
public class ServiceFactory {

    public static AppleService getAppleService(){
        return new AppleServiceFunctional();

    }
}
