package com.neww;

import java.lang.reflect.Constructor;

public class TestSingelton {

    public static void main(String[] args) throws Exception {

        Singelton singelton=Singelton.newInstance();
        System.out.println(singelton.hashCode());
        Singelton singelton1=Singelton.newInstance();
        System.out.println(singelton1.hashCode());

        //Reflection code part to break the Singelton

//        Constructor<Singelton> constructor = Singelton.class.getDeclaredConstructor();
//
//        constructor.setAccessible(true);
//        System.out.println(constructor.newInstance().hashCode());

        Singelton singelton2 = (Singelton) singelton1.clone();
        System.out.println(singelton2.hashCode());
    }
}
