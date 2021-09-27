public class Peak {
  public static void main(String[] args) {
    int[] arr = { 0,2, 1, 0 };
    System.out.println(findPeak(arr));
  }

  static int findPeak(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start != end) {
      int mid = (start + end) / 2;

      if (arr[mid] < arr[mid + 1]) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }

    return arr[start];
  }
}
