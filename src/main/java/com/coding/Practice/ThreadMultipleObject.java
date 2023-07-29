package com.coding.Practice;

// Java program of multithreading
// with static synchronized
class Display
{
    public static synchronized void wish(String name)
    {
        for(int i=0;i<3;i++)
        {
            System.out.print("Good Morning: ");
            System.out.println(name);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
            }
        }
    }
}

class MyThread extends Thread{
    Display d;
    String name;
    MyThread(Display d,String name)
    {
        this.d=d;
        this.name=name;
    }
    public void run()
    {
        d.wish(name);
    }
}

class Main{
    public static void main(String arg[])
    {
        Display d1=new Display();
        Display d2=new Display();
        MyThread t1=new MyThread(d1,"Dhoni");
        MyThread t2=new MyThread(d2,"Yuvaraj");
        t1.start();
        t2.start();
    }
}
