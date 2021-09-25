package medium;

public class Set_Matrix_Zeroes {
  int flag = -9999999;

  public void fillFlag(int[][] matrix, int row, int col) {
    for (int c = 0; c < matrix[0].length; c++) {
      if (matrix[row][c] != 0)
        matrix[row][c] = flag;
    }

    for (int r = 0; r < matrix.length; r++) {
      if (matrix[r][col] != 0)
        matrix[r][col] = flag;
    }

  }

  public void setZeroes(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          fillFlag(matrix, i, j);
        }
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == flag) {
          matrix[i][j] = 0;
        }
      }
    }
  }
}
