package com.coding.DSA.LinkList;

public class SingleLinkList {

    private Node head;
    private Node tail;
    private int size;
    public SingleLinkList(){
        this.size=size;
    }

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

    public void insert(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertAtIndex(int index,int val){
        if(index==0){
            insert(val);
        }
        Node temp=head;
        Node tp=temp;
        for(int i=0;i<index;i++){
            temp=temp.next;
            tp=temp.next;
        }
        Node node=new Node(val);
        temp.next=node;
        node.next=tp;
        size++;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        SingleLinkList sl=new SingleLinkList();
        sl.insert(5);
        sl.insert(12);
        sl.insert(4);
        sl.insert(17);
        sl.insert(9);
        sl.insert(3);
        sl.display();
        sl.insertAtIndex(2,25);
        sl.display();
    }
}
