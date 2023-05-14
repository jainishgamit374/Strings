package com.jainish;

public class Que3StringCompare {
    public static void main(String[] args) {
         String s1 = "Jainish";
         String s2 = "Jainish"; // This is pointing to the s1 object
         String s3 = new String("Jainish");  // This is creating a new object of the string

         // This is not the correct way to compare the string
         if (s1 == s2){ // == is used to compare the address of the string
             System.out.println("s1 and s2 are equal");
         }
         else{
             System.out.println("s1 and s2 are not equal");
         }

         // This is the correct way to compare the string
         if (s1.equals(s3)){  // .equals() is used to compare the string
                System.out.println("s1 and s3 are equal");
         }
         else{
             System.out.println("s1 and s3 are not equal");
         }
    }
}