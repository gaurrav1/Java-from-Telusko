package org.jobapp.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitorAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceMonitorAspect.class);

    @Around("execution(* org.jobapp.service.JobService.getJob(..)) || execution(* org.jobapp.service.JobService.getAllJobs(..))")
    public Object monitorTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Long start = System.currentTimeMillis();

        Object obj = proceedingJoinPoint.proceed();

        Long end = System.currentTimeMillis();

        LOGGER.info("Time taken by "+ proceedingJoinPoint.getSignature().getName() + ": " + (end-start) + "ms");

        return obj;
    }

}
