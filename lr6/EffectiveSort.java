package lr6;

import java.util.Arrays;

public class EffectiveSort {
  public static <T extends Comparable<T>> void quickSort(T arr[]) {
    quickSort(arr, 0, arr.length - 1);
  }

  public static <T extends Comparable<T>> void quickSort(T[] arr, int begin, int end) {
    if (begin < end) {
      int partitionIndex = partition(arr, begin, end);

      quickSort(arr, begin, partitionIndex - 1);
      quickSort(arr, partitionIndex + 1, end);
    }
  }

  private static <T extends Comparable<T>> int partition(T[] arr, int begin, int end) {
    T pivot = arr[end];
    int i = (begin - 1);

    for (int j = begin; j < end; j++) {
      if (arr[j].compareTo(pivot) <= 0) {
        i++;

        T swapTemp = arr[i];
        arr[i] = arr[j];
        arr[j] = swapTemp;
      }
    }

    T swapTemp = arr[i + 1];
    arr[i + 1] = arr[end];
    arr[end] = swapTemp;

    return i + 1;
  }

  public static <T extends Comparable<T>> T[] heapSort(T arr[]) {
    return heapSort(arr, 0, arr.length);
  }

  public static <T extends Comparable<T>> T[] heapSort(T arr[], int left, int right) {
    int n = right - 1;
    for (int i = n / 2; i >= left; i--)
      heapRebalance(arr, i, n);
    for (int i = n; i >= left; i--) {
      T t = arr[left];
      arr[left] = arr[n];
      arr[n] = t;
      n--;
      heapRebalance(arr, 0, n);
    }
    return arr;
  }

  private static <T extends Comparable<T>> void heapRebalance(T arr[], int pos, int size) {
    int a = 2 * pos + 1;
    int b = 2 * pos + 2;
    int largest_el = pos;

    if (a <= size)
      if (arr[a].compareTo(arr[largest_el]) > 0) {
        largest_el = a;
      }
    if (b <= size)
      if (arr[b].compareTo(arr[largest_el]) > 0) {
        largest_el = b;
      }

    if (largest_el != pos) {
      T t = arr[pos];
      arr[pos] = arr[largest_el];
      arr[largest_el] = t;

      heapRebalance(arr, largest_el, size);
    }
  }

  public static <T extends Comparable<T>> T[] mergeSort(T[] arr) throws Exception {
    return mergeSort(arr, 0, arr.length - 1);
  }

  public static <T extends Comparable<T>> T[] mergeSort(T[] arr, int left, int right) throws Exception {
    if (right <= left)
      return arr;

    int mid = (left + right) / 2;
    mergeSort(arr, left, mid);
    mergeSort(arr, mid + 1, right);
    return merge(arr, left, mid, right);
  }

  public static <T extends Comparable<T>> T[] merge(T[] arr, int left, int mid, int right) {
    T leftArray[] = Arrays.copyOfRange(arr, left, mid + 1);
    T rightArray[] = Arrays.copyOfRange(arr, mid + 1, right + 1);

    int leftIndex = 0;
    int rightIndex = 0;

    for (int i = left; i < right + 1; i++) {
      if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
        if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) < 0) {
          arr[i] = leftArray[leftIndex];
          leftIndex++;
        } else {
          arr[i] = rightArray[rightIndex];
          rightIndex++;
        }
      } else if (leftIndex < leftArray.length) {
        arr[i] = leftArray[leftIndex];
        leftIndex++;
      } else if (rightIndex < rightArray.length) {
        arr[i] = rightArray[rightIndex];
        rightIndex++;
      }
    }
    return arr;
  }
}