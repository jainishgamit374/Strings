package com.jainish;

public class Que1CheckPalindrome {

    public static boolean checkPalindrome(String name){
        for (int i = 0; i < name.length()/2; i++) { // name.length()/2 is used to reduce the time complexity
        int n = name.length();
                if (name.charAt(i) != name.charAt(n-1-i)){ // n-1-i is used to get the last index of the string
                    //Not a palindrome
                    return false;
                }
        }
        // Palindrome
        return true;
    }

    public static void main(String[] args) {
        String name = "racer";
        System.out.println(checkPalindrome(name));

    }
}
