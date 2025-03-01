package my20250209home;

public class TasksEx {
    public static void main(String[] args) {
        Object [] obj = new Object [10];
        obj[0] = 1;
        obj[1] = "Hello";
        obj[2] = "World";
        obj[3] = false;
        obj[4] = true;
        obj[5] = new Student();

        for (Object o : obj) {

            System.out.println(o);
        }
    }
}
