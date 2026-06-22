package Patterns;

class Solution {
    public void printRectangle(int m, int n){
        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void printTriangle(int m){
        for(int i = 0; i < m; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" + ");
            }
            System.out.println();
        }
    }

    public void printNumberTriangleI(int m){
        for(int i = 1; i <= m ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void printNumberTriangleII(int m){
        for(int i = 1; i <= m ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void printInvertedTriangle(int m){
        for(int i = m; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void printNumberInvertedTriangle(int m){
        for(int i = 0; i < m; i++){
            for(int j = 1; (i + j) < m ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }    

    public void printEquilateralTriangle(int m){
        for(int i = 0 ; i < m; i++){
            for(int k = m ; k > i ; k--){
                System.out.print(" ");
            }
            for(int j = 0 ; j < (i * 2 + 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printInvertedEquilateralTriangle(int m){

        // outer for loop - iterating through rows
        for(int i = 0; i < m; i++){

            // print spaces - increasing spaces to shift stars to right
            for(int k = i; k > 0; k--){ 
                System.out.print(" ");
            }

            // print stars - decreasing stars count at every step to get the inverted equilateral triangle pattern
            for(int j = 0; j < ((m - i) * 2 - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
 
}

public class Main {
    public static void main(String[] args){
        Solution obj = new Solution();
        obj.printRectangle(3, 2);

        obj.printTriangle(5);

        obj.printNumberTriangleI(5);
        obj.printNumberTriangleII(5);

        obj.printInvertedTriangle(5);
        obj.printNumberInvertedTriangle(6);

        obj.printEquilateralTriangle(4);

        obj.printInvertedEquilateralTriangle(4);

    }
}
