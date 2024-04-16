package com.SystemDesign;

public class MyHashMAP<K,V>{
    private static final int max_size=1<<4; //16
    private static final int max_Capacity=1<<30;    //Integer size is 2^31

    public ListNode[] hashTable;

    public MyHashMAP(int max_size){
        hashTable=new ListNode[max_size];
    }

//    public MyHashMap(int cap){
//        int capacity=tableSizeForCapacity(cap);
//        hashTable=new Entry[capacity];
//    }


    class ListNode<K,V>{
        public K key;
        public V value;
        public ListNode next;

        public ListNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put (K key,V value){
        int hashcode=key.hashCode() % hashTable.length;
        ListNode node=hashTable[hashcode];
        if(node==null){
            ListNode newNode=new ListNode(key,value);
            hashTable[hashcode]=newNode;
        }
        else{
            ListNode prev=node;
            while (node!=null){
                if (node.key==key){
                    node.value=value;
                    return;
                }
                prev=node;
                node=node.next;
            }
            ListNode newNode=new ListNode(key,value);
            prev.next=newNode;
        }
    }

    public V get(K key){
        int hashcode=key.hashCode() % hashTable.length;
        ListNode node=hashTable[hashcode];

        while (node!=null){
            if(node.key.equals(key)){
                return (V)node.value;
            }
            node=node.next;
        }
        return null;
    }
    public int size(){
        int n=hashTable.length;
        int count=0;
        for(int i=0;i<n;i++){
            ListNode node=hashTable[i];
            while (node!=null){
                count++;
                node=node.next;
            }
        }
        return count;
    }

    public void remove(K key) {
        int hashCode = key.hashCode() % hashTable.length;
        ListNode node = hashTable[hashCode];

        ListNode prev = null;
        while (node != null) {
            if (node.key.equals(key)) {
                if (prev == null) {
                    // If the node to be removed is the first node in the list
                    hashTable[hashCode] = node.next;
                } else {
                    // If the node to be removed is not the first node
                    prev.next = node.next;
                }
                return;
            }
            prev = node;
            node = node.next;
        }
    }



    public static void main(String[] args) {
        MyHashMAP<Integer,String> map=new MyHashMAP<>(10);
        map.put(1,"Shashyabh");
        map.put(2,"Shashi");
        map.put(3,"Shash");
        map.put(3,"Shashyabh");

//        System.out.println(map.get(3));
//        map.remove(3);
//        System.out.println(map.get(3));
//        System.out.println(map.get(2));
        System.out.println(map.size());
    }
}
