package com.AdvJava.MutliThreading;

public class DataInconsistency extends Thread{
    private static int count=0;
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(10); // Adjust this value as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }
    }

    public static void main(String[] args) {
        DataInconsistency t1=new DataInconsistency();
        DataInconsistency t2=new DataInconsistency();
        t1.start();
        t2.start();
        try {
            t1.join(); // Wait for t1 to complete
            t2.join(); // Wait for t2 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Print the count after both threads have completed
        System.out.println("Count: " + (t1.count + t2.count));
    }
}
