package easy;
/* 
https://leetcode.com/problems/intersection-of-two-arrays/
*/

import java.util.ArrayList;

public class Intersection_of_Two_Arrays {
  public int[] intersection(int[] nums1, int[] nums2) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    int[] big = nums1.length > nums2.length ? nums1 : nums2;
    int[] small = nums1.length < nums2.length ? nums1 : nums2;

    for (int i = 0; i < big.length; i++) {
      for (int j = 0; j < small.length; j++) {
        if (big[i] == small[j] && !result.contains(big[i])) {
          result.add(big[i]);
        }
      }
    }

    int[] list = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
      list[i] = result.get(i);
    }

    return list;
  }
}
