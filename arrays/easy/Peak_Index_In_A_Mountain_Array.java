package easy;

/* 
  Link - https://leetcode.com/problems/peak-index-in-a-mountain-array/
*/

public class Peak_Index_In_A_Mountain_Array {
  public int peakIndexInMountainArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start != end) {
      int mid = (start + end) / 2;

      if (arr[mid] < arr[mid + 1]) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }

    return start;
  }
}
