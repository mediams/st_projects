package my20241211home;

import org.junit.jupiter.api.Test;

import static my20241211home.Calculater.add;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAdd() {
        int a = 3;
        int b = 5;
        int result = add(a, b);
        assertEquals(8, result, "Метод add должен корректно складывать числа");
    }
}
