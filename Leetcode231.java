package SolutionPackage;

public class Leetcode231 {
    public boolean isPowerOfTwo(int n) {
        if (n <=0 ) return false;
        while (n%2 == 0) {
            n=n/2;
        }
        return (n==1);
    }
    public static void main(String[] args) {
        SolutionPackage.Leetcode231 solution = new SolutionPackage.Leetcode231();
        System.out.println(solution.isPowerOfTwo(128));
    }
}
