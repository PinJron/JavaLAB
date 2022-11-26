import java.time.Duration;
import java.time.Instant;

public class LinSort {
  public static int[] LSDSort(int[] elements) {
    int max = getMaximum(elements);
    int digitLength = digitLength(max);

    for (int digitIndex = 0; digitIndex < digitLength; digitIndex++) {
      LSDDigitSort(elements, digitIndex);
    }

    return elements;
  }

  private static void LSDDigitSort(int[] elements, int digitAtIndex) {
    Bucket[] buckets = partition(elements, digitAtIndex);
    unpack(buckets, elements);
  }

  public static void sort_MSD(int[] elements) {
    int max = getMaximum(elements);
    int numberOfDigits = digitLength(max);

    MSDDigitSort(elements, numberOfDigits - 1);
  }

  private static void MSDDigitSort(int[] elements, int digitIndex) {
    Bucket[] buckets = partition(elements, digitIndex);

    if (digitIndex > 0) {
      for (Bucket bucket : buckets) {
          MSDDigitSort(bucket.getElements(), digitIndex - 1);
      }
    }

    unpack(buckets, elements);
  }

  public static void countSort(int[] elements) {
    int max = getMaximum(elements);
    int digitLength = digitLength(max);

    int[] inputArray = elements;

    for (int digitIndex = 0; digitIndex < digitLength; digitIndex++) {
      elements = sortByDigitCount(elements, digitIndex);
    }

    System.arraycopy(elements, 0, inputArray, 0, elements.length);
  }

  private static int[] sortByDigitCount(int[] elements, int digitIndex) {
    int[] counts = countDigits(elements, digitIndex);
    int[] prefixSums = calculatePrefixSums(counts);
    return collectElements(elements, digitIndex, prefixSums);
  }

  private static int[] calculatePrefixSums(int[] counts) {
    int[] prefixSums = new int[10];
    prefixSums[0] = counts[0];
    for (int i = 1; i < 10; i++) {
      prefixSums[i] = prefixSums[i - 1] + counts[i];
    }
    return prefixSums;
  }

  private static int[] collectElements(int[] elements, int digitIndex, int[] prefixSums) {
    int divisor = calculateDivisor(digitIndex);
    int[] target = new int[elements.length];
    for (int i = elements.length - 1; i >= 0; i--) {
      int element = elements[i];
      int digit = element / divisor % 10;
      target[--prefixSums[digit]] = element;
    }
    return target;
  }

  private static class Bucket {
    private final int[] elements;
    private int addIndex;

    private Bucket(int size) {
      elements = new int[size];
    }

    private void add(int element) {
      elements[addIndex] = element;
      addIndex++;
    }

    private int[] getElements() {
      return elements;
    }
  }

  private static int calculateDivisor(int digitIndex) {
    return (int)Math.pow(10, digitIndex);
  }

  private static int digitLength(int number) {
    return (int)Math.floor(Math.log10(Math.abs(number))) + 1;
  }

  private static int getMaximum(int[] elements) {
    int max = elements[0];
    for (int element : elements) {
      if (element > max) {
        max = element;
      }
    }
    return max;
  }

  private static int[] countDigits(int[] elements, int digitIndex) {
    int[] counts = new int[10];
    int divisor = calculateDivisor(digitIndex);
    for (int element : elements) {
      int digit = element / divisor % 10;
      counts[digit]++;
    }
    return counts;
  }

  private static Bucket[] createBuckets(int[] counts) {
    Bucket[] buckets = new Bucket[10];
    for (int i = 0; i < 10; i++) {
      buckets[i] = new Bucket(counts[i]);
    }
    return buckets;
  }

  private static Bucket[] partition(int[] elements, int digitIndex) {
    int[] counts = countDigits(elements, digitIndex);
    Bucket[] buckets = createBuckets(counts);
    addToBuckets(elements, digitIndex, buckets);
    return buckets;
  }

  private static void addToBuckets(int[] elements, int digitIndex, Bucket[] buckets) {
    int divisor = calculateDivisor(digitIndex);

    for (int element : elements) {
      int digit = element / divisor % 10;
      buckets[digit].add(element);
    }
  }

  private static void unpack(Bucket[] buckets, int[] elements) {
    int targetIndex = 0;
    for (Bucket bucket : buckets) {
      for (int element : bucket.getElements()) {
        elements[targetIndex] = element;
        targetIndex++;
      }
    }
  }

  public static void main(String[] args) {

    // long start_nano = System.nanoTime();
    Instant start = Instant.now();

    int[] a = new int[10000];
      for (int i = 0; i < 10000; i++) {
        a[i] = (int)(Math.random() * 100);
      }
     LinSort.countSort(a);
     System.out.println("done");

    // long finish_nano = System.nanoTime();
    // long elapsed_nano = finish_nano - start_nano;

    Instant finish = Instant.now();
    long elapsed = Duration.between(start, finish).toNanos();

    System.out.println("Прошло времени, мс: " + elapsed);
    }

}
