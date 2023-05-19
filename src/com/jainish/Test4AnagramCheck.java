package com.jainish;

public class Test4AnagramCheck {

    public static boolean CheckAnagram(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length() ; j++) {
                if (str1.length() != str2.length() && str1.charAt(i) != str2.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "care";
        String str2 = "race";

        System.out.println(CheckAnagram(str1, str2));

    }
}
