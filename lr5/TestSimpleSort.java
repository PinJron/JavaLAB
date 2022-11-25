package lr5;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSimpleSort {
  @Test
  public void TestBuble() {
    Integer a[] = { 8, 7, 1, 3, 2, 4, 5, 6, 9, 0 };
    Integer b[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    SimpleSort.sortBuble(a);
    assertArrayEquals(a, b);

    Integer c[] = { 9, 2, 3, 7, 8, 4, 5, 6, 1, 0 };
    Integer d[] = { 9, 2, 3, 4, 7, 8, 5, 6, 1, 0 };
  
    SimpleSort.sortBuble(c, 3, 5);
    assertArrayEquals(c, d);

    String e[] = { "test2", "test1", "test4", "test3" };
    String f[] = { "test1", "test2", "test3", "test4" };

    SimpleSort.sortBuble(e);
    assertArrayEquals(e, f);
  }

  @Test
  public void TestInsert() {
    Integer a[] = { 8, 7, 1, 3, 2, 4, 5, 6, 9, 0 };
    Integer b[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    SimpleSort.sortInsert(a);
    assertArrayEquals(a, b);

    Integer c[] = { 9, 2, 3, 7, 8, 4, 5, 6, 1, 0 };
    Integer d[] = { 9, 2, 3, 4, 7, 8, 5, 6, 1, 0 };
  
    SimpleSort.sortInsert(c, 3, 5);
    assertArrayEquals(c, d);

    String e[] = { "test2", "test1", "test4", "test3" };
    String f[] = { "test1", "test2", "test3", "test4" };

    SimpleSort.sortInsert(e);
    assertArrayEquals(e, f);
  }

  @Test
  public void TestSelection() {
    Integer a[] = { 8, 7, 1, 3, 2, 4, 5, 6, 9, 0 };
    Integer b[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    SimpleSort.sortSelection(a);
    assertArrayEquals(a, b);

    Integer c[] = { 9, 2, 3, 7, 8, 4, 5, 6, 1, 0 };
    Integer d[] = { 9, 2, 3, 4, 7, 8, 5, 6, 1, 0 };
  
    SimpleSort.sortSelection(c, 3, 5);
    assertArrayEquals(c, d);

    String e[] = { "test2", "test1", "test4", "test3" };
    String f[] = { "test1", "test2", "test3", "test4" };

    SimpleSort.sortSelection(e);
    assertArrayEquals(e, f);
  } 
}
