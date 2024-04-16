package com.AdvJava.MutliThreading.ProducerConsumer;

public class Main {
    public static void main(String[] args) {
        Company c=new Company();
        Producer producer=new Producer(c);
        Consumer consumer=new Consumer(c);
        Thread t1=new Thread(producer);
        Thread t2=new Thread(consumer);
        t1.start();
        t2.start();
    }
}
