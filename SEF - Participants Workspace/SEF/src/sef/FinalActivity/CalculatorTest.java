package sef.FinalActivity;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private Calculator myCalculator;

    protected void setUp() throws Exception {
        super.setUp();

        myCalculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }
    public void tetAdd() {
        double a = 5;
        double b = 6;

        assertEquals(11.0, myCalculator.add(a, b));
        assertEquals(11.0, myCalculator.add(b, a));

        a = -5;
        b = 6;

        assertEquals(1.0, myCalculator.add(a, b));
        assertEquals(1.0, myCalculator.add(b, a));

        b = -6;

        assertEquals(-11.0, myCalculator.add(a, b));
        assertEquals(-11.0, myCalculator.add(b, a));
    }

    public void testSub() {
        double a = 7;
        double b = 5;

        assertEquals(2.0, myCalculator.sub(a, b));
        assertEquals(-2.0, myCalculator.sub(b, a));

        a = 6;
        b = -4;

        assertEquals(10.0, myCalculator.sub(a, b));
        assertEquals(-10.0, myCalculator.sub(b, a));

        a = -7;
        b = -2;

        assertEquals(-5.0, myCalculator.sub(a, b));
        assertEquals(5.0, myCalculator.sub(b, a));
    }

    public void testMul() {
        double a = 4;
        double b = 7;

        assertEquals(28.0, myCalculator.mul(a, b));
        assertEquals(28.0, myCalculator.mul(b, a));

        a = -7;
        b = 12;

        assertEquals(-84.0, myCalculator.mul(a, b));
        assertEquals(-84.0, myCalculator.mul(b, a));

        a = -6;
        b = -13;

        assertEquals(78.0, myCalculator.mul(a, b));
        assertEquals(78.0, myCalculator.mul(b, a));
    }

    public void testDiv() {
        double a = 4;
        double b = 9;

        assertEquals(0.44, myCalculator.div(a, b), 0.005);
        assertEquals(2.25, myCalculator.div(b, a), 0);

        a = 7;
        b = -4;

        assertEquals(-1.75, myCalculator.div(a, b), 0);
        assertEquals(-0.57, myCalculator.div(b, a), 0.007);

        a = -13;
        b = -3;

        assertEquals(4.33, myCalculator.div(a, b), 0.007);
        assertEquals(0.23, myCalculator.div(b, a), 0.007);
    }

    public void testThrowException(){

        try {
            myCalculator.add(2, 1);
            myCalculator.sub(4, 2);
            myCalculator.mul(0, 1);
            myCalculator.div(1, 0);
            new Calculator();

        } catch (Exception e) {
            fail();
        }
        catch (Error e) {
            fail();
        }
    }
}