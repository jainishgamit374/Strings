package com.jainish;
// Print in lexico-graphical order
public class Que5LargestString {

    public static void largestString(String fruits[]){
        String largest = fruits[0];
        for (int i = 1; i < fruits.length-1; i++) {
            if (largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        String fruits[] = {"Apple","Mango", "Banana"};
        largestString(fruits);
    }
}
