package SolutionPackage;
import java.util.*;
public class Leetcode241 {
    Map<String, List<Integer>> map = new HashMap<>();
    public List<Integer> diffWaysToCompute(String input) {
        // let n be the number of numbers
        // f(n) be the number of combinations
        // f(1) = 1; f(2)=1;
        // f(n) = sum_{i=1,n-1}f(i)*f(n-1)
        // each operator seperates the input string into two parts
        // for dynamic programming, we can store the results into hashmap
        if(map.containsKey(input)) return map.get(input);
        List<Integer> rst = new ArrayList<>();
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if(c=='+' || c=='-' || c=='*') {
                for(int a:diffWaysToCompute(input.substring(0, i))) {
                    for(int b: diffWaysToCompute(input.substring(i+1))) {
                        int d = compute(a,b,c);
                        rst.add(d);
                    }
                }
            }
        }
        if(rst.size()==0) rst.add(Integer.parseInt(input)); // single number
        map.put(input, rst); // for reuse
        return rst;
    }

    private int compute(int a, int b, char c) {
        int d=0;
        if (c=='+') d= a+b;
        else if (c=='-') d = a-b;
        else if (c=='*') d = a*b;
        return d;
    }
    public static void main(String[] args) {
        SolutionPackage.Leetcode241 solution = new SolutionPackage.Leetcode241();
        String input="2+5*4*12";
        System.out.println(solution.diffWaysToCompute(input));
    }

}
