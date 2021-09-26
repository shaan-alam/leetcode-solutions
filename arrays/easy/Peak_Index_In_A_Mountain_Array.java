package easy;

/* 
  Link - https://leetcode.com/problems/peak-index-in-a-mountain-array/
*/

public class Peak_Index_In_A_Mountain_Array {
  public int peakIndexInMountainArray(int[] arr) {
    int result = -1;

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] < arr[i + 1]) {
        result = i + 1;
      } else {
        break;
      }
    }
    return result;
  }
}
