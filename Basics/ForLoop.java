package Basics;

public class ForLoop {
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            System.out.println("Hey, Anjali, this is the " + i + "'th iteration");
        }

        // Nested for loop
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(" i = " + i + ", j = " + j);
            }
        }

        // Conditional inside for loop
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                System.out.println(i + " is an even number");
            } else {
                System.out.println(i + " is an odd number");
            }
        }

        
    }
}
