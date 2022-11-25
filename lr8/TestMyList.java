package lr8;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestMyList {
  @Test
  public void test1() throws Exception {
    MyList mylist = new MyList();
    mylist.unshift(5);
    mylist.unshift("test");
    mylist.unshift(2.33);
    // [2.33, "test", 5]

    assertEquals(2.33, mylist.first());
    assertEquals(5, mylist.last());

    assertEquals(2.33, mylist.shift());
    // ["test", 5]
    assertEquals("test", mylist.first());
    assertEquals(5, mylist.last());

    assertEquals(5, mylist.pop());
    // ["test"]
    assertEquals("test", mylist.last());
    assertEquals("test", mylist.first());

    mylist.shift();
    // []
    Exception exception = assertThrows(Exception.class, () -> {
      mylist.shift();
    });
    assertEquals("List is empty", exception.getMessage());

    exception = assertThrows(Exception.class, () -> {
      mylist.pop();
    });
    assertEquals("List is empty", exception.getMessage());

    mylist.push(5);
    mylist.push("test");
    mylist.push(2.33);
    // [5, "test", 2.33]

    assertEquals(5, mylist.first());
    assertEquals(2.33, mylist.last());

    assertEquals("test", mylist.deleteAt(1));
    // [5, 2.33]
    assertEquals(5, mylist.first());
    assertEquals(2.33, mylist.last());

    mylist.push(true);
    // [5, 2.33, true]

    assertEquals(5, mylist.atIndex(0));
    assertEquals(2.33, mylist.atIndex(1));
    assertEquals(true, mylist.atIndex(2));

    MyList newlist = new MyList(mylist);
    assertEquals(5, newlist.first());
    assertEquals(5, newlist.atIndex(0));
    assertEquals(2.33, newlist.atIndex(1));
    assertEquals(true, newlist.atIndex(2));
    assertEquals(true, newlist.last());
  }

  @Test
  public void testIterator() throws Exception {
    MyList mylist = new MyList();
    mylist.unshift(5);
    mylist.unshift("test");
    mylist.unshift(2.33);
    // [2.33, "test", 5]

    MyList.MyIterator iter = mylist.iterator();

    iter.toLast();
    assertEquals(false, iter.hasNext());

    iter.toFirst();
    assertEquals(true, iter.hasNext());

    assertEquals(2.33, iter.next());
    assertEquals("test", iter.next());
    assertEquals(5, iter.next());
    assertEquals(false, iter.hasNext());
  }
}