package com.jainish;

public class Que4Substring {
    public static String printleters(String  str, int si, int ei){
        StringBuilder substr = new StringBuilder(" "); // This is used to store the substring
        for (int i = si; i < ei; i++) { // This is used to iterate the string from the starting index to ending index
            substr.append(str.charAt(i)); // This is used to add the character in the substring
        }

        return substr.toString();
    }

    public static void main(String[] args) {
        //Substring is used to get the substring from the string
        //Syntax: string.substring(starting index, ending index)
        //Note: ending index is not included
        String name = "Jainish";
        System.out.println(name.substring(2)); // This is printing the substring from the index 2
        System.out.println(name.substring(2, 5)); // This is printing the substring from the index 2 to 5
        System.out.println(printleters(name, 2, 5));

    }
}
