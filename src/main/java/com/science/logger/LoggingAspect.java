

package com.science.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Aspect for logging execution of service and repository Spring components.
 */
@Aspect
public class LoggingAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("within(com.science..*)")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
    	long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        logger.info(
          "#%s(%s): %s in %[msec]s",
          MethodSignature.class.cast(joinPoint.getSignature()).getMethod().getName(),
          joinPoint.getArgs(),
          result,
          System.currentTimeMillis() - start
        );
        return result;
    }
}
