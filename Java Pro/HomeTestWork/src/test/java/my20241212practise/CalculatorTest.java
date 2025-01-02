package my20241212practise;

import _projects2024_12.my20241205home.my20241212practise.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static final int A = 10;
    private static final int B = 5;
    private static final int ZERO = 0;
    private static final Calculator CALCULATOR = new Calculator();

    @Test
    void dividePositiveTest() {

        assertEquals(2, CALCULATOR.divide(A, B));
    }

    @Test
    void divideWithException() {
        int b = 0;

        assertThrows(ArithmeticException.class, () -> CALCULATOR.divide(A, b));
    }
}