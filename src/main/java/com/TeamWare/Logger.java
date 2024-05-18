package com.TeamWare;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogMethod {
    String value() default "";
}

class ExampleClass {
    @LogMethod("This is a logged method.")
    public void exampleMethod() {
        System.out.println("Executing exampleMethod...");
    }
    @LogMethod("This method is for logging Error")
    public void m1(){
        System.out.println("Logging Error");
    }
}

public class Logger {
    public static void logMethodDetails(Object obj) {
        Class<?> clazz = obj.getClass();
        for (var method : clazz.getDeclaredMethods()) {
            LogMethod logAnnotation = method.getAnnotation(LogMethod.class);
            String message = logAnnotation.value().isEmpty() ? "Method executed" : logAnnotation.value();
            System.out.println("Class: " + clazz.getName() + ", Method: " + method.getName() + ", Message: " + message);
        }
    }

    public static void main(String[] args) {
        ExampleClass example = new ExampleClass();
        example.exampleMethod();
        example.m1();
        logMethodDetails(example);
    }
}

