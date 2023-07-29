package com.AdvJava.Synchronization;

class BookSeat{
    int total_seat=10;
     synchronized void bookseat(int seat){
        if(total_seat>=seat){
            System.out.println(seat+" Seat booked successfully");
            total_seat=total_seat-seat;
            System.out.println("seat left = "+ total_seat);
        }
        else{
            System.out.println("seat cant booked ");
            System.out.println("seat left = "+ total_seat);
        }
    }
}
public class MethodSynchronization extends Thread {
    static BookSeat b=new BookSeat();;
    int seat;
    @Override
    public void run() {
        b.bookseat(seat);
    }

    public static void main(String[] args) {
//        b=new BookSeat();
        MethodSynchronization th=new MethodSynchronization();
        th.seat=7;
        th.start();

        MethodSynchronization th1=new MethodSynchronization();
        th1.seat=6;
        th1.start();
    }
}
