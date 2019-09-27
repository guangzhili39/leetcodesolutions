package SolutionPackage;

public class Leetcode221 {
    public int maximalSquare(char[][] matrix) {
        // we can use dynamic programing:
        // starting from left-top corner, calculate the maximal squre edge until now
        // dp[i][j] = 1 + min(dp[i-1][j-1], dp[i-1][j], dp[i][j-1]) if m[i][j] ==1

        if (matrix == null || matrix.length == 0) return 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int result=0;

        int[][] dp = new int[row][col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if (i==0 || j==0) dp[i][j] = matrix[i][j]-'0';
                else if (matrix[i][j] == '1') {
                    dp[i][j] = 1+Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1]);
                }
                result = Math.max(result,dp[i][j]);
            }
        }
        return result*result;
    }
    public static void main(String[] args) {
        SolutionPackage.Leetcode221 solution = new SolutionPackage.Leetcode221();
        char m[][]={{'1','0','1','0','0'},
                    {'1','0','1','1','1'},
                    {'1','1','1','1','1'},
                    {'1','0','0','1','0'}};
        System.out.println(solution.maximalSquare(m));
    }
}
