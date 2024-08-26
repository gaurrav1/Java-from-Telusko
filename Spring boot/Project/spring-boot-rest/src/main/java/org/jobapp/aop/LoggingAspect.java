package org.jobapp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    // Return type, class name, method name, arguments(args)
    // * *.*(..) -- THis may produce for all class available in project so please specify your service class

    @Before("execution(* org.jobapp.service.JobService.getJob(..)) || execution(* org.jobapp.service.JobService.updateJob(..))")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Method called!!!!!" + jp.getSignature().getName());
    }

    // It will behave like finally block
    @After("execution(* org.jobapp.service.JobService.getJob(..)) || execution(* org.jobapp.service.JobService.updateJob(..))")
    public void logMethodExecuted(JoinPoint jp) {
        LOGGER.info("Method Executed!!!!!" + jp.getSignature().getName());
    }

    // If there is error than this will execute
    @AfterThrowing("execution(* org.jobapp.service.JobService.getJob(..)) || execution(* org.jobapp.service.JobService.updateJob(..))")
    public void logMethodCrashed(JoinPoint jp) {
        LOGGER.info("Method has some issues!!!!!" + jp.getSignature().getName());
    }

    // If there is no exception, this will execute
    @AfterReturning("execution(* org.jobapp.service.JobService.getJob(..)) || execution(* org.jobapp.service.JobService.updateJob(..))")
    public void logMethodExecutedSuccessfully(JoinPoint jp) {
        LOGGER.info("Method has executed successfully!!!!!" + jp.getSignature().getName());
    }

}
