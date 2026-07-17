package com.Learning.arrays;

public class RightRotation {

    public static void rightRotation(int[] arr){

        int temp = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        rightRotation(new int[] {1,2,3,4,5});
    }
}
