package com.example.demo.chapter03.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Aspect
@Component
public class SampleAspect {

    @Before("execution(* com.example.demo.chapter03.used.Greet.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("======= Before Advice ======");

        // 날짜 출력
        System.out.println(new SimpleDateFormat("yyyy/mm/dd").format(new java.util.Date()));
        // 메소드 이름 출력
        System.out.println(String.format("메소드 : %s", joinPoint.getSignature().getName()));
    }

    @After("execution(* com.example.demo.chapter03.used.*Greet.*(..))")
    public void AfterAdvice(JoinPoint joinPoint) {
        // 메소드 이름 출력
        System.out.println(String.format("메소드 : %s", joinPoint.getSignature().getName()));
        // 날짜 출력
        System.out.println(new SimpleDateFormat("yyyy/mm/dd").format(new java.util.Date()));

        System.out.println("======= After Advice ======");
    }

    @Around("execution(* com.example.demo.chapter03.used.Greet.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("======= Around Advice ======");
        System.out.println(" -- 처리전 -- ");

        // 지정 클래스 메소드 실행
        Object result = joinPoint.proceed();

        System.out.println(" -- 처리후 -- ");
        System.out.println("======= Around Advice ======");
        return result;
    }
}
