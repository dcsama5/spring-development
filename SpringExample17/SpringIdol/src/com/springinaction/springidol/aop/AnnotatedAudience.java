/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.springidol.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author Administrator
 */
@Aspect
public class AnnotatedAudience {
    
    @Pointcut(
            "execution(* examples.Performer.*(..))")
    public void performance() {
        
    }
    
    @Before("performance()")
    public void takeSeats() {
        System.out.println("The audience is taking their seats");
}
    @Before("performance()")
    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }
    
    @AfterReturning("performance()")
    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }
    
    @AfterThrowing("performance()")
    public void demandRefund()
    {
        System.out.println("Boo! we want our money back");
    }
}