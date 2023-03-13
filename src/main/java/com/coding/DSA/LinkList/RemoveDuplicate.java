package com.coding.DSA.LinkList;

public class RemoveDuplicate {
    public class Node{
        private int val;
        private Node next;

        public Node (int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
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

    public void duplicates(){
        Node temp=head;
        while(temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
                size--;
            }else {
                temp=temp.next;
            }
        }
        tail=temp;
        tail.next=null;
    }

    public static void main(String[] args) {
        RemoveDuplicate sl=new RemoveDuplicate();
        sl.insert(1);
        sl.insert(1);
        sl.insert(1);
        sl.insert(2);
        sl.insert(4);
        sl.insert(4);
        sl.display();
        sl.duplicates();
        sl.display();
//        sl.insert(4);
//        sl.display();

    }
}
