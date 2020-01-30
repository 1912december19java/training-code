package com.revature.books.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private static final Logger log = Logger.getLogger(LoggingAspect.class);
	
	@Before("within(com.revature.books..*)")
	public void logMethods(JoinPoint jp) {
		log.info("Target: " + jp.getTarget() + ", Signature: " + jp.getSignature());
	}
	
	/*
	 * Demo methods follow -- commented out because they are a bother.
	 */
//	
//	/**
//	 * Before all methods in the AuthorService, sysout the method signature
//	 * @param jp
//	 */
//	@Before(value = "within(com.revature.books.services.AuthorService)")
//	public void sysoutMethods(JoinPoint jp) {
//		System.out.println("Join Point signature: " + jp.getSignature());
//	}
//	
//	/**
//	 * Before all methods, regardless of name or return
//	 */
//	@Before(value = "execution(* * (..))")
//	public void sysoutMethodsTwo(JoinPoint jp) {
//		sysoutMethods(jp);
//	}
//	
//	//Match out getAll methods in the service layer
//	@Around("execution(* getAll ())")
//	public Object interruptServiceFunctionality(ProceedingJoinPoint pjp) throws Throwable {
//		System.out.println("Before pjp");
//		Object returned = null;
//		try {
//			returned = pjp.proceed(); // lets the method call happen
//		} catch (Throwable e) {
//			e.printStackTrace();
//			throw e;
//		} 
//		System.out.println("After pjp");
//		return returned;
//	}
//
//	
//	//Check execution time
//	@Around("execution(* * (..))")
//	public Object monitorExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
//		long start = System.nanoTime();
//		long end;
//		
//		Object returned = null;
//		try {
//			returned = pjp.proceed();
//			end = System.nanoTime();
//			System.out.println("Execution time of " + pjp.getSignature() +
//					": " + (end-start) + "ns");
//		} catch(Exception e) {
//			end = System.nanoTime();
//			System.out.println("Execution time of " + pjp.getSignature() +
//					": " + (end-start) + "ns");
//			throw e;
//		}
//		
//		return returned;
//	}
	
}
 