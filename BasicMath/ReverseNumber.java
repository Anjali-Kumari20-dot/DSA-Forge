package BasicMath;

class Solution {
    public int reverseNumber(int num) {
        int revNum = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            revNum = revNum * 10 + rem;
        }
        return revNum;
    }
}

public class ReverseNumber {

    public static void main(String[] args) {
        Solution obj = new Solution();

        int n = 23341;
        int result = obj.reverseNumber(n);
        System.out.println("Reversed number of " + n + " is " + result);
    }
}