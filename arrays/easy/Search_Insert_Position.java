package easy;

/* 
  Link - https://leetcode.com/problems/search-insert-position/
*/

public class Search_Insert_Position {
  public int searchInsert(int[] arr, int target) {
    int index = -1;

    if (target == 0) {
      index = 0;
    } else if (target > arr[arr.length - 1]) {
      index = arr.length;
    } else {
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
          index = i;
          break;
        } else if (target > arr[i]) {
          index = i + 1;
        } else if (i == 0 && target < arr[i]) {
          index = 0;
        }
      }

    }

    return index;
  }
}
