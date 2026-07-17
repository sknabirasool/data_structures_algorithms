package com.Learning.strings;

public class StringCompression {

    public static void stringCompression(String s){
        char[] arr = s.toCharArray();


        for(int i=0;i<arr.length;i++){
            int count=0;
            char ch=s.charAt(i);
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.print(ch+""+count);
        }


    }
    public static void main(String[] args) {

        stringCompression("aaabbcccc");

    }
}
