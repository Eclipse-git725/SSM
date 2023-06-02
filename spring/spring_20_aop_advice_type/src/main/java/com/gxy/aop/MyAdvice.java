package com.gxy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    // @Pointcut("execution(void com.gxy.dao.BookDao.update())")
    // @Pointcut("execution(* com.gxy.dao.BookDao.update())")
    // @Pointcut("execution(void *..BookDao.update())")
    @Pointcut("execution(void com.gxy.*.*Dao.update())")
    private void pt(){}
    @Pointcut("execution(int com.gxy.*.*Dao.select())")
    private void pt2(){}

    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }

    @Around("pt2()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice...");
        // 表示对原始操作的调用
        Object res = pjp.proceed();
        System.out.println("around after advice...");
        return res;
    }
}
