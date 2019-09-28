package SolutionPackage;
import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {val=x;}
}
public class Leetcode257 {
    // basic idea: recussive solution. find left tree paths and right tree paths
    // then combining with the root value.
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root==null) return result;
        int v = root.val;
        if (root.left==null && root.right == null) result.add(""+v);
        else {
            if (root.left != null) {
                for (String x:binaryTreePaths(root.left)) result.add(""+v+"->"+x);
            }
            if (root.right != null) {
                for (String x:binaryTreePaths(root.right)) result.add(""+v+"->"+x);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        SolutionPackage.Leetcode257 solution = new SolutionPackage.Leetcode257();
        TreeNode head = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(3);
        TreeNode l2 = new TreeNode(4);
        TreeNode r2 = new TreeNode(5);
        head.left = l1;
        head.right = r1;
        l1.right = l2;
        r1.left = r2;
        System.out.println(solution.binaryTreePaths(head));
    }
}
