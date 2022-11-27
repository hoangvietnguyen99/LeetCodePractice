/**
 * 
 */
package easy;

/**
 * @author hoang
 *
 */
public class ValidPalindrome {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println(isPalindrome("race a car"));
  }
  
 
  public static boolean isPalindrome(String s) {
    s = s.toLowerCase();
    int j = s.length() - 1;
    for (int i = 0; i < j && i < s.length(); i++) {
      char firstChar = s.charAt(i);
      if (!checkAlphanumeric(firstChar)) {
        continue;
      }
      char endChar = s.charAt(j);
      while (!checkAlphanumeric(endChar) && j > 0) {
        endChar = s.charAt(--j);
      }
      if (firstChar != endChar) {
        return false;
      }
      j--;
    }
    return true;
  }
  
  public static boolean checkAlphanumeric(char c) {
    int a = 'a';
    int z = 'z';
    int _0 = '0';
    int _9 = '9';
    int v = c;
    return (v >= a && v <= z) || (v >= _0 && v <= _9);
  }

}
