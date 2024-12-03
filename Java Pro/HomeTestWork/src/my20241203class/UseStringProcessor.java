package my20241203class;

public class UseStringProcessor {
    public static void main(String[] args) {
        StringProcessor stringProcessor = new StringProcessor();
        try {
            String textTitle = stringProcessor.process("Text title");
            System.out.println(textTitle);
            textTitle = stringProcessor.process("Text");
        } catch (InputValidationExeception e) {
            System.out.println("Something went wrong");
            e.getStackTrace();
        }
    }
}
