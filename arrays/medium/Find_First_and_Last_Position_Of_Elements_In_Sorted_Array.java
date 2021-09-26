
package medium;

/* 
  Link - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
*/
public class Find_First_and_Last_Position_Of_Elements_In_Sorted_Array {
  public int[] searchRange(int[] nums, int target) {
    int[] result = { -1, -1 };

    result[0] = bsearch(nums, target, true);
    result[1] = bsearch(nums, target, false);

    return result;
  }

  public int bsearch(int[] arr, int target, boolean isFromStart) {
    int start = 0;
    int end = arr.length - 1;
    int result = -1;

    while (start <= end) {
      int mid = (start + end) / 2;

      if (target > arr[mid]) {
        start = mid + 1;
      } else if (target < arr[mid]) {
        end = mid - 1;
      } else {
        result = mid;

        if (isFromStart) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }

    return result;
  }
}