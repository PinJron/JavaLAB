package lr7;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestLinSort {
  @Test
  public void testLSD() {
    int a[] = { 9330, 9950, 718, 8977, 6790, 95, 9807, 741, 8586, 5710 };
    int b[] = { 95, 718, 741, 5710, 6790, 8586, 8977, 9330, 9807, 9950 };

    LinSort.LSDSort(a);
    assertArrayEquals(a, b);
  }

  @Test
  public void tesMSD() {
    int a[] = { 9330, 9950, 718, 8977, 6790, 95, 9807, 741, 8586, 5710 };
    int b[] = { 95, 718, 741, 5710, 6790, 8586, 8977, 9330, 9807, 9950 };
    LinSort.sort_MSD(a);
    assertArrayEquals(a, b);
  }

  @Test
  public void testCounting() {
    int a[] = { 9330, 9950, 718, 8977, 6790, 95, 9807, 741, 8586, 5710 };
    int b[] = { 95, 718, 741, 5710, 6790, 8586, 8977, 9330, 9807, 9950 };

    LinSort.сountSort(a);
    assertArrayEquals(a, b);
  }
}