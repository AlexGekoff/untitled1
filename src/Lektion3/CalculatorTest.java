package Lektion3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @Test
    void add() {
        Calculator calculator =new Calculator(4,5);
        assertEquals(9, calculator.add());
    }
    @Test

    void power() {
        Calculator calculator = new Calculator(4,2);
        assertEquals(16, calculator.power());
    }

}
