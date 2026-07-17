package com.Learning.arrays;

import java.util.Arrays;

public class TwoDimensionalArray {
    int[][] arr=null;

    public TwoDimensionalArray(int numberOfRows , int numberOfColumns){
        arr=new int[numberOfRows][numberOfColumns];
        for(int rows=0;rows < arr.length;rows++){
            for(int col=0;col < arr[rows].length;col++){
                arr[rows][col]=Integer.MAX_VALUE;
            }
        }
    }

    public void insert(int row,int col,int value){
        try {
            if (arr[row][col] == Integer.MAX_VALUE) {
                arr[row][col] = value;
                System.out.println("Successfully inserted " + value + " in row " + row + " and column " + col);
            } else {
                System.out.println("Row " + row + " and column " + col + " is already in the array");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }
    }

    public  void traverse(){
        for (int row = 0; row < arr.length; row++){
            for (int col=0;col < arr.length;col++){
                System.out.println(arr[row][col]);
            }
        }
    }

    public void search(int value){
        try {
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if (arr[row][col] == value) {
                        System.out.println("value Found " + arr[row][col]);
                        return;
                    }
                }
            }
            System.out.println("value not found");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }
    }

    public void delete(int value){
        try {
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if (arr[row][col] == value) {
                        arr[row][col]=Integer.MAX_VALUE;
                        System.out.println("Successfully deleted " + value + " in row " + row + " and column " + col);
                    }
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }
    }

    public static void main(String[] args) {
        TwoDimensionalArray obj=new TwoDimensionalArray(2,2);

        obj.insert(0,0,10);
        obj.insert(0,1,20);
        obj.insert(1,0,30);
        obj.insert(1,1,40);

        obj.traverse();
        obj.search(10);
        obj.search(24);
        obj.delete(10);
        obj.traverse();
    }

}
