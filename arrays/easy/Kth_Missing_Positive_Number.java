package easy;

import java.util.ArrayList;

public class Kth_Missing_Positive_Number {

  public int findKthPositive(int[] arr, int k) {
    ArrayList<Integer> list = new ArrayList<>();
    int result = 0;
    int count = 0;

    for (int x : arr) {
      list.add(x);
    }

    System.out.println(list);

    for (int i = 1;; i++) {
      if (!list.contains(i)) {
        count++;
      }

      if (count == k) {
        result = i;
        break;
      }
    }

    return result;

  }
}
