package com.esprit.alternance.projet_1.configuration;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {
    @AfterThrowing("execution(* com.esprit.alternance.projet_1.service.UniversiteServiceImpl.*(..))")
    public void logMethodExitAfterThrowingException(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        log.info("Execption thrown in method " + name + " : ");
    }

}
