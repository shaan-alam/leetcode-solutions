package medium;

/* 
  Link - https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
*/

public class Find_Minimum_in_Rotated_Sorted_Array {
  public int findMin(int[] nums) {
    int min = nums[0];

    for (int x : nums) {
      if (x < min) {
        min = x;
      }
    }

    return min;
  }
}
