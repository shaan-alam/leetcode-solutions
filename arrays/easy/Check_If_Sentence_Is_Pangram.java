package easy;

/* 
  Link - https://leetcode.com/problems/check-if-the-sentence-is-pangram/
*/

public class Check_If_Sentence_Is_Pangram {
  public boolean checkIfPangram(String sentence) {

    for (int i = 97; i <= 122; i++) {
      if (sentence.indexOf("" + (char) i) < 0) {
        return false;
      }
    }

    return true;
  }
}
