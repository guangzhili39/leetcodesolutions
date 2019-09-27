package SolutionPackage;

public class Leetcode219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // we can use hashmap<value,position>, or the straight solution
        if (nums==null || nums.length <= 1 || k<=0) return false;
        for(int i=0; i < nums.length-1; i++) {
            int j=i+1;
            while (j<=i+k && j < nums.length) {
                if (nums[i] == nums[j]) return true;
                j++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        SolutionPackage.Leetcode219 solution = new SolutionPackage.Leetcode219();
        int s=3;
        int nums[]={2,3,1,4,3,3};
        System.out.println(solution.containsNearbyDuplicate(nums,s));
    }
}
