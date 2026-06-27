package BasicMath;

class Solution{
    public int CountDigitsI(int num){
        int count = 0;
        while(num > 0){
            num /= 10;
            count++; 
        }
        return count;
    }
    public int CountDigitsII(int num){
        return String.valueOf(num).length();
    }
}

public class CountDigits {
    public static void main(String[] args){
        Solution obj = new Solution();
        int n = 54326;
        int result = obj.CountDigitsI(n);

        System.out.println("Number of Digits in " + n + " is " + result);
    }
}
