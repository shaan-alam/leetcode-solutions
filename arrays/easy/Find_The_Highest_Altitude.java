package easy;

public class Find_The_Highest_Altitude {
  public int largestAltitude(int[] gain) {
    int max = 0;
    int point = 0;
    
    for (int x : gain) {
      point = point + x;
      if (point > max) {
        max = point;
      }
    }

    return max;
  }
}
