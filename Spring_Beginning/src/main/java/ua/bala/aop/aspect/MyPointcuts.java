package ua.bala.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
//    @Pointcut("execution(* get*())")
//    public void allGetMethods() {}

    @Pointcut("execution(* add*(..))")
    public void allAddMethods() {}
}
