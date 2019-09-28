package SolutionPackage;

public class Leetcode258 {
    // % and / are the common way to get the digits
    // using recurrsive to find the answer.
    public static int addDigits(int num) {
        if (num < 10) return num;
        int y=0;
        while (num >= 10) {
            y += num%10;
            num = num/10;
        }
        y+= num;
        return addDigits(y);
    }
    public static void main(String[] args) {
        System.out.println(addDigits(284));
    }
}
