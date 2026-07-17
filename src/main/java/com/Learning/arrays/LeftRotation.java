package com.Learning.arrays;

public class LeftRotation {
    public static void leftRotation(int[] arr){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;

        for(int num:arr){
            System.out.print(" "+num);
        }
    }
    public static void main(String[] args) {
        leftRotation(new int[]{1,2,3,4,5});
    }
}
