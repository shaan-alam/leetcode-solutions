package medium;

import java.util.ArrayList;

public class Single_Element_in_a_Sorted_Array {
  public int singleNonDuplicate(int[] nums) {

    ArrayList<Integer> list = new ArrayList<>();
    int sum = 0;
    int expectedSum = 0;

    for (int x : nums) {
      if (!list.contains(x)) {
        list.add(x);
      }

      sum += x;
    }

    for (int x : list) {
      expectedSum += 2 * x;
    }

    return expectedSum - sum;

  }
}
