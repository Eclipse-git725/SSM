package com.gxy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DataAdvice {
    @Pointcut("execution(boolean com.gxy.service.ResourceService.openURL(..))")
    private void servicePt(){

    }

    @Around("servicePt()")
    public Object trimStr(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            if(args[i].getClass().equals(String.class)){
                args[i] = args[i].toString().trim();
            }
        }

        Object ret = pjp.proceed(args);
        return ret;
    }
}
