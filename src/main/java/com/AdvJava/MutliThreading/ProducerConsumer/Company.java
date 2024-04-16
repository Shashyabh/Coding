package com.AdvJava.MutliThreading.ProducerConsumer;

public class Company {
    int n;
    boolean flag=false;

    public synchronized void produceItem(int n){
        if(flag==true){
            try{
                wait();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        this.n=n;
        System.out.println("Produced Item : "+ this.n);
        flag=true;
        notify();
    }

    public synchronized int consumeItem(){
        if(!flag){
            try{
                wait();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

        System.out.println("Consumed Item : "+ this.n);
        flag=false;
        notify();
        return this.n;
    }
}
