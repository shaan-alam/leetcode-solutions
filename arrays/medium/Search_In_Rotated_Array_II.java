package medium;

/* 
  Link - https://leetcode.com/problems/search-in-rotated-sorted-array-ii/submissions/
*/

public class Search_In_Rotated_Array_II {
  public boolean search(int[] arr, int target) {
    int start = 0;
    int pivot = findPivot(arr);

    System.out.println(pivot);
    int index = binarySearch(arr, start, pivot, target);
    if (index == -1) {
      index = binarySearch(arr, pivot + 1, arr.length - 1, target);
    }

    return index == -1 ? false : true;
  }

  static int binarySearch(int[] arr, int start, int end, int target) {

    while (start <= end) {
      int mid = (start + end) / 2;

      if (arr[mid] == target) {
        return mid;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else if (target < arr[mid]) {
        end = mid - 1;
      }
    }

    return -1;
  }

  static int findPivot(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = (start + end) / 2;

      if (mid > start && arr[mid] < arr[mid - 1]) {
        return mid - 1;
      }

      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      }

      if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
        if (start < end && arr[start] > arr[start + 1]) {
          return start;
        }
        start++;

        if (end > start && arr[end] < arr[end - 1]) {
          return end - 1;
        }
        end--;
      } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return -1;
  }
}
