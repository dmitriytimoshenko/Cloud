package Calculator.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect

public class Speaker {
    @Pointcut("execution(* Calculator.operations.Operation.calculate(..))")
            public void speaks() {}

  @Around("speaks()")
    public Object returnTimeOfRun(ProceedingJoinPoint point) throws Throwable {
            System.out.println("Сек.. вычисляю...");
            double start = System.currentTimeMillis();

            point.proceed();

            double end = System.currentTimeMillis();
            System.out.println("Вычисление выполнено!");
            System.out.println("Время рассчета: " + (end - start));


            return point.proceed();
    }
}