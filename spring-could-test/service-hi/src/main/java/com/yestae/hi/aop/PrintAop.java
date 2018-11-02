package com.yestae.hi.aop;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class PrintAop {
	@Pointcut("execution(public * com.yestae.hi.controller.*.*(..))")
	public void printLog(){}
	
	@Before("printLog()")
	public void before(JoinPoint joinPoint){
		
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes(); 
        HttpServletRequest request = attributes.getRequest(); 
        // 记录下请求内容
        System.err.println("-------------------日志开始-----------------");  
        System.err.println("URL : " + request.getRequestURL().toString());  
        System.err.println("HTTP_METHOD : " + request.getMethod());  
        System.err.println("IP : " + request.getRemoteAddr());  
        System.err.println("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());  
        System.err.println("ARGS : " + Arrays.toString(joinPoint.getArgs())); 
        System.err.println("KIND : " + joinPoint.getKind()); 
        System.err.println("TARGET : " + joinPoint.getTarget()); 
	}
	
	@After("printLog()")
	public void after(JoinPoint joinPoint) throws Throwable{
        // 记录下请求内容
        System.err.println("-------------------日志结束-----------------");  
	}
	
}
