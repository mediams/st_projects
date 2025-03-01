package my20250125home.app;

class Application {
    @AutoInject // Поле, которое должно заполняться автоматически
    private Service service;

    public void run() {
//        Service service = new Service();
        service.doSomething(); // Вызываем метод у автоматически подставленного объекта
    }
}
