package _projects2025_01.my20250118home.annotations;

public class Application {
    @AutoInject
    private Service service;

    public void run(){
        service.doSomething();
    };
}
