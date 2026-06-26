package BasicMath;

class Solution{
    public boolean Ispalindrome(int num){
        int temp = num;
        int revNum = 0;

        while(temp > 0){
            int rem = temp % 10;
            temp /= 10;
            revNum = revNum * 10 + rem;
        }

        return num == revNum;
    }
}

public class Palindrome {
    public static void main(String[] args) {
    
        Solution obj = new Solution();
        int n = 1221;
        System.out.println(obj.Ispalindrome(n));

    }
}
