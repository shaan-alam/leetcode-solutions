package easy;

/* 
  Link - https://leetcode.com/problems/check-if-n-and-its-double-exist/submissions/
*/

import java.util.ArrayList;

public class Check_If_N_And_Its_Double_exist {
  public static boolean checkIfExist(int[] arr) {

    ArrayList<Integer> list = new ArrayList<>();

    for (int x : arr) {
      list.add(x);
    }

    for (int i = 0; i < arr.length; i++) {
      if (list.contains(2 * arr[i]) && list.indexOf(2 * arr[i]) != i) {
        return true;
      }
    }

    return false;

  }
}
