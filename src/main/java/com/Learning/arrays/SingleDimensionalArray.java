package com.Learning.arrays;

public class SingleDimensionalArray {

   static int[] arr=new int[10];
   static int size=0;

    public static void insert(int value){

        if(size==arr.length){
            System.out.println("Array is full");
        }
        try {
            arr[size]=value;
            size++;
            System.out.println("Inserted "+value);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array is full");
        }
    }

    public static void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void update(int oldValue,int newValue){
        if(size==arr.length){
            System.out.println("Array is full");
        }

        for(int i=0;i<size;i++){
            if(arr[i]==oldValue){
                arr[i]=newValue;
                System.out.println("Updated "+newValue);
                return;
            }
        }

        System.out.println("Not Found "+oldValue);
    }

    public static void delete(int value) {

        int index = -1;

        for (int i = 0; i < size; i++) {

            if (arr[i] == value) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println(value + " Not Found");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        System.out.println(value + " Deleted Successfully");
    }

public static void search(int value){

        for(int i=0;i<size;i++){
            if(arr[i]==value){
                System.out.println("Search Element found index "+i);
                return;
            }else{
                System.out.println(arr[i]+" Not Found");
            }
        }

}

    public static void main(String[] args) {

        insert(10);
        insert(20);
        insert(30);
        insert(40);

        display();

        update(10,50);
        delete(50);
        display();

        search(20);

    }
}
