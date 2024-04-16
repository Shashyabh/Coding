package com.AdvJava.MutliThreading;

//public class MultiThreading extends Thread{
//    public void run(){
//        System.out.println("I am thread 1");
//    }
//
//    public static void main(String[] args) {
//        MultiThreading t1=new MultiThreading();
//        t1.start();
//    }
//}

public class MultiThreading implements Runnable{
     public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("I am thread "+i);
        }
    }

    public static void main(String[] args) {
        MultiThreading t1=new MultiThreading();
        Thread th=new Thread(t1);
        th.start();
        MultiThreading t2=new MultiThreading();
        Thread th2=new Thread(t2);
        th2.start();
    }
}


