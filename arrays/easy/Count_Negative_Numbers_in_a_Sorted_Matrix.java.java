package easy;

/* 
  Link - https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/submissions/
*/

class Count_Negative_Numbers_in_a_Sorted_Matrix {
  public int countNegatives(int[][] grid) {
    int count = 0;

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] < 0) {
          count += grid[i].length - j;
          break;
        }
      }
    }

    return count;
  }
}