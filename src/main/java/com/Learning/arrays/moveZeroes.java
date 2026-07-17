package com.Learning.arrays;

public class moveZeroes {

    public static void moveZeroes(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }

        for(int k=0;k<arr.length;k++){
            System.out.print(" "+arr[k]);
        }

    }
    public static void main(String[] args) {

        int[] arr = {0,1 ,0, 3,12};
        moveZeroes(arr);
    }
}
