package SolutionPackage;
import java.util.*;
public class Leetcode229 {
    public List<Integer> majorityElement(int[] nums) {
        //it is so easy to use O(n) space using hashmap
        //for O(1) space, the only algorithm could be Moor's voting algorithm
        //by cancelling counts of different numbers, the majority will remain.
        //the number of elements that appear more than n/3 times is at most 2.
        //so we will use two voting counts.
        List<Integer> result = new ArrayList<Integer>();
        int vote1=0, vote2=0;
        int id1=0,id2=0;
        if (nums==null || nums.length == 0) return result;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == id1) {
                vote1++;
            } else if (nums[i] == id2) {
                vote2++;
            } else if (vote1 == 0) {
                vote1 = 1;
                id1=nums[i];
            } else if (vote2 == 0){
                vote2 = 1;
                id2 = nums[i];
            } else {
                vote1--;
                vote2--;
            }
        }
        // id1 and id2 just candidates, so need to verify them
        vote1 = 0;
        vote2 = 0;

        for(int n : nums) {
            if (n==id1) vote1++;
            else if (n==id2) vote2++;
        }
        if (vote1 > nums.length/3) result.add(id1);
        if (vote2 > nums.length/3) result.add(id2);

        return result;
    }
    public static void main(String[] args) {
        SolutionPackage.Leetcode229 solution = new SolutionPackage.Leetcode229();
        int nums[]={2,3,1,1,3,3};
        System.out.println(solution.majorityElement(nums));
    }
}
