package com.Learning.basics;

public class CheckPalindromeNumber {

    public static boolean checkPalindrome(int number) {
        int rev=0;
        int originalnumber=number;

        while(number!=0){
            int lastdigit=number%10;
            rev=(rev*10)+lastdigit;
            number=number/10;
        }
        return rev==originalnumber;
    }
    public static void main(String[] args) {
        boolean result=checkPalindrome(121);
        System.out.println(result);
        boolean result1=checkPalindrome(123);
        System.out.println(result1);

    }
}
