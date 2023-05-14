package com.jainish;

public class Que6StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" "); // This is used to store the string
        for (char ch = 'a'; ch <='z' ; ch++) {
            sb.append(ch); // append() is used to add the character in the string from the last index
        }
        //TC = O(26) n is the length of the string
        System.out.println(sb+" ");
        System.out.println(sb.length());
        //StringBuilder is functions
        //1. append() is used to add the character in the string from the last index
        //2. insert() is used to add the character in the string from the given index
        //3. delete() is used to delete the character from the string
        //4. reverse() is used to reverse the string
        //5. capacity() is used to get the capacity of the string
        //6. charAt() is used to get the character from the given index
        //7. setCharAt() is used to set the character at the given index
        //8. substring() is used to get the substring from the given index
        //9. toString() is used to convert the string builder to string
        //10. indexOf() is used to get the index of the given character
        //11. lastIndexOf() is used to get the last index of the given character
        //12. trimToSize() is used to reduce the capacity of the string
        //13. ensureCapacity() is used to increase the capacity of the string
        //14. setLength() is used to set the length of the string
        //15. getChars() is used to get the character from the given index
    }
}
