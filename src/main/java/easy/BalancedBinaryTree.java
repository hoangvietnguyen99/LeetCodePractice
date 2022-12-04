/**
 * 
 */
package easy;

/**
 * @author hoang
 *
 */
public class BalancedBinaryTree {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    final TreeNode input = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    boolean result = isBalanced(input);
    System.out.println(result);
  }

  public static boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }
    
    int left = getHeight(root.left);
    
    return true;
  }
  
  public static int getHeight(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      return 1;
    }
    return 1 + Math.max(getHeight(root.left), getHeight(root.right));
  }
  
  

  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

}
