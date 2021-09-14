package medium;

import java.util.ArrayList;

/* 
Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1 -
  Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
  Output: [1,2,3,6,9,8,7,4,5]

Example 2 -
  Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
  Output: [1,2,3,4,8,12,11,10,9,5,6,7]

Constraints:

    m == matrix.length
    n == matrix[i].length
    1 <= m, n <= 10
    -100 <= matrix[i][j] <= 100

*/

public class Spiral_Matrix {
  public ArrayList<Integer> spiralOrder(int[][] matrix) {
    int rs = 0;
    int re = matrix.length - 1;

    int cs = 0;
    int ce = matrix[0].length - 1;

    ArrayList<Integer> list = new ArrayList<>();
    int maxCount = (matrix.length * matrix[0].length) - 1;
    int count = 0;

    while (rs <= re && cs <= ce) {
      for (int c = cs; c <= ce && count <= maxCount; c++) {
        list.add(matrix[rs][c]);
        count++;
      }

      for (int r = rs + 1; r <= re && count <= maxCount; r++) {
        list.add(matrix[r][ce]);
        count++;
      }

      for (int c = ce - 1; c >= cs && count <= maxCount; c--) {
        list.add(matrix[re][c]);
        count++;
      }

      for (int r = re - 1; r > rs && count <= maxCount; r--) {
        list.add(matrix[r][cs]);
        count++;
      }

      rs++;
      re--;

      cs++;
      ce--;
    }
    return list;
  }
}