package Recursion;

class Solution{
    public int getSum(int sum, int n){
        if( n < 0) return sum;
        return getSum(sum + n, n - 1);
    }
}

public class SumUptoN {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.getSum(0, 10));;
    }
}
