package com.lg.demo.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class LoggingAspect {
    //@Before("execution(public * com.lg.demo.aop.aspectj.CustomerBo.addCustomer(..))")
    @Before("com.lg.demo.aop.aspectj.PointcutDefinition.customerLog()")
	public void logBefore(JoinPoint joinPoint){
    	System.out.println("logBefore() is running...");
    	System.out.println("hijacked:"+joinPoint.getSignature().getName());
    	System.out.println("**********");
    }
    //@After("execution(public * com.lg.demo.aop.aspectj.CustomerBo.deleteCustomer(..))")
    @After("com.lg.demo.aop.aspectj.PointcutDefinition.customerLog()")
    public void logAfter(JoinPoint joinPoint){
    	System.out.println("logAfter() is running ...");
        System.out.println("hijacked:"+joinPoint.getSignature().getName());
        System.out.println("**********");
    }
}
