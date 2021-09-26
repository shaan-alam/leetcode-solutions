package easy;

/* 
  Link - https://leetcode.com/problems/search-insert-position/
*/

public class Search_Insert_Position {
  public int searchInsert(int[] arr, int target) {
    int index = -1;

    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = (start + end) / 2;

      if (arr[mid] == target) {
        index = mid;
        break;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else if (target < arr[mid]) {
        end = mid - 1;
      }
    }

    return index != -1 ? index : start;
  }
}
