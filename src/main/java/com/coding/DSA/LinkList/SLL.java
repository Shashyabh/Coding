package com.coding.DSA.LinkList;

public class SLL {

    private int size;
    private Node head;
    private Node tail;
    public SLL(){
        this.size=0;
    }
    public class Node{
        int val;
        Node next;
        public Node (int val){
            this.val=val;
        }
        public Node (int val,Node next){
            this.val=val;
            this.next=next;
        }
    }

    public void insert(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {
        SLL sl=new SLL();
        sl.insert(5);
        sl.insert(12);
        sl.insert(4);
        sl.insert(9);
        sl.insert(3);
        sl.display();
    }
}
