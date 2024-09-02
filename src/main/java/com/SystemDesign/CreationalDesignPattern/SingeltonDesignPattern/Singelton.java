package com.SystemDesign.CreationalDesignPattern.SingeltonDesignPattern;


final public class Singelton implements Cloneable{

   private static Singelton singelton=null;

    private Singelton(){
        //Reflection code part to resolve the Singelton

        // Check if an instance already exists
        if (singelton != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static Singelton newInstance(){
        if(singelton==null){
            singelton= new Singelton();
        }
        return singelton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();

        //Cloning code part to resolve the Singelton
        return singelton;
    }
}

