package com.coding.DSA.LinkList;

public class DeleteMiddleNode {

    public class Node{
        int val;
        Node next;

        public Node(int val) {
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

    int count=0;
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
            count++;
        }
        System.out.println("Null");
    }

    public void deleteMidNode(){
        Node prev=null;
        Node curr=head;
        for (int i=0;i<count/2;i++){
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;
    }

    public void deleteLast(){
        int n=3;
        Node prev=null;
        Node curr=head;
        for (int i=0;i<count-n;i++){
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;
    }

    public void delete(){
        Node f=head;
        Node s=head;
        Node prev=null;
        while (f!=null&&f.next!=null){
            f=f.next.next;
            prev=s;
            s=s.next;
        }
        prev.next=s.next;
    }

    public static void main(String[] args) {
        DeleteMiddleNode sl=new DeleteMiddleNode();
        sl.insert(1);
        sl.insert(2);
        sl.insert(3);
        sl.insert(4);
        sl.insert(21);

        sl.display();
//        sl.deleteMidNode();
        //sl.delete();
        //sl.deleteLast();
        sl.display();
    }
}
