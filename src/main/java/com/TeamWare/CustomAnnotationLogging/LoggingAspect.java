package com.TeamWare.CustomAnnotationLogging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Pointcut("@annotation(Loggable)")
    public void loggableMethod() {}

    @AfterReturning(pointcut = "loggableMethod()", returning = "result")
    public void logMethodCall(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String arguments = Arrays.toString(joinPoint.getArgs());
        String returnValue = (result != null) ? result.toString() : "void";

        logger.info("Method " + methodName + " in class " + className + " called with arguments " + arguments + " and returned " + returnValue);
    }
}
