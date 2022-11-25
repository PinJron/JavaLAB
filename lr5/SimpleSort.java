package lr5;
public class SimpleSort<T> {
  public static <T extends Comparable<T>> T[] sortBuble(T a[], int left, int right) {
    for (int i = left; i < right + 1; i++) {
      for (int j = right; j > i; j--) {
        if (a[j].compareTo(a[j - 1]) < 0) {
          T tmp = a[j - 1];
          a[j - 1] = a[j];
          a[j] = tmp;
        }
      }
    }
    return a;
  }

  public static <T extends Comparable<T>> T[] sortBuble(T a[]) {
    return sortBuble(a, 0, a.length - 1);
  }

  public static <T extends Comparable<T>> T[] sortInsert(T a[], int left, int right) {
    for (int i = left + 1; i < right + 1; i++) {
      T element = a[i];
      int j = i - 1;
      while (j >= left && a[j].compareTo(element) > 0) {
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = element;
    }
    return a;
  }

  public static <T extends Comparable<T>> T[] sortInsert(T a[]) {
    return sortInsert(a, 0, a.length - 1);
  }

  public static <T extends Comparable<T>> T[] sortSelection(T a[], int left, int right) {
    for (int i = right; i >= left; i--) {
      int maxPos = i;
      for (int j = i - 1; j >= left; j--) {
        if (a[j].compareTo(a[maxPos]) > 0) {
          maxPos = j;
        }
      }

      T temp = a[i];
      a[i] = a[maxPos];
      a[maxPos] = temp;
    }
    return a;
  }

  public static <T extends Comparable<T>> T[] sortSelection(T a[]) {
    return sortSelection(a, 0, a.length - 1);
  }
}