package _projects2024_11.my20241112class.functionalinterfaces;

public class ApplyAction {
    public static void main(String[] args) {

        String data = ", Data from main"; // effectively final
//        data = "new data"; wird ein Fehler

        Action multiplyBy10 = new Action() {
            @Override
            public void doAction(Integer integer) {
                int result = integer * 10;
                System.out.println("result = " + result + data);
            }
        };

        multiplyBy10.doAction(10);
        multiplyBy10.doAction(7);


        Action integerPlus10 = new Action() {
            @Override
            public void doAction(Integer integer) {
                int result = integer + 10;
                System.out.println("result = " + result);
            }
        };
        integerPlus10.doAction(10);
        integerPlus10.doAction(2);

        Action integerMinus10 = i -> {
            int result = i -10;
            System.out.println("result = " + result);
        };

        integerMinus10.doAction(8);
        integerMinus10.doAction(2);

        Action printInteger = integer -> System.out.println(5);

        printInteger.doAction(777);
    }
}
