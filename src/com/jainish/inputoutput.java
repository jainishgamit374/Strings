package com.jainish;
import java.util.*;
public class inputoutput {

    //Print all letters
    public static void printleters(String  str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str1 = "abcd";
        String str2 = new String("xyze");
//        System.out.println(arr);
//        System.out.println(str1);
//        System.out.println(str2);

        //Scanner String
        Scanner sc = new Scanner(System.in);
//        String name1 = sc.next();
//        String name2 = sc.nextLine();
//        System.out.println(name1 ); //"This is print only single word"
//        System.out.println(name2 ); //"This is print al the words"

        //Length of a string
//        String name = "Tony Stark";
//        System.out.println("The length of " + name + " is: " + name.length());

        //String Concatenate
        String firstName = "Jainish";
        String lastName = "Gamit";
        String fullname = firstName + " " + lastName;
//        System.out.println(fullname);
//        System.out.println(fullname.charAt(0)); // This is printing the index character
        printleters(firstName);

    }
}
