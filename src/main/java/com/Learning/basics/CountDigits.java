package com.Learning.basics;

public class CountDigits {

    public static int CountDigits(int n)
    {
        int count=0;
        if(n==0){
            return 1;
        }
        n=Math.abs(n);
        System.out.println(n);

        while (n > 0) {
            count++;
            n= n/10;
        }
        return count;

    }
    public static void main(String[] args) {
       int result= CountDigits(-12345);
        System.out.println(result);
    }
}
