package com.Learning.stacks;

public class StackDemo {
    int [] stack=new int[5];
    int top=-1;

    public  void push(int data){
        if(top==stack.length-1){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top]=data;
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public void display(){
        for(int k=top;k>=0;k--){
            System.out.println(stack[k]);
        }
    }
    public void peek(){
        if(top==-1){
            System.out.println("Stack Underflow");
        }
        else{
            System.out.println("peek"+stack[top]);
        }
    }

    public static void main(String[] args) {

        StackDemo stack=new StackDemo();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.pop();

//        stack.peek();
        stack.display();

    }
}
