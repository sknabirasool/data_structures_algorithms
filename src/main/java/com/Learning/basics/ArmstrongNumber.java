package com.Learning.basics;

public class ArmstrongNumber {

    public static boolean armstrongNumber(int number){
        int originalnumber=number;
       int sum=0;
        while(number!=0){

            int lastdigit=number%10;
            sum=sum+lastdigit*lastdigit*lastdigit;
            number=number/10;
        }
        return originalnumber==sum;
    }
    public static void main(String[] args) {

        Boolean result=armstrongNumber(153);
        System.out.println(result);

        Boolean result1=armstrongNumber(1535);
        System.out.println(result1);

    }
}
