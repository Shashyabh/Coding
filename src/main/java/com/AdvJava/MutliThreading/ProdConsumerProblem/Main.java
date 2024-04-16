package com.AdvJava.MutliThreading.ProdConsumerProblem;

public class Main {

    public static void main(String[] args) {
            Company c=new Company(3);
            Consumer consumer=new Consumer(c);
            Producer producer=new Producer(c);

            Thread t1=new Thread(producer);
            Thread t2=new Thread(consumer);
            t1.start();
            t2.start();
    }
}
