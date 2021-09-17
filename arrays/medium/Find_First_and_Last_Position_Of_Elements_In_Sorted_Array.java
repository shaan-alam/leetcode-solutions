/* Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:

Input: nums = [], target = 0
Output: [-1,-1]

 

Constraints:

    0 <= nums.length <= 105
    -109 <= nums[i] <= 109
    nums is a non-decreasing array.
    -109 <= target <= 109

*/

package medium;

class Find_First_and_Last_Position_Of_Elements_In_Sorted_Array {
  public int[] searchRange(int[] nums, int target) {
    int firstIndex = -1;
    int lastIndex = -1;

    int[] result = new int[2];

    if (nums.length == 1 && nums[0] == target) {
      firstIndex = lastIndex = 0;
    } else {
      for (int i = 0; i < nums.length; i++) {
        if (firstIndex == -1 && target == nums[i]) {
          firstIndex = i;
        }
        if (target == nums[i] && firstIndex != -1) {
          lastIndex = i;
        }
      }
    }

    result[0] = firstIndex;
    result[1] = lastIndex;
    return result;
  }
}