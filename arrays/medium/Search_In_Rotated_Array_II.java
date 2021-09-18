package medium;

/* 
  Link - https://leetcode.com/problems/search-in-rotated-sorted-array-ii/submissions/
*/

public class Search_In_Rotated_Array_II {
  public boolean search(int[] nums, int target) {
    for (int x : nums) {
      if (x == target) {
        return true;
      }
    }

    return false;
  }
}
