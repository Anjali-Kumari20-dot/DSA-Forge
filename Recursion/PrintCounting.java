package Recursion;

class Solution{
    public void count1toN(int i, int n){
        if (i > n) return;
        System.out.print(i + " ");
        count1toN(i+1, n);
    }
    public void countNto1(int i, int n){
        if (i > n) return;
        countNto1(i+1, n);
        System.out.print(i + " ");
    }
}

public class PrintCounting {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.count1toN(1, 5);
        System.out.println();
        sol.countNto1(1, 5);
    }
}
