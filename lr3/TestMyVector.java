import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMyVector {
    MyVector<Integer> vec = new MyVector<Integer>(4);

    @Test
    public void testResize() throws Exception {
        vec.resize();
        assertEquals(18, vec.getCapacity(), 0);
    }

    @Test
    public void testGetCapacity() throws Exception {
        assertEquals(4, vec.getCapacity(), 0);
    }
    
    @Test
    public void testGetLen() {
        vec.addLast(5);
        assertEquals(1, vec.getLen(), 0);
    }

    @Test
    public void testGetByIndex() throws Exception {
        vec.addLast(5);
        assertEquals(5, vec.getByIndex(0), 0);
    }

    @Test
    public void testInsertByIndex() throws Exception {
        vec.addLast(5);
        vec.addLast(3);
        vec.insertByIndex(4, 1);
        assertEquals(4, vec.getByIndex(1), 0);
    }

    @Test
    public void testDeleteByIndex() throws Exception {
        vec.addLast(5);
        vec.addLast(4);
        vec.addLast(3);
        vec.deleteByIndex(1);
        assertEquals(3, vec.getByIndex(1), 0);
    }

    @Test
    public void testDeleteByValue() throws Exception {
        vec.addLast(5);
        vec.addLast(4);
        vec.addLast(3);
        vec.deleteByValue(5);
        assertEquals(4, vec.getByIndex(0), 0);
    }

    @Test
    public void testClear(){
        vec.addLast(5);
        vec.clear();
        assertEquals(0, vec.getCapacity(), 0);
    }
    
}