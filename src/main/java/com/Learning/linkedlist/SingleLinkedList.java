package com.Learning.linkedlist;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SingleLinkedList {
    Node head;

    public  void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
         newNode.next=head;
         head=newNode;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }


    public void insertAtPosition(int position, int data) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null)
            return;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteFirst(){
        if(head==null)
            return;
        head=head.next;

    }
    public void deleteLast(){
        if(head==null)
            return;
        if(head.next==null){
          head=null;
          return;
      }
        Node temp=head;
        while(temp.next.next!=null){
        temp=temp.next;
        }
        temp.next=null;
    }

    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.insertAtBeginning(5);
        list.insertAtPosition(3,24);
        System.out.println(list.search(30));
        System.out.println(list.search(55));
//        list.deleteFirst();
//        list.deleteLast();

        list.display();

    }


}
