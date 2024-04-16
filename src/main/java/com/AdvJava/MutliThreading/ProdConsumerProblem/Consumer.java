package com.AdvJava.MutliThreading.ProdConsumerProblem;

public class Consumer implements Runnable{
    Company c;
    Consumer(Company c){
        this.c=c;
    }
    @Override
    public void run() {
        try {
            for (int i=1;i<=10;i++){
                c.consume();
                //Thread.sleep(1000);
            }
        }
        catch (Exception e){

        }
    }
}
