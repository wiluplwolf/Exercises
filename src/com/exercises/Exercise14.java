package com.exercises;

//Length of last word in string
public class Exercise14 {
    public void exercise() {
        String str = "People are for your decision";
        System.out.println("Original string: " + str);
        System.out.println("Length of last word is: " + lengthOfLast(str));
    }

    public static int lengthOfLast(String s) {
        int lengthOfWord;
        String[] rem = s.split(" ");
        if (rem.length > 0){
            lengthOfWord = rem[rem.length-1].length();
        } else {
            lengthOfWord = 0;
        }
        return lengthOfWord;
    }
}
