/**
 * 
 */
package easy;

/**
 * @author hoang
 *
 */
public class InvertBinaryTree {

  /**
   * @param args
   */
  public static void main(String[] args) {
    easy.InvertBinaryTree.Solution s = new easy.InvertBinaryTree.Solution();
    s.invertTree(new easy.InvertBinaryTree.Solution.TreeNode(1, new easy.InvertBinaryTree.Solution.TreeNode(2, null, null), null));
  }

  static class Solution {
    public TreeNode invertTree(TreeNode root) {
      if (root == null) {
        return root;
      }
      TreeNode l = root.left;
      TreeNode r = root.right;
      if (l != null) {
        if (root.val > l.val) {
          root.right = l;
          root.left = r;
        }
        invertTree(l);
        invertTree(r);
      }
      return root;
    }
    
    
    static public class TreeNode {
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
}
