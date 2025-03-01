package my20250125home.app;

public class Main {
    public static void main(String[] args) {
        Application app = new Application(); // Создаём объект Application
        Injector.inject(app); // Инжектор автоматически заполняет поля
        app.run(); // Запускаем приложение
    }
}