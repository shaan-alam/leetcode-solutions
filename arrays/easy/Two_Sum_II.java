package easy;

/* 
  Link - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
*/

public class Two_Sum_II {
  public int[] twoSum(int[] numbers, int target) {
    int pointer1 = 0;
    int pointer2 = numbers.length - 1;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[pointer1] + numbers[pointer2] > target) {
        pointer2--;
      } else if (numbers[pointer1] + numbers[pointer2] < target) {
        pointer1++;
      } else {
        return new int[] { pointer1 + 1, pointer2 + 1 };
      }
    }

    return new int[] { -1, -1 };
  }
}
