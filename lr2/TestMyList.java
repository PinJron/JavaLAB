import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMyList {

    @Test
    public void testInsertTail() {
        MyList list = new MyList();
        list.insertTail(5);
        assertEquals(5, (int)list.lastElement.data, 0);
    }

    @Test
    public void testInsertHead() {
        MyList list = new MyList();
        list.insertHead(5);
        assertEquals(5, (int)list.firstElement.data, 0);
    }

    @Test
    public void testRemoveHead() throws Exception {
        MyList list = new MyList();
        list.insertHead(5);
        list.removeHead();
        assertEquals(0, (int)list.countElements, 0);
    }

    @Test
    public void testRemoveTail() throws Exception {
        MyList list = new MyList();
        list.insertTail(5);
        list.insertTail(4);
        list.removeTail();
        assertEquals(1, (int)list.countElements, 0);
    }

    @Test
    public void testRemoveByIndex() throws Exception {
        MyList list = new MyList();
        list.insertHead(5);
        list.removeByIndex(0);
        assertEquals(0, (int)list.countElements, 0);
    }

    @Test
    public void testRemoveByValue() throws Exception {
        MyList list = new MyList();
        list.insertHead(10);
        list.removeByValue(10);
        assertEquals(0, (int)list.countElements, 0);
    }
    
    @Test
    public void testGetLenght() throws Exception {
        MyList list = new MyList();
        list.insertHead(10);
        list.insertHead(9);
        assertEquals(2, (int)list.countElements, 0);
    }

    @Test
    public void testGetByIndex() throws Exception {
        MyList list = new MyList();
        list.insertHead(10);
        int a = (int)list.getByIndex(0);
        assertEquals(10, a, 0);
    }

    @Test
    public void testDeleteList() {
        MyList list = new MyList();
        list.insertTail(5);
        list.deleteList();
        assertEquals(0, list.countElements, 0); //не работает 
    }
}