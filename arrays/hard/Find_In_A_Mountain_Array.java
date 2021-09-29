/* 
  Link - https://leetcode.com/problems/find-in-mountain-array/
*/
package hard;

public class Find_In_A_Mountain_Array {

  public int findInMountainArray(int target, MountainArray arr) {
    int start = 0;
    int end = findPeak(arr);

    int index = binarySearch(arr, start, end, target, true);

    System.out.println("First index" + index);
    if (index == -1) {
      index = binarySearch(arr, end, arr.length() - 1, target, false);
    }

    return index == -1 ? -1 : index;
  }

  static int binarySearch(MountainArray arr, int start, int end, int target, boolean isAsc) {
    while (start <= end) {
      int mid = (start + end) / 2;

      if (isAsc) {
        if (target > arr.get(mid)) {
          start = mid + 1;
        } else if (target < arr.get(mid)) {
          end = mid - 1;
        }
      } else {
        if (target > arr.get(mid)) {
          end = mid - 1;
        } else if (target < arr.get(mid)) {
          start = mid + 1;
        }
      }

      if (target == arr.get(mid))
        return mid;
    }

    return -1;
  }

  static int findPeak(MountainArray arr) {
    int start = 0;
    int end = arr.length() - 1;

    while (start < end) {
      int mid = (start + end) / 2;

      if (arr.get(mid) < arr.get(mid + 1)) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }

    return start;
  }
}
