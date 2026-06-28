package Recursion;

class Solution{
    public int calculateFactorial(int n){
        if(n == 1) return 1;
        return n * calculateFactorial(n - 1);
    }
}

public class Factorial {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.calculateFactorial(5));
    }
}
