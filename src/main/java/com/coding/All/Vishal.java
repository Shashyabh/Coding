package com.coding.All;

public class Vishal {

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
    //1->2
    public void insert(int val){
        Node node =new Node(val);
        if(head==null){
            head=node;
            tail=head;
        }
        //node.next=head ,,,head=node
        tail.next=node;
        tail=node;
        size++;
    }
    void disp(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public void cycleInsert(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        tail.next=temp;
    }

    public boolean cycicloop(){
        Node f=head;
        Node s=head;
        while(f!=null&&s!=null){
            s=s.next;
            f=f.next.next;
            if(f==s){
                return true;
            }
        }
        return false;
    }

    public int findlength(){
        Node f=head;
        Node s=head;
        int len=0;
        while(f!=null && s!=null){
            do{
                len++;
                s=s.next;
                f=f.next.next;
            }while (f!=s);
            return len;
        }
        return 0;
    }

    public void findNode(){
        Node f=head;
        Node s=head;
        Node temp=null;
        Node slow=head;
        while(f!=null&&s!=null){
            s=s.next;
            f=f.next.next;
            if(f==s){
                temp=s;
                break;
            }

        }
        while (slow!=temp){
            slow=slow.next;
            temp=temp.next;
        }
        System.out.println(temp.val);
    }

    public static void main(String[] args) {
        Vishal v=new Vishal();
        v.insert(1);
        v.insert(2);
        v.insert(3);
        v.insert(4);
        v.insert(5);
        v.insert(6);
        v.insert(7);
        v.insert(8);
        v.disp();
        v.cycleInsert(3);
        System.out.println(v.cycicloop());
        int ch=v.findlength();
        System.out.println(ch);
        v.findNode();
    }
}
