package com.jainish;
// Print in lexico-graphical order
public class Que5LargestString {

    public static void largestString(String fruits[]){
        String largest = fruits[0]; // This is used to store the largest string
        for (int i = 1; i < fruits.length-1; i++) { // fruits.length-1 is used to reduce the time complexity
            if (largest.compareTo(fruits[i]) < 0){
                largest = fruits[i]; // This is used to store the largest string in the largest variable
            }
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        String fruits[] = {"Apple","Mango", "Banana"};
        largestString(fruits); // This is used to print the largest string
    }
}
