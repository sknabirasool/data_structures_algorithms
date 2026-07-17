package com.Learning.arrays;

import java.util.Arrays;

public class SingleDimensionArray {
    int arr[]=null;

    public SingleDimensionArray(int sizeOfArray){
        arr=new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }

    public void insert(int location,int value){
        try{
        if(arr[location]==Integer.MIN_VALUE){
            arr[location]=value;
            System.out.println("Insert successful");
        }else {
            System.out.println("This cell is already occupied");
        }
    }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array");
        }
    }

    /**
     * Array Traversal
     */
    public void traverseArray(){
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        }catch (Exception e){
            System.out.println("Array no Longer to exits");
        }
    }

    /**
     * Search Array value
     * @param value
     */

    public void searchValue(int value){
        try{
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==value){
                    System.out.println("The Value is Found at index "+i);
                    return;
                }else{
                    System.out.println("Value not found");
                }
            }
        }catch (Exception e){
            System.out.println("Value not found");
        }
    }

    /**
     * Delete An Arrays
     * @param args
     */
    public void deleteValue(int value){
        try{
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==value){
                    arr[i]=Integer.MIN_VALUE;
                    System.out.println("The value has been Delete successful");
                }
            }
        }catch (Exception e){
            System.out.println("Value not found");
        }
    }


    public static void main(String[] args) {
        SingleDimensionArray singleDimensionArray=new SingleDimensionArray(5);

        singleDimensionArray.insert(0,32);
        singleDimensionArray.insert(1,43);
        singleDimensionArray.insert(1,43);
        singleDimensionArray.insert(12,54);

        singleDimensionArray.traverseArray();
        singleDimensionArray.searchValue(32);
        singleDimensionArray.deleteValue(32);
        singleDimensionArray.traverseArray();
    }
}
