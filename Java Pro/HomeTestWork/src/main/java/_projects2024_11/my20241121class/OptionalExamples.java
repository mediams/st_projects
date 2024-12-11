package _projects2024_11.my20241121class;

import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {
        String data = someMethod2();
        data = data == null ? "Default value" : data;
        if (data == null) {
            data = "Default value";
        }
        System.out.println(data.toUpperCase());

        String data2 = someMethod3().orElse("Default value");
        System.out.println(data2.toUpperCase());
    }

    private static String someMethod2() {
        return null;
    }
    public static Optional<String> someMethod3(){
        String data = "Data from Method";
        return Optional.of(data);
//        return Optional.empty();
    }

}
