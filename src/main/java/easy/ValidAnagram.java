/**
 * 
 */
package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hoang
 *
 */
public class ValidAnagram {

  /**
   * @param args
   */
  public static void main(String[] args) {
  }

  class Solution {
    public boolean isAnagram(String s, String t) {
      if (s.length() != t.length()) {
        return false;
      }
      Map<Character, Integer> wordMap = new HashMap<>();
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        Integer count = wordMap.get(c);
        if (count == null) {
          wordMap.put(c, 1);
        } else {
          wordMap.replace(c, ++count);
        }
      }
      for (int i = 0; i < t.length(); i++) {
        char c = t.charAt(i);
        Integer count = wordMap.get(c);
        if (count == null) {
          return false;
        }
        count -= 1;
        if (count == 0) {
          wordMap.remove(c);
        } else {
          wordMap.replace(c, count);
        }
      }
      return wordMap.isEmpty();
    }

    public boolean isAnagram2(String s, String t) {
      if (s.length() != t.length()) {
        return false;
      }
      int[] wordCount = new int[26];
      for (int i = 0; i < s.length(); i++) {
        wordCount[s.charAt(i) - 'a']++;
        wordCount[t.charAt(i) - 'a']--;
      }
      for (int i = 0; i < 26; i++) {
        if (wordCount[i] != 0) {
          return false;
        }
      }
      return true;
    }
  }

}
