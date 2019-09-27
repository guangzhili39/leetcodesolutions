package SolutionPackage;
import java.util.*;
public class leetcode217 {
    public boolean containsDuplicate(int[] nums) {
        // we can use hashset for it
        Set<Integer> set = new HashSet<Integer>();
        for (int k : nums) {
            if (set.contains(k)) return true;
            else set.add(k);
        }
        return false;
    }

    public static void main(String[] args) {
        SolutionPackage.leetcode217 solution = new SolutionPackage.leetcode217();
        int num[] = {2, 3, 1, 1, 3, 3};
        System.out.println(solution.containsDuplicate(num));
    }
}
