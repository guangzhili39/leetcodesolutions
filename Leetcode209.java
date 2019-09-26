package SolutionPackage;

public class Leetcode209 {
    public int minSubArrayLen(int s, int[] nums) {
        // to find the contiguous length, we need two positions
        int l=0,sum=0, result=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            while (sum >= s) {
                result=Math.min(result,i-l+1);
                sum -= nums[l];
                l++;
            }
        }
        return (result==Integer.MAX_VALUE)?0:result;
    }

    public static void main(String[] args) {
        SolutionPackage.Leetcode209 solution = new SolutionPackage.Leetcode209();
        int s=7;
        int nums[]={2,3,1,1,3,3};
        System.out.println(solution.minSubArrayLen(s,nums));
    }
}
