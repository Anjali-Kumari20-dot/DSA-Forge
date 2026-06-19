package Basics;

class Solution {

    // finding length of Strings
    public int calculateLength(String s){
        return s.length();
    }

    // Accessing individual characters
    public void accessCharacters(String s){
        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }

    // Passing, returning, and assigning strings
    public String updateString(String s){
        String newStr = s;
        newStr += " Kumari ";
        return newStr;
    }

    // String comparison
    public boolean compareString(String s1, String s2){
        if(s1.equals(s2));
        return true;
    }
}

public class Strings {
    public static void main(String[] args){
        Solution obj = new Solution();
        
        String str1 = "Anjali";
        String str2 = "anjali";
        System.out.println(obj.calculateLength(str1));

        obj.accessCharacters(str1);
        System.out.println(obj.updateString(str1));

        System.out.print("Strings are equal - "+ obj.compareString(str1, str2));
    }
}
