package easy;


/* 
  Link - https://leetcode.com/problems/arranging-coins/
*/

class Arranging_Coins {
  public int arrangeCoins(int n) {
    int count = 0;

    for (int i = 1; i <= n; i++) {
      if (i <= n) {
        n = n - i;
        count++;
      } else {
        break;
      }
    }

    return count;
  }
}