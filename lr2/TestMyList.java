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
    public void testDeleteList() {
        MyList list = new MyList();
        list.insertTail(5);
        list.deleteList();
        assertEquals(null, list.firstElement.data, 0); //не работает 
    }
}