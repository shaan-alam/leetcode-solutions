package easy;

import java.util.Arrays;
import java.util.ArrayList;

public class Intersection_Of_Two_Arrays_II {

  public int[] intersect(int[] nums1, int[] nums2) {
    ArrayList<Integer> list = new ArrayList<Integer>();

    Arrays.sort(nums1);
    Arrays.sort(nums2);

    int i = 0;
    int j = 0;

    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] == nums2[j]) {
        list.add(nums1[i]);
        i++;
        j++;
      } else if (nums1[i] > nums2[j]) {
        j++;
      } else {
        i++;
      }
    }

    int[] result = new int[list.size()];
    for (int x = 0; x < list.size(); x++) {
      result[x] = list.get(x);
    }

    return result;
  }

}