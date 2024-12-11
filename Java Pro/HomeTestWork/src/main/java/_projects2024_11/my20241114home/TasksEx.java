package _projects2024_11.my20241114home;

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

            @Override
            public void perform(String message) {

            }
        };
        action.perform();

//        Action action2 = () -> System.out.println("Lambda action executed!");

        Action action2 = new Action() {
            @Override
            public void perform() {
                System.out.println("TEst1");
            }

            @Override
            public void perform(String message) {
                System.out.println(message);
            }
        };

        action2.perform();
        action2.perform("Hey");

    }
}

//Задание 3: Использование лямбда-выражений
//Теперь, используя тот же интерфейс Action с методом perform(), попробуй реализовать лямбда-выражение для вызова метода.
// В методе main вызови perform() с лямбда-выражением, которое выведет на экран сообщение "Lambda action executed!".
//
//Дополнительно: добавь в интерфейс Action второй метод perform(String message), который принимает строковый параметр
// и выводит его на экран. Затем, используй лямбда-выражение для вызова этого метода, передавая произвольное сообщение.
//        Цель: понять, как применять лямбда-выражения и увидеть их разницу с анонимными классами.