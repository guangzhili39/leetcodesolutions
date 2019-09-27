package SolutionPackage;
import java.util.*;
public class Leetcode226 {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val=x;}
    }

    public TreeNode invertTree(TreeNode root) {
        if (root==null) return root;
        TreeNode left = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(left);
        return root;
    }
    public List<Integer> printTreeValue(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        helper(root, result);
        return result;
    }
    public void helper(TreeNode root,List<Integer> result) {
        if (root == null) return;
        else {
            result.add(root.val);
            helper(root.left,result);
            helper(root.right,result);
        }
        return;
    }
    public static void main(String[] args) {
        SolutionPackage.Leetcode226 solution = new SolutionPackage.Leetcode226();
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(4);
        solution.invertTree(root);
        System.out.println(solution.printTreeValue(root));
    }
}
