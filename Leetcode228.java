package SolutionPackage;
import java.util.*;
public class Leetcode228 {
    //this should be easy. What you need is to maintain two pointer number
    //but be careful about the last entries.
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums==null || nums.length==0) return result;
        int s=nums[0], t=nums[0];
        for(int i=1;i<nums.length;i++) {
            if (nums[i] == t+1) {
                t=t+1;
            } else {
                if (s==t) {result.add(""+s);}
                else {result.add(s+"->"+t);}
                s=t=nums[i];
            }
        }
        if (s==t) result.add(""+s);
        else result.add(s+"->"+t);
        return result;
    }
    public static void main(String[] args) {
        SolutionPackage.Leetcode228 solution = new SolutionPackage.Leetcode228();
        int nums[]={1,2,3,5,8,9};
        System.out.println(solution.summaryRanges(nums));
    }
}
