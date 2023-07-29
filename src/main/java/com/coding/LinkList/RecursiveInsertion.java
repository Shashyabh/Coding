package com.coding.LinkList;

public class RecursiveInsertion {

    private Node head;
    private Node tail;
    private int size;
    public void RecursiveInsertion(){
        this.size=0;
    }

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
        System.out.println("Null");
    }

    public void recursiveSolution(int val,int index){
        head=recursion(val,index,head);
    }

    public Node recursion(int val,int index,Node node){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=recursion(val,index-1,node.next);
        return node;
    }

    public static void main(String[] args) {

        RecursiveInsertion sl=new RecursiveInsertion();
        sl.insert(5);
        sl.insert(12);
        sl.insert(4);
        sl.insert(9);
        sl.insert(3);
        sl.display();
        //sl.recursiveSolution(5,0);
        sl.recursiveSolution(65,2);
        sl.display();
    }
}
