import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
        private Calculator calculator;

        @Before
        public void before() {
            calculator = new Calculator();
        }

        @Test
        public void doAddition() {
            assertEquals(6, calculator.add(2, 4));
        }

        @Test
        public void doSubtraction() {
            assertEquals(4, calculator.subtract(10, 6));
        }
        @Test
        public void doMultiplication() {
            assertEquals(25, calculator.multiply(5, 5));
        }
        @Test
        public void doDivision() {
            assertEquals(3, calculator.divide(9, 3));
        }
    }
