package com.esprit.alternance.projet_1.configuration;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class PerformanceAspect {
    @Before("execution(* com.esprit.alternance.projet_1.service.EtudiantServiceImpl.*(..))")
    public void logMethodEntry(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }
    @After("execution(* com.esprit.alternance.projet_1.service.EtudiantServiceImpl.*(..))")
    public void logMethodExit(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        log.info("After method " + name + " : ");
    }
    @AfterReturning("execution(* com.esprit.alternance.projet_1.service.EtudiantServiceImpl.*(..))")
    public void logMethodExitAfterExecution(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        log.info("Method executed successfully " + name + " : ");
    }
    @AfterThrowing("execution(* com.esprit.alternance.projet_1.service.EtudiantServiceImpl.*(..))")
    public void logMethodExitAfterThrowingException(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        log.info("Execption thrown in method " + name + " : ");
    }
    @Around("execution(* com.esprit.alternance.projet_1.service.EtudiantServiceImpl.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime + " milliseconds.");
        return obj;
    }
}
