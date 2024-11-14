package my20241114home;

public class TasksEx {
    public static void main(String[] args) {
        ActionImplementation actionImplementation = new ActionImplementation();
        actionImplementation.perform();


//        Задание 2: Анонимные классы
        Action action = new Action() {
            @Override
            public void perform() {
                System.out.println("Anonymous action executed!");
            }
        };

        action.perform();
    }

}

//Теперь, вместо создания класса ActionImplementation, попробуй использовать анонимный класс.
// Это значит, что в main методе, ты создашь экземпляр интерфейса Action
// и реализуешь метод perform() прямо внутри метода main. В методе perform() выведи сообщение "Anonymous action executed!".
//
//Убедись, что ты не создаёшь отдельного класса, а реализуешь интерфейс прямо при вызове.
//        Цель: освоить анонимные классы и увидеть, как можно реализовать интерфейс без создания отдельного класса.