package SolutionPackage;

public class Leetcode223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        // this should be a very easy problem
        // area1 + area2 - commonpartof(area1,area2)
        int total = (C-A)*(D-B)+(G-E)*(H-F);
        int x1=Math.max(A,E), y1=Math.max(B,F);
        int x2=Math.min(C,G), y2=Math.min(D,H);
        if (x2>x1 && y2>y1) return total - (x2-x1)*(y2-y1);
        else return total;
    }
    public static void main(String[] args) {
        SolutionPackage.Leetcode223 solution = new SolutionPackage.Leetcode223();
        System.out.println(solution.computeArea(1,2,3,4,5,6,7,8));
    }

}
