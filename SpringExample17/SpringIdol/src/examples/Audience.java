/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 *
 * @author Administrator
 */

public class Audience {
    
    /**
     * This is the aspect class from where we 
     * @param joinpoint 
     */
    public void watchPerformance(ProceedingJoinPoint joinpoint) throws Throwable 
    { 
        
      
        System.out.println("Entering the join point...");
        System.out.println("....");
        joinpoint.proceed();
        Object performer = joinpoint.getThis();
        System.out.println(performer);
        System.out.println("Returning...");
      
      
       
    }
    

}