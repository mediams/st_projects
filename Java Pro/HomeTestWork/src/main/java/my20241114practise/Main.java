package my20241114practise;


public class Main {
    public static void main(String[] args) {

        StringGenerator stringGenerator = new StringGenerator() {
            StringBuilder newString = new StringBuilder();

            @Override
            public String method() {
                for (char i = 'A'; i <= 'Z'; i++) {
                    newString.append(i);
                }
                return newString.toString();
            }
        };
        System.out.println(stringGenerator.method());

        Thread thread = new Thread(() -> {

        });

        new Main().generate(() -> {
            StringBuilder newString = new StringBuilder();
            for (char i = 'A'; i <= 'Z'; i++) {
                newString.append(i);
            }
            return newString.toString();
        });
    }

    public String generate (StringGenerator stringGenerator){

        return stringGenerator.method();
    }


}
//Создайте функциональный интерфейс StringGenerator,
// который не принимает параметров и возвращает случайную строку длиной от 5 до 10 символов,

// содержащую случайные буквы. Реализуйте его и сгенерируйте 10 случайных строк, используя этот интерфейс.
