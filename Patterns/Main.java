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
            // spaces
            for(int k = m ; k > i ; k--){
                System.out.print(" ");
            }
            // stars
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
            for(int k = i; k >= 0; k--){ 
                System.out.print(" ");
            }

            // print stars - decreasing stars count at every step to get the inverted equilateral triangle pattern
            int stars = (m - i) * 2 - 1;
            for(int j = 0; j < stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void printDiamond(int m){
        printEquilateralTriangle(m);
        printInvertedEquilateralTriangle(m);
    }

    public void printTriangleIII(int m){
        for(int i = 0; i <= m * 2; i++){
            if(i <= m) {
                for(int j = 0; j <= i; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j = 0; (j + i) <= m * 2; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public void printTriangleIV(int m){
        for(int i = 0; i < m; i++){
            for(int j = 0; j <= i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public void printNumberPatternII(int m){
        for(int i = 1; i <= m; i++){
            // Numbers
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }

            // spaces
            for(int k = 1 ; k <= (2 * (m - i)); k++){
                System.out.print(" ");
            }

            // Numbers
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void printNumberTriangleIII(int m){
        int count = 1;
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    public void printTriangleAlphabetI(int m){
        for(int i = 0 ; i < m; i++){
            for(int j = 65 ; j < 65 + i; j++){
                System.out.print((char)j );
            }
            System.out.println();
        }
    }

    public void printTriangleAlphabetII(int m){
        for(int i = 0 ; i < m; i++){
            for(int j = 65 ; (i + j) < (65 + m); j++){
                System.out.print((char)i );
            }
            System.out.println();
        }
    }

    public void printTriangleAlphabetIII(int m){
        for(int i = 0 ; i < m; i++){
            for(int j = 0 ; j <= i; j++){
                System.out.print((char)(i + 65));
            }
            System.out.println();
        }
    }

    public void printTriangleAlphabetIV(int m){ 
        for(int i = 0 ; i < m; i++){
            // spaces
            for(int k = m ; k > i ; k--){
                System.out.print(" ");
            }
            // Alphabet
            for(int j = 65 ; j <= 65 + i - 1; j++){
                System.out.print((char)j );
            }
 
            for(int j = 65 + i  ; j >= 65 ; j--){
                System.out.print((char)j );
            }            
            System.out.println();
        }
    }

    public void printTriangleAlphabetV(int m){
        for(int i = 0; i < m; i++){
            for(int j = (m - i); j <= m; j++){
                System.out.print((char)(j + 64) + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args){
        Solution obj = new Solution();

        // obj.printTriangleAlphabetII(5);
        // obj.printTriangleAlphabetIII(5);
        // obj.printTriangleAlphabetIV(5);

        obj.printTriangleAlphabetV(5);

        // obj.printRectangle(3, 2);

        // obj.printTriangle(5);

        // obj.printNumberTriangleI(5);
        // obj.printNumberTriangleII(5);

        // obj.printInvertedTriangle(5);
        // obj.printNumberInvertedTriangle(6);

        // obj.printEquilateralTriangle(4);

        // obj.printInvertedEquilateralTriangle(4);

        // obj.printDiamond(5);

        // obj.printTriangleIII(5);

        // obj.printTriangleIV(5);

        // obj.printNumberPatternII(4);

        // obj.printNumberTriangleIII(5);

        // obj.printTriangleAlphabetI(5);
    }
}
