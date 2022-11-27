/**
 * 
 */
package easy;

/**
 * @author hoang
 *
 */
public class ValidParentheses {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println(isValid("{[]}"));
  }

  public static boolean isValid(String s) {
    java.util.Stack<Character> stack = new java.util.Stack<Character>();
    int index = 0;
    do {
      char c = s.charAt(index++);
      switch (c) {
      case '}':
        if (stack.empty() || !stack.peek().equals('{')) {
          return false;
        }
        stack.pop();
        break;
      case ']':
        if (stack.empty() || !stack.peek().equals('[')) {
          return false;
        }
        stack.pop();
        break;
      case ')':
        if (stack.empty() || !stack.peek().equals('(')) {
          return false;
        }
        stack.pop();
        break;
      default:
        stack.push(c);
        break;
      }
    } while (index < s.length());
    return stack.size() == 0;
  }

}
