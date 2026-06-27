package BasicMath;

import java.util.*;

class Solution{

    // Brute Force
    public List<Integer> printDivisors(int num){
        List<Integer> res = new ArrayList<>();
        for(int i = 1 ; i <= num; i++){
            if(num % i == 0) res.add(i);
        }

        return res;
    }

    // Optimal Solution
    public List<Integer> printDivisorsOptimised(int num){
        List<Integer> res = new ArrayList<>();

        for(int i = 1 ; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                res.add(i);

                if(i != num/i)  
                    res.add(num / i);
            }
        }
        Collections.sort(res);
        return res;
    }
}

public class Divisors {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // List<Integer> result = sol.printDivisors(36);
        List<Integer> result = sol.printDivisorsOptimised(36);
        for(int val : result){
            System.out.print(val + " ");
        }
    }
}
