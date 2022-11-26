package lr6_sdacha;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestEffectiveSort {
  @Test
  public void testQuickSort() {

    String e[] = { "bb", "aaaaaaa", "ddddd", "ccc" };
    String f[] = { "bb", "ccc",  "ddddd", "aaaaaaa", };
  
    EffectiveSort.quickSort(e);
    assertArrayEquals(e, f);
  }
}
