package com.lyun55.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPoingcutConfig {
	
	@Pointcut("execution(* com.lyun55.learn_spring_aop.aopexample.*.*.*(..))")
	public void businessAndDataPackageConfig() {}
	
	@Pointcut("execution(* com.lyun55.learn_spring_aop.aopexample.business.*.*(..))")
	public void businessPackageConfig() {}
	
	@Pointcut("execution(* com.lyun55.learn_spring_aop.aopexample.data.*.*(..))")
	public void dataPackageConfig() {}

	@Pointcut("bean(*Service*)")
	public void allPackageConfigUsingBean() {}
	
	@Pointcut("@annotation(com.lyun55.learn_spring_aop.aopexample.annotations.TrackTime)")
	public void trackTImeAnnotation() {}
}
