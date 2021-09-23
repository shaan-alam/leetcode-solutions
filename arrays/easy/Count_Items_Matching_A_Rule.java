package easy;

import java.util.List;

/* 
  Link - https://leetcode.com/problems/count-items-matching-a-rule/
*/

public class Count_Items_Matching_A_Rule {
  public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

    int indexToCheck = 0;
    int count = 0;

    if (ruleKey.equals("color")) {
      indexToCheck = 1;
    } else if (ruleKey.equals("name")) {
      indexToCheck = 2;
    }

    for (List<String> list : items) {
      if (list.get(indexToCheck).equals(ruleValue)) {
        count++;
      }
    }

    return count;
  }
}
