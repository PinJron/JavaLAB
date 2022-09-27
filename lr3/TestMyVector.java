import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMyVector {
    MyVector<Integer> vec = new MyVector<Integer>(4);

    @Test
    public void testGetCapacity() throws Exception {
        assertEquals(4, vec.getCapacity(), 0);
    }
    
    @Test
    public void testGetLen() {
        vec.push(5);
        assertEquals(1, vec.getLen(), 0);
    }

    @Test
    public void testPop() throws Exception {
        vec.push(5);
        assertEquals(5, vec.pop(), 0);
    }

    @Test
    public void testGet() throws Exception {
        vec.push(5);
        assertEquals(5, vec.get(0), 0);
    }

    @Test
    public void testInsert() throws Exception {
        vec.push(5);
        vec.push(3);
        vec.insert(4, 1);
        assertEquals(4, vec.get(1), 0);
    }

    @Test
    public void testDeleteByIndex() throws Exception {
        vec.push(5);
        vec.push(4);
        vec.push(3);
        vec.deleteByIndex(1);
        assertEquals(3, vec.get(1), 0);
    }
    
}