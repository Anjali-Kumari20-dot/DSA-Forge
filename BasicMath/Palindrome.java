package BasicMath;

class Solution{
    public boolean IspalindromeI(int num){
        int temp = num;
        int revNum = 0;

        while(temp > 0){
            int rem = temp % 10;
            temp /= 10;
            revNum = revNum * 10 + rem;
        }

        return num == revNum;
    }

    public boolean IspalindromeII(int num){
        String original = String.valueOf(num);
        String reversed = new StringBuilder(original).reverse().toString();
        return reversed.equals(original);
    }
}

public class Palindrome {
    public static void main(String[] args) {
    
        Solution obj = new Solution();
        int n = 1721;
        System.out.println(obj.IspalindromeII(n));

    }
}
