package SolutionPackage;
import java.util.*;
public class leetcode216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        // I am thinking to try different combinations
        // we can use helper function to recursively solve it
        List<List<Integer>> result = new ArrayList<>();
        helper(1,k,n,new ArrayList<>(),result);
        return result;
    }

    private void helper(int start, int count, int sum, List<Integer> comb, List<List<Integer>> result) {
        if (count == 0 && sum == 0) {result.add(comb); return;}
        if (sum < start) return;
        if (count < 0 || start > 9 || sum < 0) return;
        helper(start+1, count, sum, comb, result);
        List<Integer> newcomb = new ArrayList<>(comb);
        newcomb.add(start);
        helper(start+1, --count, sum-start, newcomb, result);
    }
    public static void main(String[] args) {
        SolutionPackage.leetcode216 solution = new SolutionPackage.leetcode216();
        System.out.println(solution.combinationSum3(3,7));
    }
}
