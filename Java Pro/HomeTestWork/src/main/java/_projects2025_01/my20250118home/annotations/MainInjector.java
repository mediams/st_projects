package my20250118home.annotations;

import java.lang.reflect.InvocationTargetException;

public class MainInjector {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Application application = new Application();
        Injector.injector(application);
        application.run();
    }
}
