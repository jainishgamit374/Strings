package com.jainish;
import java.util.*;
public class Que8StringCompression {
    // This is Code for String Compression by using StringBuilder
    public static String stringCompression(String str){
     StringBuilder sb = new StringBuilder(" "); // This is used to store the compressed string

        for (int i = 0; i < str.length() ; i++) {
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){ // i < str.length()-1 is used to avoid the index out of bound exception
                count++;
                i++;
            }
             sb.append(str.charAt(i)); // This is used to add the character in the string

            if (count > 1){
                sb.append(count); // This is used to add the count in the string
            }
        }
        return sb.toString(); // This is used to convert the string builder to string
    }

    public static void main(String[] args) {
        String str = "aaabbccddeeff";
        System.out.println(stringCompression(str));
//        stringCompression(str);
    }

}
