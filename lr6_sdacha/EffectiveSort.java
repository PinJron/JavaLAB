package lr6_sdacha;

// import java.util.Arrays;

public class EffectiveSort {
  public static void quickSort(String arr[]) {
    quickSort(arr, 0, arr.length - 1);
  }

  public static void quickSort(String[] arr, int begin, int end) {
    if (begin < end) {
      int partitionIndex = partition(arr, begin, end);

      quickSort(arr, begin, partitionIndex - 1);
      quickSort(arr, partitionIndex + 1, end);
    }
  }

  private static int partition(String[] arr, int begin, int end) {
    String pivot = arr[end];
    int i = (begin - 1);

    for (int j = begin; j < end; j++) {
      if (arr[j].length() < pivot.length()) {
        i++;

        String swapTemp = arr[i];
        arr[i] = arr[j];
        arr[j] = swapTemp;
      }
    }

    String swapTemp = arr[i + 1];
    arr[i + 1] = arr[end];
    arr[end] = swapTemp;

    return i + 1;
  }
}
