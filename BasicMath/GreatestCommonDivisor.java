package BasicMath;

class Solution{

    // Brute Force
    public int findGcdI(int num1, int num2){
        int gcd = 1;
        for(int i = 2; i <= Math.min(num1, num2); i++){
            if (num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    // Better Approach
    public int findGcdII(int num1, int num2){
        int gcd = 1;
        for(int i = Math.min(num1, num2); i > 1; i--){
            if (num1 % i == 0 && num2 % i == 0){
                gcd = i; break;
            }
        }
        return gcd;
    }

    // Optimal Approach - Euclidean Algorithm
    public int findGcdIII(int num1, int num2){
        int n1 = Math.max(num1, num2);
        int n2 = Math.min(num1, num2);

        while(n1 != 0){
            n2 = Math.min(n1, n2);
            n1 = Math.abs(n1 - n2);
        }
        return n2;
    }

    // Optimal Approach - Euclidean Algorithm -> Modified
    public int findGcdModified(int num1, int num2){
        while(num1 > 0 && num2 > 0){
            if(num1 > num2) num1 = num1 % num2;
            else num2 = num2 % num1;
        }
        if(num1 == 0) 
            return num2;
        else 
            return num1;
    }

}
public class GreatestCommonDivisor {
    public static void main(String[] args){
        Solution obj = new Solution();
        // int gcd = obj.findGcdI(9, 12);
        // int gcd = obj.findGcdIII(9, 12);
        int gcd = obj.findGcdModified(9, 12);
        System.out.println(gcd);
    }
}
