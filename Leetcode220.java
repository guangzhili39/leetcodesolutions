package SolutionPackage;

public class Leetcode220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        // we can use hashmap or the straight solution
        if (nums==null || nums.length ==1 || k <=0) return false;
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i+1; j<=i+k && j<nums.length;j++) {
                if (Math.abs((long) nums[i]-nums[j]) <=t ) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        SolutionPackage.Leetcode220 solution = new SolutionPackage.Leetcode220();
        int nums[]={2,4,1,5,8,3};
        System.out.println(solution.containsNearbyAlmostDuplicate(nums,1,1));
    }
}
