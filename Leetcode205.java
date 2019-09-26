package SolutionPackage;
import java.util.*;
public class Leetcode209 {
    public int minSubArrayLen(int s, int[] nums) {
        // to find the contiguous length, we need two positions
        int l=0,sum=0, result=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            if (sum >= s) {
                result=Math.min(result,i-l+1);
                while (sum >=s && l<i) {
                    sum -= nums[l];
                    l--;
                }
            }
        }
        return (result==Integer.MAX_VALUE)?0:result;
    }

        public static void main(String[] args) {
            Leetcode209 solution = new Leetcode209();
            int s=7;
            int[] nums=[2,3,1,1,3,3]
            System.out.println(solution.minSubArrayLen(s,nums));
    }
}
