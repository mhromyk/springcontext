package playwithspring.service;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* playwithspring.service.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
//        logger.info("before method call");
//        joinPoint.proceed();
//        logger.info("after method call");
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        logger.info("The Aspect is going to call method " + methodName + " with parameters " + Arrays.asList(arguments));
        Object returnedValue = joinPoint.proceed();
        logger.info("The Aspect called the method " + methodName + " and received the returned value: " + returnedValue);
        return returnedValue;
    }
}
