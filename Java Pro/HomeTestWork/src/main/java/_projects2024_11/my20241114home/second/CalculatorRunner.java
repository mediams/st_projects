package _projects2024_11.my20241114home.second;

public class CalculatorRunner {
    void run(Calculator calculator, Subtractor subtractor) {
        int result = calculator.calculate(20);
        System.out.println(result + " - calculate");

        result = subtractor.subtract( 10);
        System.out.println(result + " - subtract");

    }
}

