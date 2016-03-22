/**
 * Created by Totoro on 16/3/22.
 */

  class TreeNode {
    protected int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        else if (root.left == null && root.right == null && sum == root.val) return true; //the last node must be a leaf node
        else return hasPathSum(root.left,sum - root.val) || hasPathSum(root.right, sum-root.val);

    }

    public static void main(String[] args){
        System.out.println("Path Sum");
    }
}
