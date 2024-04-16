package com.AdvJava.MutliThreading.ProdConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;

public class Company {

    Queue<Integer> queue;
    int capacity;
    Company(int capacity){
        queue=new LinkedList<>();
        this.capacity=capacity;
    }


    public synchronized void produce(int i){
        while (capacity==queue.size()){
            try{
                System.out.println("Queue is full .... Wait for consumed some item");
                wait();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        queue.add(i);
        System.out.println("Produced Item : "+ i);
        notifyAll();
    }

    public synchronized int consume(){
        while(queue.size()==0){
            try{
                System.out.println("Queue is Empty .... Wait for produce some item");
                wait();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

        int consumedItem=queue.poll();
        System.out.println("Consumed Item : "+consumedItem);
        notifyAll();
        return consumedItem;
    }
}
