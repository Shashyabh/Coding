package com.coding.LinkList;

public class CycleDetection {
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
        Node node =new Node(val);
        if(head==null){
            head=node;
            tail=head;
        }
        tail.next=node;
        tail=node;
        size++;
    }

    public void makeCyclic(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        tail.next=temp;
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public boolean hasCycle(){
        Node f=head;
        Node s=head;
        while (f!=null && s!=null){
            f=f.next.next;
            s=s.next;
            if(f==s){
                return true;
            }
        }
        return false;
    }

    public int lengthofCycle(){
        Node f=head;
        Node s=head;
        while(f!=null&&s!=null){
            f=f.next.next;
            s=s.next;
            if(f==s){
                int len=0;
                Node temp=s;
                do{
                    len++;
                    temp=temp.next;
                }
                while(temp!=s);
                return len;
            }
        }
        return 0;
    }

    public void fisrtCyclicNode(){
        int len=lengthofCycle();
        Node f=head;
        Node s=head;
        while(len>0){
            s=s.next;
            len--;
        }
        while(f!=s){
            s=s.next;
            f=f.next;
        }
        System.out.println(s.val);
    }

    public static void main(String[] args) {
        CycleDetection sl=new CycleDetection();
        sl.insert(1);
        sl.insert(2);
        sl.insert(3);
        sl.insert(4);
        sl.insert(5);
        sl.insert(6);
        sl.insert(7);
        sl.insert(8);
        sl.display();
        sl.makeCyclic(3);
        System.out.println(sl.hasCycle());
        int ch=sl.lengthofCycle();
        System.out.println(ch);
        sl.fisrtCyclicNode();
    }
}
