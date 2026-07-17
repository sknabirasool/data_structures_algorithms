package com.Learning.strings;

public class Palindrome {

    public static void palindrome(String s){
        boolean palindrome = true;
        int  start = 0;
        int end = s.length()-1;
        while (start < end){
            if (s.charAt(start) != s.charAt(end)){
                palindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (palindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }

    }

    public static void main(String[] args) {

        palindrome("madam");
        palindrome("hello");
        palindrome("aba");

    }
}
