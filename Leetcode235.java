package SolutionPackage;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {val=x;}
}
public class Leetcode235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right,p,q);
        if (root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left,p,q);
        return root;
    }

    public static void main(String[] args) {
        Leetcode235 sol = new Leetcode235();
        TreeNode head= new TreeNode(3);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(6);
        TreeNode l2 = new TreeNode(1);
        TreeNode l3 = new TreeNode(4);
        TreeNode r2 = new TreeNode(5);
        TreeNode r3 = new TreeNode(7);
        head.left = l1;
        head.right = r1;
        l1.left = l2;
        l1.right = l3;
        r1.left=r2;
        r1.right = r3;
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(3);
        TreeNode x = sol.lowestCommonAncestor(head,p,q);
        System.out.println(x.val);
    }
}
