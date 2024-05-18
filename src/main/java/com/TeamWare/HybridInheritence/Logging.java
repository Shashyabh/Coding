package com.TeamWare.HybridInheritence;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@interface LogAnnotation{
    String value() default "";
}


class LogClass{
    @LogAnnotation("This is my Logging class for info")
    public void info(){
        System.out.println("Hi This is the Logging class for Info");
    }

    @LogAnnotation("This is my Logging class for debug")
    public void debug(){
        System.out.println("Hi This is the Logging class for debug");
    }

    @LogAnnotation("This is my Logging class for error")
    public void error(){
        System.out.println("Hi This is the Logging class for error");
    }

    @LogAnnotation("This is my Logging class for warning")
    public void warn(){
        System.out.println("Hi This is the Logging class for warn");
    }
}

public class Logging {
    public static void myLogDetails(Object o){
        Class<?> oClass = o.getClass();

        for (var method:oClass.getDeclaredMethods()){
            LogAnnotation annotation = method.getAnnotation(LogAnnotation.class);
//            if (annotation==null){
//                continue;
//            }
            String message=annotation.value()==null?"Write Annotation": annotation.value();
            System.out.println("Log class : "+oClass.getSimpleName()+" , "+"Log Method : "+method.getName()+" , "+"Message : "+message);
        }
    }

    public static void main(String[] args) {
        LogClass logClass=new LogClass();
        logClass.info();
        logClass.debug();
        logClass.warn();
        logClass.error();
        Logging.myLogDetails(logClass);
    }
}
