package _projects2024_11.my20241203class;

public class StringProcessor {
    public String process(String input) throws InputValidationExeception {
        if (input == null || input.length() < 5) {
            throw new InputValidationExeception("Input string cannot be null or less then 5 symbols");
        }
        return "<h1>" + input + "</h1>";
    }
}
