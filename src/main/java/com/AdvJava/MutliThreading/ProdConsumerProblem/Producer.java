package com.AdvJava.MutliThreading.ProdConsumerProblem;

public class Producer implements Runnable{
    Company c;
    Producer(Company c){
        this.c=c;
    }
    @Override
    public void run() {
        try {
            for (int i=1;i<=10;i++){
                c.produce(i);
                //Thread.sleep(1000);
            }
        }
        catch (Exception e){

        }
    }
}
