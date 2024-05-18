package com.AdvJava.Synchronization;

class Thread1 extends Thread{
    Book b;
    int seat;
    public Thread1(Book b,int seat){
        this.b=b;
        this.seat=seat;
    }
    public void run() {
        b.bookseat(seat);
    }
}

class Thread2 extends Thread{
    Book b;
    int seat;
    public Thread2(Book b,int seat){
        this.b=b;
        this.seat=seat;
    }
    public void run() {
        b.bookseat(seat);
    }
}

class Book{
    int total_seat=20;
    void bookseat(int seat){
        if(total_seat>=seat){
            System.out.println(seat+" Seat booked successfully with " +Thread.currentThread().getName());
            total_seat=total_seat-seat;
            System.out.println("seat left = "+ total_seat);
        }
        else{
            System.out.println(seat+" seat cant booked ");
            System.out.println("seat left = "+ total_seat);
        }
    }
}

public class ClassSynchronization {
    public static void main(String[] args) {
        Book b=new Book();
        Thread1 th1=new Thread1(b,7);
        th1.start();

        Thread2 th2=new Thread2(b,6);
        th2.start();

        Book b1=new Book();
        Thread1 thr1=new Thread1(b1,5);
        thr1.start();

        Thread2 thr2=new Thread2(b1,9);
        thr2.start();
    }
}

