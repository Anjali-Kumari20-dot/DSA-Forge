package BasicMath;

class Solution{
    public int CountDigits(int num){
        int count = 0;
        while(num > 0){
            num /= 10;
            count++; 
        }
        return count;
    }
}

public class CountDigits {
    public static void main(String[] args){
        Solution obj = new Solution();
        int n = 54326;
        int result = obj.CountDigits(n);

        System.out.println("Number of Digits in " + n + " is " + result);
    }
}
