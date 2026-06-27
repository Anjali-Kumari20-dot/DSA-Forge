package BasicMath;

class Solution{
    public int countDigits(int num){
        int digitCnt = 0;

        while(num > 0){
            num /= 10;
            digitCnt++;
        }

        return digitCnt;
    }
    public boolean isArmstrong(int num){
        int temp = num;
        // int digits = countDigits(num); "OR"
        int digits = String.valueOf(num).length();
        int sum = 0;

        while(temp > 0){
            int rem = temp % 10;
            temp /= 10;
            sum += (int)Math.pow(rem, digits);
        }
        return sum == num;
    }
}

public class ArmstrongNumber {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 153;
        System.out.println(obj.isArmstrong(n));
        System.out.println(obj.countDigits(n));
    }
}
