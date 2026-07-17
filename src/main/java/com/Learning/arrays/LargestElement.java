package com.Learning.arrays;


public class LargestElement {

    public static int LargestElement(int[] arr){

        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] arr={10,34,23,44,78};

       int result= LargestElement(arr);
        System.out.println(result);
    }
}
