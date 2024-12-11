package _projects2024_11.my20241113hometest;

import java.util.*;


public class DrQueueEx {
    public static void main(String[] args) {
        Map<String, Queue> queue = new TreeMap<>();

        queue.put("1", new Queue("9:00", null));
        queue.put("2", new Queue("9:30", "Hr. Frank"));
        queue.put("3", new Queue("10:00", null));
        queue.put("4", new Queue("10:30", null));

        List<String> queueArray = new ArrayList<>();
        getActualQueue(queue, queueArray);

        addPatient(queueArray, queue);

        getActualQueue(queue, queueArray);
    }

    private static void getActualQueue(Map<String, Queue> queue, List<String> queueArray) {
        System.out.println("Очередь к доктору на данный момент: ");
        for (Map.Entry<String, Queue> entry : queue.entrySet()) {
            if (entry.getValue().getName() == null) {
                System.out.println(entry.getKey() + ") " + entry.getValue().getTime() + ": Cвободно.");
                queueArray.add(entry.getKey());
            } else {
                System.out.println(entry.getKey() + ") " + entry.getValue().getTime() + ": " + entry.getValue().getName());
            }
        }
    }

    private static void addPatient(List<String> queueArray, Map<String, Queue> queue) {
        System.out.println("Выберите номер в очереди.");
        System.out.println("Доступные слоты: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(queueArray);
            String input = scanner.next();
            if (queueArray.contains(input)) {
                System.out.println("Enter your name: ");
                String name = scanner.next();
                queue.get(input).setName(name);
                System.out.println(name + " вы успешно записались на приём.");
                System.out.println("Ваши часы приёма: " + queue.get(input).getTime());
                return;
            } else System.out.println("Error. Выберите из доступных слотов.");
        }
    }
}
class Queue {
    private String time;
    private String name;

    public Queue(String time, String name) {
        this.time = time;
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Queue queue = (Queue) o;
        return Objects.equals(time, queue.time) && Objects.equals(name, queue.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, name);
    }

    @Override
    public String toString() {
        return "time='" + time + '\'' +
                ", \tname='" + name + '\'';
    }
}
// Используя одну из коллекций, напишите программу «Очередь к врачу».
// Пациенты могут бронировать любой временной слот (например, 1 - 9:00, 2 - 9:30, 3 - 10:00 и т.д.)
// для приёма у доктора, при этом указывая в записи своё имя.
// В день приёма программа должна выводить врачу имя следующего пациента строго в порядке номера временного слота.