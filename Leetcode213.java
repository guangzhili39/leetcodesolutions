package SolutionPackage;
public class Leetcode213 {
    public int rob(int[] nums) {
        // we can use house robber I dp program
        // two cases: rob first house, not rob first house
        if (nums==null || nums.length==0) return 0;
        if (nums.length == 1) return nums[0];
        int preone=nums[0], pretwo=0;
        for(int i=1;i<nums.length-1;i++) {
            int tmp = Math.max(pretwo+nums[i],preone);
            pretwo = preone;
            preone = tmp;
        }
        int result = Math.max(preone,pretwo);
        preone = 0; pretwo = 0;
        for(int i=1;i<nums.length;i++) {
            int tmp = Math.max(pretwo+nums[i],preone);
            pretwo=preone;
            preone = tmp;
        }

        return Math.max(result,preone);
    }

    public static void main(String[] args) {
        SolutionPackage.Leetcode213 solution = new SolutionPackage.Leetcode213();
        int nums[] = {4,1,2,7,5,3,1};
        System.out.println(solution.rob(nums));
    }
}
