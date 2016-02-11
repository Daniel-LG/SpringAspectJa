package com.lg.demo.aop.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class PointcutDefinition {
    @Pointcut("execution(* com.lg.demo.aop.aspectj.CustomerBo.*(..))")
    public void customerLog(){
    }
}
