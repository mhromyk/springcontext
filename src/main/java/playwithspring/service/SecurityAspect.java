package playwithspring.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect
@Order(1)
public class SecurityAspect {

    private final Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    @Around("@annotation(ToLog)")
    public Object checkSecurity(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Executing checkSecurity logic from the Aspect BEFORE executing intercepted method");
        Object returnedValue = joinPoint.proceed();
        logger.info("Executing checkSecurity logic from the Aspect AFTER executing intercepted method");
        return returnedValue;
    }
}
