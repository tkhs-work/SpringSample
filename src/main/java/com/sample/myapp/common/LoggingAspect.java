package com.sample.myapp.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.sample.myapp.service..*.*(..))")
    public void beforeIntercepter(JoinPoint joinPoint) {
        System.out.println("★Before："
                + joinPoint.getTarget().getClass().toString()
                + ", "
                + joinPoint.getSignature().getName());
    }

    @After("execution(* com.sample.myapp.service..*.*(..))")
    public void afterIntercepter(JoinPoint joinPoint) {
        System.out.println("★After："
                + joinPoint.getTarget().getClass().toString()
                + ", "
                + joinPoint.getSignature().getName());
    }
}
