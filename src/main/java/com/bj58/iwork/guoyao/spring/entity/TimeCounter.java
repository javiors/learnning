package com.bj58.iwork.guoyao.spring.entity;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by javior on 2017/6/16.
 */
@Aspect
@Component
public class TimeCounter {


    @Pointcut("execution(* com.bj58.iwork.guoyao.spring.entity.CD.play(int)) && args(index)")
    public void point(int index){}

    @Before("point(index)")
    public void began(int index){
        System.out.println("loading cd"+index);
    }

    @Around("point(index)")
    public void count(ProceedingJoinPoint process,int index){
        try {
            System.out.println("hello"+index);
            process.proceed();
            //process.proceed();
            System.out.println("bye");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
