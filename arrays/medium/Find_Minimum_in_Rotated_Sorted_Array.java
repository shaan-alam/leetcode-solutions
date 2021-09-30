package medium;

/* 
  Link - https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
*/

public class Find_Minimum_in_Rotated_Sorted_Array {
  public int findMin(int[] nums) {
    int pivot = findPivot(nums);
    return nums[(pivot + 1) % nums.length];
  }

  static int findPivot(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = (start + end) / 2;

      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      }

      if (mid > start && arr[mid] < arr[mid - 1]) {
        return mid - 1;
      }

      if (arr[mid] <= arr[start]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return -1;
  }
}
