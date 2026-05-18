package id.telyu.scm;

import org.junit.jupiter.api.Test;

public class ArithmeticLogicTest {

    @Test
    void testAdd() {
        ArithmeticLogic logic = new ArithmeticLogic();
        int result = logic.add(10, 5);

        assert result == 15 : "10 + 5 seharusnya menghasilkan 15";
    }

    @Test
    void testSubtract() {
        ArithmeticLogic logic = new ArithmeticLogic();
        int result = logic.subtract(10, 5);

        assert result == 5 : "10 - 5 seharusnya menghasilkan 5";
    }

    @Test
    void testMultiply() {
        ArithmeticLogic logic = new ArithmeticLogic();
        int result = logic.multiply(10, 5);

        assert result == 50 : "10 * 5 seharusnya menghasilkan 50";
    }

    @Test
    void testDivide() {
        ArithmeticLogic logic = new ArithmeticLogic();
        int result = logic.divide(10, 5);

        assert result == 2 : "10 / 5 seharusnya menghasilkan 2";
    }

    @Test
    void testDivideByZero() {
        ArithmeticLogic logic = new ArithmeticLogic();
        boolean exceptionThrown = false;

        try {
            logic.divide(10, 0);
        } catch (IllegalArgumentException exception) {
            exceptionThrown = true;
        }

        assert exceptionThrown : "Pembagian dengan nol harus menghasilkan IllegalArgumentException";
    }
}