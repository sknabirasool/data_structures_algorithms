package com.Learning.strings;

public class ReverseString {

    public static void reverseString(String s){

        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }

    /**
     * using String Builder
     * @param
     */

    public static void usingStringBuilder(String s){
        StringBuilder sb = new StringBuilder(s).reverse();
        System.out.println();
        System.out.println(sb);
    }

    public static void main(String[] args) {

        reverseString("FullStack");
        usingStringBuilder("Stack");

    }
}
