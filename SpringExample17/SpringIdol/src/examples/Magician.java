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
public class Magician implements MindReader {
    
    
    private String thoughts;
   
    
    /**
     * I don't think you are allowed to have arg-names with AOP around
     * @param thoughts 
     */
    /*public void interceptThoughts(ProceedingJoinPoint joinpoint, String thoughts)throws Throwable {
        System.out.println("BEGIN OF AROUND METHOD. Entered intercept thoughts method. ");
        joinpoint.proceed();
        System.out.println("End of aspect");
    }*/

    public void interceptThoughts(String thoughts) {
        
        System.out.println("HI THERE");
        this.thoughts = thoughts;
    }
    
}
