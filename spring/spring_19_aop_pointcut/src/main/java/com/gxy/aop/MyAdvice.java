package com.gxy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    // @Pointcut("execution(void com.gxy.dao.BookDao.update())")
    // @Pointcut("execution(* com.gxy.dao.BookDao.update())")
    // @Pointcut("execution(void *..BookDao.update())")
    @Pointcut("execution(void com.gxy.*.*Dao.update())")
    private void pt(){}

    // @Before("pt()")
    public void before(){
        System.out.println("before advice...");
    }

    // @After("pt()")
    public void after(){
        System.out.println("after advice...");
    }

    //最常用
    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice...");
        // 表示对原始操作的调用
        pjp.proceed();
        System.out.println("around after advice...");
    }


}
