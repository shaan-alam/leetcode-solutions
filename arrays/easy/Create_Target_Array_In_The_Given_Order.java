package easy;

import java.util.ArrayList;

class Create_Target_Array_In_The_Given_Order {
  public int[] createTargetArray(int[] nums, int[] index) {
    int[] result = new int[nums.length];

    ArrayList<Integer> list = new ArrayList<Integer>();

    for (int i = 0; i < nums.length; i++) {
      list.add(index[i], nums[i]);
    }

    for (int i = 0; i < list.size(); i++) {
      result[i] = list.get(i);
    }

    return result;
  }
}