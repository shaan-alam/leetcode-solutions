package easy;

/* 
  Link - https://leetcode.com/problems/valid-perfect-square/
*/

public class Valid_Perfect_Square {
  public boolean isPerfectSquare(int num) {

    long x = 1;
    long squareCheck = 1;

    while (squareCheck < num) {
      x++;
      squareCheck = x * x;
    }

    return squareCheck == num;
  }
}
