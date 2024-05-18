package com.TeamWare.CustomAnnotationLogging;

public class MyClass {

    //LoggingAspect loggingAspect=new LoggingAspect();
    @LogMethod
    public void performOperation(){
        System.out.println("Hi Logging Details");
    }
}
