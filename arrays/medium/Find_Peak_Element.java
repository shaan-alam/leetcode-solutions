package medium;

/* 
  Link - https://leetcode.com/problems/find-peak-element/
*/

class Find_Peak_Element {
  public int findPeakElement(int[] nums) {
    int result = 0;
    int max = Integer.MIN_VALUE;

    if (nums.length == 1) {
      result = 0;
    } else {
      for (int i = 0; i <= nums.length - 1; i++) {
        if (nums[i] > max) {
          max = nums[i];
          result = i;
        }
      }
    }

    return result;
  }
}