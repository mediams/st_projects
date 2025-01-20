package my20250118home.annotation;

public class Service {
    @Loggable
    public void doWork(){
        System.out.println("Работа метода doWork");
    }

    public void anotherWork(){
        System.out.println("Обычный метод без логирования");
    }
}
