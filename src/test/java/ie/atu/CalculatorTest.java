package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    public void setup() {
        calc = new Calculator();
    }

    @Test
    public void testAdd_Success(){
        assertEquals(4, calc.add(2,2));
    }

    @Test
    public void testSubtract_Success(){
        assertEquals(0, calc.sub(2,2));
    }

    @Test
    public void testMultiply_Success(){
        assertEquals(4, calc.mul(2,2));
    }

    @Test
    public void testDivide_Success(){
        assertEquals(1, calc.div(2,2));
    }

    @Test
    public void testAdd_fail(){
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.add(Integer.MAX_VALUE, 1));
        assertEquals("Value out of range", ex.getMessage());
    }

    @Test
    public void testSub_fail(){
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.sub(Integer.MIN_VALUE, 1));
        assertEquals("Value out of range", ex.getMessage());
    }








}
