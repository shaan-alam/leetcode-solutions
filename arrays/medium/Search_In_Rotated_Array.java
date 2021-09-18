package medium;

/* 
  Link - https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
*/

public class Search_In_Rotated_Array {
  public int search(int[] nums, int target) {
    int result = -1;

    for (int x = 0; x < nums.length; x++) {
      if (nums[x] == target) {
        result = x;
        break;
      }
    }

    return result;
  }
}
