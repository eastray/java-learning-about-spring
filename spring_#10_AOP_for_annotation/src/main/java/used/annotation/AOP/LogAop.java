package used.annotation.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {

	//@Pointcut("execution(public void get*(..))")			 // Public void인 모든 get으로 시작하는 메소드
	//@Pointcut("execution(* used.annotation.AOP.*.*())")		 // used.annotation.AOP 패키지에 파라미터가 없는 모든 메소드
	//@Pointcut("execution(* used.annotation.AOP..*.*())")	 // used.annotation.AOP 패키지 & used.annotation.AOP 하위 패키지에 파라미터가 없는 모슨 메소드
	//@Pointcut("execution(* used.annotation.AOP.Worker.*())") // used.annotation.AOP.Worker 안의 모든 메소드
	
	//@Pointcut("within(used.annotation.AOP.*)")				 // used.annotation.AOP 패키지 안에 있는 모든 메소드
	//@Pointcut("within(used.annotation.AOP..*)")				 // used.annotation.AOP 패키지 및 하위 패키지 안에 있는 모든 메소드
	//@Pointcut("within(used.annotation.AOP.Worker)")			 // used.annotation.AOP.Worker 모든 메소드
	
	//@Pointcut("bean(student)") 								 // student 빈에만 적용
	//@Pointcut("bean(*ker)")									 // ~ker로 끝나는 빈에만 적용
	
	@Pointcut("within(used.annotation.AOP.*)")
	private void pointcutMethod() {
		
	}
	
	@Around("pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println(signatureStr + " is start.");
		long st = System.currentTimeMillis();
		
		try {
			Object obj = joinpoint.proceed();
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished.");
			System.out.println(signatureStr + " 경과시간 : " + (et - st));
		}
	}
	
	@Before("within(used.annotation.AOP.*)")
	public void beforAdvice(){
		System.out.println("beforAdvice()");
	}
	
}
