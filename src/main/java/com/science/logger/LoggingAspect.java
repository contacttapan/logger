

package com.science.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Aspect for logging execution of service and repository Spring components.
 */
@Aspect
@Component
public class LoggingAspect  {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("within(com.science..*)")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
    	long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        logger.info(
          "{}|{}|{}",joinPoint.getSignature().getDeclaringTypeName(),
          MethodSignature.class.cast(joinPoint.getSignature()).getMethod().getName()
          ,System.currentTimeMillis() - start
        );
        return result;
    }
}
