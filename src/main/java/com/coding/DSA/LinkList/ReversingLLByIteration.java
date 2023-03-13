package com.coding.DSA.LinkList;

public class ReversingLLByIteration {

    public class Node{
        int val;
        Node next;

        public Node(int val){
            this.val=val;
        }

        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void setSize(int size) {
        this.size = 0;
    }
    
    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=head;
        }

        tail.next=node;
        tail=node;
        size++;
    }

    public void display(){
        Node temp=head;

        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public void reverse(){
        if (size<2){
            return;
        }
        Node prev=null;
        Node present=head;
        Node next=head.next;

        while (present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if (next!=null){
                next=next.next;
            }
        }
        head=prev;
    }

    public static void main(String[] args) {
        ReversingLLByIteration sl=new ReversingLLByIteration();
        sl.insert(5);
        sl.insert(7);
        sl.insert(12);
        sl.insert(3);
        sl.insert(21);
        sl.display();
        sl.reverse();;
        sl.display();
    }
}
