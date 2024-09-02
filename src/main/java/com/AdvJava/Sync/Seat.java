package com.AdvJava.Sync;

class Seat {
    int totalSeat=20;
    public  void bookSeat(int seat) throws Exception{
        //Thread.sleep(2000);
        synchronized (this){
            if(totalSeat>=seat){
                System.out.println(Thread.currentThread().getName());
                System.out.println(seat+" Booked seat successfully ");
                totalSeat=totalSeat-seat;
                System.out.println("Total seat left = "+totalSeat);
            }
            else{
                System.out.println(seat+" seat can't be Booked ");
            }
        }


    }
}

class SeatThread extends Thread{

    int seat;
    static Seat seatObj=new Seat();
    @Override
    public void run() {
        try {
            seatObj.bookSeat(seat);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {

        SeatThread thread1=new SeatThread();

        SeatThread thread2=new SeatThread();

        thread1.seat=14;
        thread2.seat=12;
        thread1.start();
        thread2.start();
    }
}



