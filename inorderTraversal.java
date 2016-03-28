import java.util.ArrayList;
import java.util.List;

/**
 * Created by Totoro on 2016/3/28 0028.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> rlt = new ArrayList<Integer>();
        getTreeNode(root,rlt);
        return rlt;
    }

    public void getTreeNode(TreeNode root, List<Integer> result){
        if (root == null) return;
        getTreeNode(root.left, result);
        result.add(root.val);
        getTreeNode(root.right,result);
    }

    public static void main(String[] args){
        System.out.println("Binary Tree Inorder Traversal");
    }
}
