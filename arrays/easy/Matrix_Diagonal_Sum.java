package easy;

/* 
  Link = https://leetcode.com/problems/matrix-diagonal-sum/
*/

public class Matrix_Diagonal_Sum {
  public int diagonalSum(int[][] mat) {
    int sum = 0;

    for (int i = 0; i < mat.length; i++) {
      sum += mat[i][i] + mat[i][mat[0].length - 1 - i];
    }

    if (mat.length % 2 == 0) {
      return sum;
    } else {
      return sum - mat[mat.length / 2][mat.length / 2];
    }
  }
}
