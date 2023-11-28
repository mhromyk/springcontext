package playwithspring.service;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Order(2)
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

//    @Around("execution(* playwithspring.service.*.*(..))")
    @Around("@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
//        logger.info("before method call");
//        joinPoint.proceed();
//        logger.info("after method call");
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        logger.info("The LoggingAspect is going to call method " + methodName + " with parameters " + Arrays.asList(arguments));
        Object returnedValue = joinPoint.proceed();
        logger.info("The LoggingAspect called the method " + methodName + " and received the returned value: " + returnedValue);
        return returnedValue;
    }
}
