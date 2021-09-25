package medium;

/* 
  Link - https://leetcode.com/problems/rotate-array/
*/

public class Rotate_Array {
  public void rotate(int[] nums, int k) {
    k = k % nums.length;

    reverse(nums, 0, nums.length - 1);
    reverse(nums, k, nums.length - 1);
    reverse(nums, 0, k - 1);

  }

  static void reverse(int[] arr, int s, int e) {
    int temp = arr[s];

    for (int i = s; i <= e;) {
      temp = arr[i];
      arr[i] = arr[e];
      arr[e] = temp;

      e--;
      i++;
    }
  }
}
