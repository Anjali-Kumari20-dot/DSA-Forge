package BasicMath;

class Solution{
    public boolean isPrime(int num){
        if(num <= 1) return false;
        
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false; 
            }
        }
        return true;
    }
    public boolean isPrimeOptimised(int num){
        if(num <= 1) return false;

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false; 
            }
        }
        return true;
    }
}

public class CheckForPrime{ 
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 52;
        System.out.println(sol.isPrimeOptimised(n));
        System.out.println(sol.isPrime(n));
    }
}