package com.lyun55.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceTrackingAspect {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	
	//@Around("com.lyun55.learn_spring_aop.aopexample.aspects.CommonPoingcutConfig.businessAndDataPackageConfig()")
	@Around("com.lyun55.learn_spring_aop.aopexample.aspects.CommonPoingcutConfig.trackTImeAnnotation()")
	public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		// timer
		long startTimeMillis = System.currentTimeMillis();
		
		Object returnValue = proceedingJoinPoint.proceed();
		
		long stopTimeMillis = System.currentTimeMillis();
		
		long executionDuration = stopTimeMillis - startTimeMillis;
		
		logger.info("Around Aspect - {} Method executed in {}",proceedingJoinPoint,executionDuration);
		
		return returnValue;
	}
	

}
