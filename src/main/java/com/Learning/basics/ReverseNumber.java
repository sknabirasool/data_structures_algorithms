package com.Learning.basics;

public class ReverseNumber {

    public static int reverse(int number) {
        int rev=0;
        while(number!=0){
            int lastdigit=number%10;
            rev=(rev*10)+lastdigit;
            number=number/10;
        }
        return rev;
    }
    public static void main(String[] args) {
            int result=reverse(756);
        System.out.println(result);

    }
}
