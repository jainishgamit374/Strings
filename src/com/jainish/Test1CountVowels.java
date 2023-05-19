package com.jainish;

import java.util.Scanner;

public class Test1CountVowels {

    public static String Vowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 'a' || str.charAt(i) > 'z' || str.charAt(i) == ' ') {
                count++;
                i++;
            }
        }
        System.out.println("The number of vowels in the string is: " + count);
        return str;
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        String str = "Jainish LW";
        Vowels(str);
    }
}
