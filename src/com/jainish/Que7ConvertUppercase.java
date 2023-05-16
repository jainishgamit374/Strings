package com.jainish;
//It will convert first letter of Word in to uppercase
public class Que7ConvertUppercase {
    //TC = O(n) where n is the length of the string
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder(" ");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length()-1){ // i < str.length()-1 is used to avoid the index out of bound exception
                sb.append(str.charAt(i));  // This is used to add the space in the string
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));  // This is used to convert the character in the uppercase
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return  sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am jainish";
        System.out.println(toUpperCase(str));
    }
}
