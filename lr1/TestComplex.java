import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestComplex {

    @Test
    public void testAdd() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(1, 1);
        Complex result = a.add(b);
        assertEquals(2, result.x, 0);
        assertEquals(2, result.y, 0);
    }

    @Test
    public void testSub() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(1, 1);
        Complex result = a.sub(b);
        assertEquals(0, result.x, 0);
        assertEquals(0, result.y, 0);
    }

    @Test
    public void testArg() {
        Complex a = new Complex(1, 1);
        double result = a.arg();
        assertEquals(45, result, 0);
    }

    @Test
    public void testAbs() {
        Complex a = new Complex(3, 4);
        double result = a.abs();
        assertEquals(5, result, 0);
    }
}