package my20241206home;

public class TaskRegexEx {
    public static void main(String[] args) {
        String text ="Key: 1, Value: 1\n" +
                "Key: 2, Value: 4\n" +
                "Key: 3, Value: 9\n" +
                "Key: 4, Value: 16\n" +
                "Key: 5, Value: 25\n" +
                "Key: 6, Value: 36";

        String name = "Yevhen";
        int age = 45;
        String text2 = String.format("Ich bin %s und %d jahre alt", name, age);
        System.out.println(text2);

        String numberText = "S";
        System.out.println(numberText.matches("\\W+"));
        System.out.println(numberText.matches("\\w+"));
    }
}
