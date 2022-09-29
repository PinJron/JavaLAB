import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestComplex {

    @Test
    public void testAdd() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(1, 1);
        Complex result = a.add(b);
        assertEquals(2, result.getReal(), 0);
        assertEquals(2, result.getImaginary(), 0);
    }

    @Test
    public void testSub() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(1, 1);
        Complex result = a.sub(b);
        assertEquals(0, result.getReal(), 0);
        assertEquals(0, result.getImaginary(), 0);
    }
    
    @Test
    public void testMultiply() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(1, 1);
        Complex result = a.multiply(b);
        assertEquals(0, result.getReal(), 0);
        assertEquals(2, result.getImaginary(), 0);
    }

    @Test
    public void testDivide() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(1, 1);
        Complex result = a.divide(b);
        assertEquals(1, result.getReal(), 0);
        assertEquals(0, result.getImaginary(), 0);
    }
    
    @Test
    public void testAbs() {
        Complex a = new Complex(3, 4);
        double result = a.abs();
        assertEquals(5, result, 0);
    }
    
    @Test
    public void testArg() {
        Complex a = new Complex(1, 1);
        double result = a.arg();
        assertEquals(45, result, 0);
    }
}