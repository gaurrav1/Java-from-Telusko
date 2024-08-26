package org.jobapp.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* org.jobapp.service.JobService.getJob(..)) && args(postId)")
    public Object validateUpdate(ProceedingJoinPoint proceedingJoinPoint, int postId) throws Throwable {

        if(postId < 0 ) {
            postId = -postId;
        }

        Object obj = proceedingJoinPoint.proceed(new Object[]{postId});
        return obj;
    }
}
