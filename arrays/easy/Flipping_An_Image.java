package easy;

public class Flipping_An_Image {
  public int[][] flipAndInvertImage(int[][] image) {
    int result[][] = new int[image.length][image[0].length];

    for (int i = 0; i < result.length; i++) {
      int col = 0;
      for (int j = result[0].length - 1; j >= 0; j--) {
        int value = image[i][j] == 0 ? 1 : 0;
        result[i][col++] = value;
      }
    }

    return result;
  }
}
