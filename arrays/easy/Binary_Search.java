package easy;

/* 
  Link - https://leetcode.com/problems/binary-search/submissions/
*/


public class Binary_Search {
  public int search(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;

    int index = -1;

    int mid = (start + end) / 2;

    while (start <= end) {
      mid = (start + end) / 2;

      if (target > nums[mid]) {
        start = mid + 1;
      } else if (target < nums[mid]) {
        end = mid - 1;
      } else {
        index = mid;
        break;
      }
    }

    return index;
  }
}
