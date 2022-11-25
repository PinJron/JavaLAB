package lr6;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestEffectiveSort {
  @Test
  public void testQuickSort() {
    Integer a[] = { 8, 7, 1, 3, 2, 4, 5, 6, 9, 0 };
    Integer b[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    EffectiveSort.quickSort(a);
    assertArrayEquals(a, b);

    Integer c[] = { 9, 2, 3, 7, 8, 4, 5, 6, 1, 0 };
    Integer d[] = { 9, 2, 3, 4, 7, 8, 5, 6, 1, 0 };
  
    EffectiveSort.quickSort(c, 3, 5);
    assertArrayEquals(c, d);

    String e[] = { "test2", "test1", "test4", "test3" };
    String f[] = { "test1", "test2", "test3", "test4" };
  
    EffectiveSort.quickSort(e);
    assertArrayEquals(e, f);
  }

  @Test
  public void testHeapSort() throws Exception {
    Integer a[] = { 8, 7, 1, 3, 2, 4, 5, 6, 9, 0 };
    Integer b[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    EffectiveSort.heapSort(a);
    assertArrayEquals(a, b);

    Integer c[] = { 4, 3, 2, 1, 0, 5, 6, 7, 8, 9 };
    Integer d[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
  
    EffectiveSort.heapSort(c, 0, a.length /2 );
  
    assertArrayEquals(c, d);

    String e[] = { "test2", "test1", "test4", "test3" };
    String f[] = { "test1", "test2", "test3", "test4" };
  
    EffectiveSort.heapSort(e);
    assertArrayEquals(e, f);
  }

  @Test
  public void testMergeSort() throws Exception {
    Integer a[] = { 8, 7, 1, 3, 2, 4, 5, 6, 9, 0 };
    Integer b[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    EffectiveSort.mergeSort(a);
    assertArrayEquals(a, b);

    Integer c[] = { 9, 2, 3, 7, 8, 4, 5, 6, 1, 0 };
    Integer d[] = { 9, 2, 3, 4, 7, 8, 5, 6, 1, 0 };
  
    EffectiveSort.mergeSort(c, 3, 5);
    assertArrayEquals(c, d);
  
    String e[] = { "test2", "test1", "test4", "test3" };
    String f[] = { "test1", "test2", "test3", "test4" };
  
    EffectiveSort.mergeSort(e);
    assertArrayEquals(e, f);
  }
}