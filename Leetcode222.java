package SolutionPackage;

public class Leetcode222 {
    TreeNode root;
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public int countNodes(TreeNode root) {
        // simple DFS/BFS will do
        // how about using binary search to find the last node, then calculate
        // the number of nodes? complicated.
        int result=0;
        if (root == null) return result;
        else result++;
        if (root.left == null) return result;
        else {
            result += countNodes(root.left);
            result += countNodes(root.right);
        }
        return result;
    }

    public TreeNode insertLevelOrder(int[] arr, TreeNode root, int i) {
        // Base case for recursion
        if (i < arr.length) {
            TreeNode temp = new TreeNode(arr[i]);
            root = temp;
            root.left = insertLevelOrder(arr, root.left, 2 * i + 1);
            root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
        }
        return root;
    }
    
    public static void main(String[] args) {
        SolutionPackage.Leetcode222 solution = new SolutionPackage.Leetcode222();
        int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
        solution.root = solution.insertLevelOrder(arr, solution.root, 0);
        System.out.println(solution.countNodes(solution.root));
    }
}
