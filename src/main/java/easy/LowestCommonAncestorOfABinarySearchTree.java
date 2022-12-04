/**
 * 
 */
package easy;

import easy.LowestCommonAncestorOfABinarySearchTree.TreeNode;

/**
 * @author hoang
 *
 */
public class LowestCommonAncestorOfABinarySearchTree {

  /**
   * @param args
   */
  public static void main(String[] args) {
    LowestCommonAncestorOfABinarySearchTree app = new LowestCommonAncestorOfABinarySearchTree();
    TreeNode node = app.lowestCommonAncestor(
        new TreeNode(6,
            new TreeNode(2, new TreeNode(0, null, null),
                new TreeNode(4, new TreeNode(3, null, null), new TreeNode(5, null, null))),
            new TreeNode(8, new TreeNode(7, null, null), new TreeNode(9, null, null))),
        new TreeNode(2, null, null), new TreeNode(8, null, null));
    node = node;
  }

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root.val == p.val || root.val == q.val) {
      return root;
    }
    if (root.val > p.val && root.val > q.val) {
      return lowestCommonAncestor(root.left, p, q);
    }
    if (root.val < p.val && root.val < q.val) {
      return lowestCommonAncestor(root.right, p, q);
    }
    return root;
  }
  
  public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
    while (true) {
      if (root.val > p.val && root.val > q.val) {
        root = root.left;
      } else if (root.val > p.val && root.val > q.val) {
        root = root.right;
      } else {
        return root;
      }
    }
  }

  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }

    TreeNode(int x, TreeNode left, TreeNode right) {
      val = x;
      this.left = left;
      this.right = right;
    }
  }
}
