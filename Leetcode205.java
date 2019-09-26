package SolutionPackage;
import java.util.*;
public class Leetcode205 {
        public boolean isIsomorphic(String s, String t) {
            if (s==null && t==null) return true;
            if (s.length() != t.length()) return false;

            HashMap<Character,Character> map1 = new HashMap<>();
            HashMap<Character,Character> map2 = new HashMap<>();
            for(int i=0;i<s.length();i++) {
                char x = s.charAt(i);
                char y = t.charAt(i);
                if (map1.containsKey(x) && map1.get(x) != y) return false;
                if (map2.containsKey(y) && map2.get(y) != x) return false;
                if (!map1.containsKey(x)) map1.put(x,y);
                if (!map2.containsKey(y)) map2.put(y,x);
            }
            return true;
        }

        public static void main(String[] args) {
            Leetcode205 solution = new Leetcode205();
            String s="ad";
            String t="aa";
            System.out.println(solution.isIsomorphic(s,t));
    }
}
